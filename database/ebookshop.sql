show databases;
create database ebookshop;
use ebookshop;

create table books(
id int,
title varchar(50),
author varchar(50),
price float,
qty int,
primary key(id));

desc books;

insert into books values(1,"Key Hunter","Alok Sinha",2500,20);
insert into books values(2,"Algorithm","Aman Kumar",200,50);
insert into books values(3,"Business","Amit Sinha",600,28);
insert into books values(4,"English for Advance","Chotu Bhai",2000,100);
insert into books values(5,"Motivational","Ravi Sinha",500,245);
 