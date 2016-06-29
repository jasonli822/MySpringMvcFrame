CREATE DATABASE IF NOT EXISTS mybatis;

USE mybatis;


create table t_user
(
    user_id int(11) NOT NULL AUTO_INCREMENT,
    user_name varchar(20) not null,
    user_age varchar(20) not null,
    PRIMARY KEY (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO t_user(user_id,user_name,user_age) VALUES(1,"Jason","28");
INSERT INTO t_user(user_id,user_name,user_age) VALUES(2,"Toni","24");