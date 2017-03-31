# triple selection practice

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
  
## Requirement

This project runs in these enviroments below:

> Enviroments:
>
> * MySQL
> * Spring 3.1
> * JDK 8_121
> * MAVEN
> * Tomcat 8
