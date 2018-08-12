# Wilayah service

## System required

* Postgresql

    ```postgresql
    create user wilayah_db with superuser login password 'wilayah_db';
    create database wilayah_db with owner wilayah_db;
    ```

* Oracle JDK 8
* Apache Maven

```bash
mvn clean \
    -Dserver.port=8081 \
    -Dspring.cloud.config.uri=https://ebanking-config-server.herokuapp.com \
    -Dspring.cloud.config.profile=default \
    spring-boot:run
```