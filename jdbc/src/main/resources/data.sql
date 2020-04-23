create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255) not null,
birth_date timestamp,
primary key(id)

);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES (1001,'NADEEM','BANGALORE',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES (1002,'FAHAD','BANGALORE',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES (1003,'PATEL','BANGALORE',sysdate());
