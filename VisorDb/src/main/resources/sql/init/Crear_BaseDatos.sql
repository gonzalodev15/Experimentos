CREATE DATABASE movienightdb CHARACTER SET utf8 COLLATE utf8_general_ci;
use movienightdb;
CREATE USER 'movienight_user' IDENTIFIED BY 'movienight_pass';
GRANT ALL ON movienightdb.* TO 'movienight_user'@'%' IDENTIFIED BY 'movienight_pass';
GRANT ALL ON movienightdb.* TO 'movienight_user'@'localhost' IDENTIFIED BY 'movienight_pass';
FLUSH PRIVILEGES;
