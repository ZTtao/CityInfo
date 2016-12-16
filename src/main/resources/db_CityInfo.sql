create database db_cityinfo;
use db_cityinfo;

create table tb_info(
	id smallint(2) not null auto_increment,
    info_type smallint(2),
    info_title varchar(80),
    info_content varchar(1000),
    info_linkman varchar(50),
    info_phone varchar(50),
    info_email varchar(100),
    info_date datetime,
    info_state varchar(1) default '0',
	info_payfor varchar(1) default '0',
    primary key(id)
)engine=INNODB
charset='utf8';
create table tb_type(
	id smallint(2) not null auto_increment primary key,
    type_sign smallint(2) not null,
    type_name varchar(20) ,
    type_intro varchar(20)
)engine=INNODB
charset='utf8';
create table tb_user(
	id smallint(2) not null auto_increment primary key,
    user_name varchar(20),
    user_password varchar(10)
)engine=INNODB
charset='utf8';
insert into tb_type(type_sign,type_name,type_intro) values(2,'type1','aaaaaaa'),(3,'type2','bbbbbbbbbbb');