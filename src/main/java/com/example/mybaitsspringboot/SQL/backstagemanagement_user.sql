create table user
(
    id       int auto_increment,
    name     varchar(255) not null,
    password varchar(255) not null,
    constraint user_id_uindex
        unique (id)
);

alter table user
    add primary key (id);

INSERT INTO backstagemanagement.user (id, name, password)
VALUES (1, 'admin', 'admin');

create table role
(
    role_id   int         not null
        primary key,
    role_name varchar(20) not null
);

INSERT INTO backstagemanagement.role (role_id, role_name) VALUES (1, 'superadmin');

create table operate
(
    Operate_id    int         not null
        primary key,
    Operate_name  varchar(30) not null,
    Operate_code  varchar(60) not null,
    intercept_url varchar(30) not null
);

create table menu
(
    menu_id   int         not null
        primary key,
    menu_name varchar(30) not null,
    menu_url  varchar(30) not null
);
create table authority
(
    authority_id   int         not null
        primary key,
    authority_king varchar(30) not null
);

create table adminfile
(
    AdminFile_id   int         not null
        primary key,
    AdminFile_name varchar(30) not null,
    AdminFile_path varchar(50) not null
);

create table department
(
    Department_id   int         not null
        primary key,
    Department_name varchar(20) not null
);

create table user_role
(
    user_id int null,
    role_id int null
);

INSERT INTO backstagemanagement.user_role (user_id, role_id) VALUES (1, 1);
create table user_department
(
    user_id       int null,
    department_id int null
);

create table role_authority
(
    authority_id int null,
    role_id      int null
);

create table menu_authority
(
    menu_id      int null,
    authority_id int null
);

create table file_authority
(
    authority_id int null,
    file_id      int null
);

create table department_role
(
    department_id int null,
    role_id       int null
);

create table authority_operate
(
    authority_id int null,
    operate_id   int null
);

create table authority_element
(
    authority_id int null,
    element_id   int null
);





create table element
(
    Element_id   int         not null
        primary key,
    Element_code varchar(30) not null
);


