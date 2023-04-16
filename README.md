# Spring Template

As [Ketuer/study-project](https://github.com/Ketuer/study-project)

Listen and serve on [localhost:8080](http://localhost:8080)

## Connect to database

```yml
spring:
#  mysql, main datasource
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf-8
    username: root
    password: 123456
#    redis, current logins datasource
  data:
    redis:
      database: 0
      host: localhost
      port: 6379
```

### Create table

Run :

```sql
create database study;
create table study.db_account
(
    id       int(11)     not null auto_increment primary key,
    username varchar(50) not null,
    password varchar(100) not null,
    email    varchar(50) not null
);

create table study.persistent_logins
(
    username  varchar(64) not null,
    series    varchar(64) primary key,
    token     varchar(64) not null,
    last_used timestamp   not null
);
```

## Connect to e-mail server

```yml
spring:
  mail:
    host: #your smtp server
    username: #your email
    password: #...
    port: #your smtp server port
    properties:
      from: #your email
      mail:
        smtp:
          socketFactory:
            class: javax.net.ssl.SSLSocketFactory
```
