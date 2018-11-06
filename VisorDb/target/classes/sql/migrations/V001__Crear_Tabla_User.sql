USE `movienightdb`;
CREATE TABLE users (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstname varchar(30) NOT NULL,
    lastname varchar(30) NOT NULL,
    email varchar(50) NOT NULL,
    password varchar(15) NOT NULL
);