# Spring Boot Data JPA - Column Type Migration Issue After Update to Spring Boot 3

While the flag was set to `true`, documentation states that "it is not used if Hibernate auto-configuration is active, because the
`ddl-auto`
settings are more fine-grained." This is also a change in behavior from Spring Boot 2 to 3.

Steps to duplicate the issue:
1. Start Postgres DB: docker-compose up -d
2. Connect to local DB, check column type of `id` in table `my_table` (it should be `integer`)
3. Start Application, then check the column type again, should still be `integer`
4. Upgrade to Spring Boot 3.2.4, then start the application again
5. Check the column type again, it should be `bigint` now
6. Checks logs, the following is there: `Hibernate: alter table if exists my_table alter column id set data type bigint`