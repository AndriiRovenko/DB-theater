CREATE TABLE IF NOT EXISTS `item` (
  `id`          INT(11)                                  NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(64)                              NOT NULL,
  `description` VARCHAR(512)                             NULL     DEFAULT NULL,
  `type`        ENUM('TYPE1', 'TYPE2', 'TYPE3', 'TYPE4') NULL     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = 'utf8'