create database login_form;
use login_form;

create table users (
id int not null primary key auto_increment,
name varchar(200) not null,
email varchar(200) not null unique,
phone varchar(200),
address varchar(200),
password varchar(200) not null
);

insert into users (name, email, phone, address, password) values
('ridika', 'ridika@gmail.com', '0123456789', 'Dhaka, Bangladesh', '12345');

