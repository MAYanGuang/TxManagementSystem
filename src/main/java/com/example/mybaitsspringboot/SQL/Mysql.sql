drop table if exists authority;
create table authority
(
    authority_id   int         not null
        primary key,
    authority_king varchar(30) not null
);

INSERT INTO backstagemanagement.authority (authority_id, authority_king)
VALUES (1, '超级管理');
INSERT INTO backstagemanagement.authority (authority_id, authority_king)
VALUES (2, '通用管理');
INSERT INTO backstagemanagement.authority (authority_id, authority_king)
VALUES (3, '部门管理');
INSERT INTO backstagemanagement.authority (authority_id, authority_king)
VALUES (4, '普通权限');


drop table if exists department;
create table department
(
    Department_id   int         not null
        primary key,
    Department_name varchar(20) not null
);

INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (1, '董事会');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (2, '人事部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (3, '财务部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (4, '研发部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (5, '测试部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (6, '市场部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (7, '运维部');
INSERT INTO backstagemanagement.department (Department_id, Department_name)
VALUES (8, '保安部');


drop table if exists department_role;
create table department_role
(
    department_id int null,
    role_id       int null
);

INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (1, 1);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (1, 2);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (2, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (2, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (3, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (3, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (4, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (4, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (5, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (5, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (6, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (6, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (7, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (7, 4);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (8, 3);
INSERT INTO backstagemanagement.department_role (department_id, role_id)
VALUES (8, 4);



drop table if exists role;
create table role
(
    role_id   int         not null
        primary key,
    role_name varchar(20) not null
);

INSERT INTO backstagemanagement.role (role_id, role_name)
VALUES (1, '超级管理员');
INSERT INTO backstagemanagement.role (role_id, role_name)
VALUES (2, '董事长');
INSERT INTO backstagemanagement.role (role_id, role_name)
VALUES (3, '部门经理');
INSERT INTO backstagemanagement.role (role_id, role_name)
VALUES (4, '普通员工');



drop table if exists role_authority;
create table role_authority
(
    authority_id int null,
    role_id      int null
);

INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (1, 1);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (2, 1);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (3, 1);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (4, 1);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (1, 2);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (2, 2);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (3, 2);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (4, 2);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (3, 3);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (4, 3);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (3, 4);
INSERT INTO backstagemanagement.role_authority (authority_id, role_id)
VALUES (4, 4);



create table user
(
    user_id      int auto_increment,
    name         varchar(255) not null,
    password     varchar(255) not null,
    nickname     varchar(20)  not null,
    gender       varchar(2)   null,
    state        varchar(10)  not null,
    phone_number varchar(15)  null,
    email        varchar(30)  null,
    create_time  varchar(30)  not null,
    update_time  varchar(30)  null,
    image_path   varchar(50)  null,
    constraint user_id_uindex
        unique (user_id)
);


drop table if exists user;
alter table user
    add primary key (user_id);

INSERT INTO backstagemanagement.user (user_id, name, password, nickname, gender, state, phone_number, email,
                                      create_time, update_time, image_path)
VALUES (1, 'admin', 'admin', '嘻嘻嘻', '男', '启用', '13983056858', '1311140940@qq.com', '2021-11-26 00:06:30',
        '2021-11-26 00:06:30', null);



drop table if exists user_department;
create table user__department
(
    user_id       int null,
    department_id int null
);

INSERT INTO backstagemanagement.user_department (user_id, department_id)
VALUES (0, 1);


drop table if exists user_role;
create table user__role
(
    user_id int null,
    role_id int null
);

INSERT INTO backstagemanagement.user_role (user_id, role_id)
VALUES (0, 1);


drop table if exists adminfile;
create table adminfile
(
    AdminFile_id   int         not null
        primary key,
    AdminFile_name varchar(30) not null,
    AdminFile_path varchar(50) not null
);


drop table if exists authority_element;
create table authority__element
(
    authority_id int null,
    element_id   int null
);


drop table if exists authority_operate;
create table authority__operate
(
    authority_id int null,
    operate_id   int null
);



drop table if exists element;
create table element
(
    Element_id   int         not null
        primary key,
    Element_code varchar(30) not null
);



drop table if exists file_authority;
create table file__authority
(
    authority_id int null,
    file_id      int null
);


drop table if exists menu;
create table menu
(
    menu_id   int         not null
        primary key,
    menu_name varchar(30) not null,
    menu_url  varchar(30) not null
);


drop table if exists menu_authority;
create table menu__authority
(
    menu_id      int null,
    authority_id int null
);

drop table if exists operate;
create table operate
(
    Operate_id    int         not null
        primary key,
    Operate_name  varchar(30) not null,
    Operate_code  varchar(60) not null,
    intercept_url varchar(30) not null
);







