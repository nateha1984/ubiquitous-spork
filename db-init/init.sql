create table if not exists my_table (id int, name varchar);

insert into my_table values (1, 'foo');

create role read_write_role;

grant connect on database "test-db" to read_write_role;

grant usage on schema public to read_write_role;
grant select, insert on all tables in schema public to read_write_role;

create user "RW_USER" with password 'pwd';

grant read_write_role to "RW_USER";