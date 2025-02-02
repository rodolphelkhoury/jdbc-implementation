# JDBC PostgreSQL Connection

## Overview
This Java application connects to a PostgreSQL 16 database using JDBC. It checks for the JDBC driver, establishes a connection, and creates a table in the database if it doesn't already exist.

## Requirements
- Java 17+
- PostgreSQL 16
- PostgreSQL JDBC Driver (`postgresql-42.7.5.jar`)

## Setup
1. Install PostgreSQL 16 and create a database.
2. Update the `PostgresJDBC.java` file with your database credentials (`url`, `user`, `password`).
3. Download the PostgreSQL JDBC Driver (`postgresql-42.7.5.jar`).
4. Compile and run the application.

## Execution
```sh
javac PostgresJDBC.java
java -cp .:postgresql-42.7.5.jar PostgresJDBC
