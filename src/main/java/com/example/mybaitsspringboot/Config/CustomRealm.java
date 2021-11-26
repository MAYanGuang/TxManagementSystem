package com.example.mybaitsspringboot.Config;


import com.example.mybaitsspringboot.Do.User;
import com.example.mybaitsspringboot.Dao.AuthorityDao;
import com.example.mybaitsspringboot.Dao.RoleDao;
import com.example.mybaitsspringboot.Dao.UserDao;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Set;

/**
 * 自定义 shiro Realm
 *
 * @Author: chenping
 * @Date: 2019/8/18
 */
public class CustomRealm extends AuthorizingRealm {

    @Autowired(required = false)
    UserDao userDao;

    @Autowired(required = false)
    AuthorityDao authorityDao;

    @Autowired(required = false)
    RoleDao roleDao;

    /**
     * 授权   登陆后（认证通过后）访问某个功能或者菜单做授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String userName = (String) principalCollection.getPrimaryPrincipal();
        //根据用户名查询角色信息
        User user = userDao.selectByName(userName);
        //得到该用户所有角色名称
        Set<String> roles = roleDao.selectRole_namesByUserId(user.getUserId());
        //得到该用户所有权限
        //此处一层子查询
        Set<String> authorityNames = authorityDao.selectAuthorityNameByRoleId(roleDao.selectRole_idsByUserId(user.getUserId()));
        //授权对象
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //放入角色信息
        simpleAuthorizationInfo.setRoles(roles);
        //放入权限信息
        simpleAuthorizationInfo.setStringPermissions(authorityNames);
        //返回该授权对象
        return simpleAuthorizationInfo;


    }


    /**
     * 认证--- 首次登陆的时候做认证操作
     * 用户名、密码
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从主体传递的认证信息中获取用户名
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        //通过用户名去数据库获取用户信息
        User user = null;
        try {
            user = userDao.selectByName(userName);
        } catch (NullPointerException e) {
            throw new UnknownAccountException();
        }


        if (!password.equals(user.getPassword())) {

            throw new IncorrectCredentialsException();
        }
        String realName = this.getName();

        /**
         * 实现，一个账号只能同时一个用户登录
         * 在一个浏览器登陆后，再在其他浏览器或其他地方登陆会将之前的登陆状态销毁，之前登陆的用户再次点击菜单会回到登陆页面
         * 需要设置自定义shiroSessionManager
         */
        DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
        DefaultWebSessionManager sessionManager = (DefaultWebSessionManager) securityManager.getSessionManager();
        Collection<Session> sessions = sessionManager.getSessionDAO().getActiveSessions();
        //在一个浏览器中，登陆之后再次登陆不移除session，移除会报错误
        if (sessions.size() > 1) {
            for (Session session : sessions) {
                if (userName.equals(String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY)))) {
                    sessionManager.getSessionDAO().delete(session);
                }
            }
        }
        System.out.println("userName" + userName + "11110" + realName);
        SimpleAuthenticationInfo simpleAccountRealm =
                new SimpleAuthenticationInfo(
                        userName,
                        user.getPassword(),
                        realName);
        System.out.println("token独享" + authenticationToken);
        /**
         * 保存登陆认证后的信息session值
         */

//        this.setSessionValue(user);

        return simpleAccountRealm;
    }

//    /**
//     * @Description:  设置用户session
//     * @param: mgmtUser
//     * @return: void
//     * @Author: chenping
//     * @Date: 2019/11/20
//     */
//    private void setSessionValue(User mgmtUser) {
//        Session session = shiroSessionService.getSession();
//        Integer userId = mgmtUser.getId();
//        String userName = mgmtUser.getName();
////        Integer roleId = mgmtUser.getType();
////        Integer ownerCode = Integer.parseInt(mgmtUser.getOwnerCode());
////        String partnerId = mgmtUser.getPartnerId();
//        session.setAttribute(SessionConst.SESSION_USER_ID, userId);
//        session.setAttribute(SessionConst.SESSION_USER_NAME, userName);
//        session.setAttribute(SessionConst.SESSION_USER, mgmtUser);
////        session.setAttribute(SessionConst.SESSION_ROLE_ID, roleId);
////        session.setAttribute(SessionConst.SESSION_OWNER_CODE, ownerCode);
////        session.setAttribute(SessionConst.SESSION_PARTNER_ID, partnerId);
//    }

//    /**
//     * 根据用户名查询用户
//     * @param userName
//     * @return
//     */
//    private User getUser(String userName) {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name",userName);
//        if (null == userMapper.selectOne(queryWrapper)) {
//            return null;
//        }
//        return userMapper.selectOne(queryWrapper);
//    }
//
//    /**
//     * 获取用户的角色值
//     * @param userName
//     * @return
//     */
//    private Set<String> getRoleByUserName(String userName) {
//        List<String> names = roleService.selectRoleNames(userName);
//        Set<String> roles = new HashSet<>(names);
//
//        return roles;
//    }
//
//    /**
//     * 获取登陆用户的所有权限
//     * @param userName
//     * @return
//     */
//    private Set<String> getPermissionsByUserName(String userName) {
//        Set<String> permissions = roleService.selectPermissions(userName);
//        return permissions;
//
//    }
}
