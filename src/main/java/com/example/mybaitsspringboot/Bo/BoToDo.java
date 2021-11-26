package com.example.mybaitsspringboot.Bo;

import com.example.mybaitsspringboot.Do.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author: MA
 * @Date: 2021/11/25 9:29
 *
 * MapStruct定义的接口,此接口用于前端Dto转换成Do操作
 * 这里的@Mapper必须是 import org.mapstruct.Mapper
 */
@Mapper
public interface BoToDo {
    /**
     * 按照惯例，从工厂中检索每个映射器的单个实例，并通过声明一个名为INSTANCE的成员在映射器接口类型上公开
     * import org.mapstruct.Mapping
     *     配置一个 bean 属性或枚举常量的映射。
     *     映射属性或常量的名称将通过target()指定,生成的映射方法是否应忽略通过target()指定的属性。
     *      ignore = true 当某些属性不应从源或目标传播时，或者当目标对象中的属性使用装饰器填充时，这会很有用，因此默认情况下将报告为未映射的目标属性
     *      对于映射的 bean 属性，默认情况下假定该属性在源 bean 中具有相同的名称。 或者，可以指定source()来源
     */
    BoToDo INSTANCE = Mappers.getMapper(BoToDo.class);

    /**
     * BO to DO
     * @param addUserBo 添加用户的业务逻辑对象
     * @return User
     */
    @Mappings({@Mapping(target = "userId", ignore = true),
            @Mapping(target = "updateTime",ignore = true),
            @Mapping(target = "createTime", ignore = true),
            @Mapping(target = "imagePath", ignore = true)})
    User toDoUser(AddUserBo addUserBo);

    /**
     * BO to DO
     * @param addUserBo 添加用户的业务逻辑对象
     * @return UserRole
     */
    @Mapping(target = "userId", ignore = true)
    UserRole toDoRole(AddUserBo addUserBo);

    /**
     * BO to DO
     * @param addUserBo 添加用户的业务逻辑对象
     * @return UserDepartment
     */
    @Mapping(target = "userId", ignore = true)
    UserDepartment toDoDepartment(AddUserBo addUserBo);

}
