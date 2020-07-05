use springsecurity;

create table my_user(username varchar(50) primary key, password varchar(50), active boolean);
create table my_authorities(username varchar(50), role varchar(50));

insert into my_user values('user','user',true);
insert into my_user values('admin','admin',true);

insert into my_authorities values('user','ROLE_USER');
insert into my_authorities values('admin','ROLE_ADMIN');

commit;