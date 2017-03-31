# triple selection practice
this practice aims to learn the DB dynamic connection by AJAX(xhr) in JSON formmat 
I'll make 3 selection boxes
when you choose the first box, a second box will be listed up.(third's logic is same too)  

## Tables
Before you install this test, you need to make the tables.

- Country

  ```
  create table country (
    no int auto_increment not null primary key,
    name varchar(50)
  );
  ```

- City

  ```
  create table city (
    no int auto_increment not null primary key,
    name varchar(50),
    country varchar(50)
  );
  ```
  
- People
  
  ```
  create table people (
    no int auto_increment not null primary key,
    name varchar(50),
    city varchar(50),
    phone varchar(50)
  );
  ```
  
## SQL
you need to insert these example queries.

- Country

  ```
    insert into country values(null, 'korea');
    insert into country values(null, 'usa');
    insert into country values(null, 'spain');
    insert into country values(null, 'england');
  ```

- City

  ```
    insert into city values(null, 'busan', 'usa');
    insert into city values(null, 'seoul', 'usa');
    insert into city values(null, 'ulsan', 'usa');
    insert into city values(null, 'NY', 'usa');
    insert into city values(null, 'miami', 'usa');
    insert into city values(null, 'barca', 'spain');
    insert into city values(null, 'madrid', 'spain');
    insert into city values(null, 'manchester', 'england');
    insert into city values(null, 'liverpool', 'england');
  ```

- People

  ```
    insert into people values(null, 'son', 'seoul', '112');
    insert into people values(null, 'b', 'seoul', '119');
    insert into people values(null, 'h', 'seoul', '117');
    insert into people values(null, 'zz', 'busan', '112');
    insert into people values(null, 'ss', 'busan', '114');
    insert into people values(null, 'dd', 'ulsan', '115');
    insert into people values(null, 'qq', 'NY', '116');
    insert into people values(null, 'ww', 'NY', '117');
    insert into people values(null, 'ee', 'miami', '118');
    insert into people values(null, 'rr', 'miami', '119');
    insert into people values(null, 'tt', 'barca', '120');
    insert into people values(null, 'yy', 'barca', '121');
    insert into people values(null, 'uu', 'madrid', '122');
    insert into people values(null, 'ii', 'madrid', '123');
    insert into people values(null, 'c', 'manchester', '23');
    insert into people values(null, 'd', 'manchester', '23');
    insert into people values(null, 'yu', 'liverpool', '11');
    insert into people values(null, 'j', 'liverpool', '33');
  ```

## Requirement

This project runs in these enviroments below:

> Enviroments:
>
> * MySQL
> * Spring 3.1
> * JDK 8_121
> * MAVEN
> * Tomcat 8
