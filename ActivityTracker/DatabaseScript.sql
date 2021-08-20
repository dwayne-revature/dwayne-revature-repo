drop table employee ;
create table employee (
	id serial,
	email varchar(50),
	password varchar(50),
	firstname varchar(50),
	lastname varchar(50),
	manager bool,
	m_id int
);

insert into employee values (default, 'john.doe@email.com', 'pass1', 'FirstName1', 'LastName1', false, 2);
insert into employee values (default, 'jane.doe@gmail.com', 'pass2', 'FirstName1', 'LastName1', true, 4);

drop table task ;
create table task (
	id serial,
	taskdescription varchar(250),
	startdate int8,
	duedate int8,
	e_id int,
	status varchar(50)	
);

insert into task values (default, 'TaskDescription1', 0, 5, 1, 'Status1');
insert into task values (default, 'TaskDescription2', 0, 5, 1, 'Status2');
insert into task values (default, 'TaskDescription3', 0, 5, 1, 'Status3');
