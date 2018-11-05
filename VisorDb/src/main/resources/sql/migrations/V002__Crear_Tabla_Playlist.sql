USE `movienightdb`;
CREATE TABLE playlists (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    favorite bit NOT NULL DEFAULT false,
    description text NOT NULL,
    index_i int NOT NULL DEFAULT 1,
    name varchar(20) NOT NULL DEFAULT 'playlist'
);