create database emp_db;
use emp_db;
create table department(
dept_id int primary key,
dept_name varchar(25) not null);

create table address(
add_seq_id int primary key,
street varchar(20),
city varchar(20),
state varchar(20),
zipcode numeric(10));

create table employee(
emp_id int primary key,
emp_name text,
emp_sal numeric(10,3),
emp_desig varchar(20),
add_seq_id int,
dept_id int
);
create table employee_temp(
emp_id int primary key auto_increment,
emp_name text,
emp_sal numeric(10,3),
emp_desig varchar(20),
address varchar(50),
dept varchar(20)
);

ALTER TABLE employee
ADD FOREIGN KEY (dept_id)
REFERENCES department(dept_id);

alter table employee modify column emp_id int auto_increment;
desc employee;
insert into department values(1,"DEV");
insert into department values(3,"HR");
insert into department values(4,"Finance");
insert into department values(2,"SER");
insert into department values(5,"PRO");
insert into address(add_seq_id,street,city,state,zipcode) values(23,"IshwarNagar","Thane","Maharashtra",400078);
insert into address(add_seq_id,street,city,state,zipcode) values(24,"HiraNandani","Mumbai","Maharashtra",400075);
insert into address(add_seq_id,street,city,state,zipcode) values(25,"Airoli","Thane","Maharashtra",400079);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("pitus",52002,"SE",23,2);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("Pihu",58963,"ASE",25,2);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("Rakj",125820,"CNS",24,4);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("Anuj",59562.652,"MAN",25,1);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("proto",32564.41,"SMAN",24,2);
insert into employee(emp_name,emp_sal,emp_desig,add_seq_id,dept_id) values("mike",12312,"PRO",25,5);

select *from employee_temp;
alter table employee_temp modify column address varchar(250);

alter table employee_temp modify column dept varchar(150);



