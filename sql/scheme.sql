create database feel_at_home;

use feel_at_home;

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
        'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema feel_at_home
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema feel_at_home
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `feel_at_home` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `feel_at_home`;

-- -----------------------------------------------------
-- Table `feel_at_home`.`member`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`member`
(
    `member_id`         BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `member_account_id` VARCHAR(45) NOT NULL,
    `display_name`          VARCHAR(45) NOT NULL,
    `email`             VARCHAR(45) NOT NULL,
    `friend`            INT DEFAULT 0,
    PRIMARY KEY (`member_id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`playlist`
(
    `playlist_id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `playlist_name`    VARCHAR(50) NOT NULL,
    `playlist_emotion` VARCHAR(45) NULL,
    PRIMARY KEY (`playlist_id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`friend`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`follow`
(
    `member_id` BIGINT(20) NOT NULL,
    `friend_id` BIGINT(20) NOT NULL
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`song`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`song`
(
    `song_id` BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `title`   VARCHAR(50) NOT NULL,
    `album`   VARCHAR(50) NOT NULL,
    `artist`  VARCHAR(50) NOT NULL,
    `status1` VARCHAR(45) NULL,
    `status2` VARCHAR(45) NULL,
    PRIMARY KEY (`song_id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`playlist_like`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`playlist_like`
(
    `playlist_like_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `member_id`        BIGINT(20) NOT NULL,
    `playlist_id`      BIGINT(20) NOT NULL,
    PRIMARY KEY (`playlist_like_id`),
    INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
    INDEX `playlist_id_idx` (`playlist_id` ASC) VISIBLE,
    CONSTRAINT `fk_playlist_like_member`
        FOREIGN KEY (`member_id`)
            REFERENCES `feel_at_home`.`member` (`member_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_playlist_like_playlist`
        FOREIGN KEY (`playlist_id`)
            REFERENCES `feel_at_home`.`playlist` (`playlist_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`emotion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`emotion`
(
    `emotion_id`      INT          NOT NULL AUTO_INCREMENT,
    `emotion_name`    VARCHAR(30)  NOT NULL,
    `emotion_img_url` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`emotion_id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`comment`
(
    `comment_id` BIGINT(20)   NOT NULL AUTO_INCREMENT,
    `member_id`  BIGINT(20)   NOT NULL,
    `regTime`    DATETIME     NOT NULL,
    `content`    VARCHAR(300) NOT NULL,
    PRIMARY KEY (`comment_id`),
    INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
    CONSTRAINT `fk_comment_member`
        FOREIGN KEY (`member_id`)
            REFERENCES `feel_at_home`.`member` (`member_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`diary`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`diary`
(
    `diary_id`   BIGINT(20)   NOT NULL AUTO_INCREMENT,
    `member_id`  BIGINT(20)   NOT NULL,
    `emotion_id` INT          NOT NULL,
    `year`       VARCHAR(10)  NOT NULL,
    `month`      VARCHAR(10)  NOT NULL,
    `day`        VARCHAR(10)  NOT NULL,
    `memo`       VARCHAR(500) NOT NULL,
    PRIMARY KEY (`diary_id`),
    INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
    INDEX `emotion_id_idx` (`emotion_id` ASC) VISIBLE,
    CONSTRAINT `fk_diary_member`
        FOREIGN KEY (`member_id`)
            REFERENCES `feel_at_home`.`member` (`member_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_diary_emotion`
        FOREIGN KEY (`emotion_id`)
            REFERENCES `feel_at_home`.`emotion` (`emotion_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `feel_at_home`.`playlist_songs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `feel_at_home`.`playlist_songs`
(
    `playlist_id` BIGINT(20) NOT NULL,
    `song_id`     BIGINT(20) NOT NULL,
    INDEX `fk_playlist_songs_playlist_idx` (`playlist_id` ASC) VISIBLE,
    INDEX `fk_playlist_songs_playlist_idx1` (`song_id` ASC) VISIBLE,
    CONSTRAINT `fk_playlist_songs_playlist`
        FOREIGN KEY (`playlist_id`)
            REFERENCES `feel_at_home`.`playlist` (`playlist_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_playlist_songs_song`
        FOREIGN KEY (`song_id`)
            REFERENCES `feel_at_home`.`song` (`song_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;