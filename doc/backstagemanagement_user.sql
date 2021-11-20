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