CREATE TABLE IF NOT EXISTS `supplier` (
  `id`          INT(11)      NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(64)  NOT NULL,
  `description` VARCHAR(512) NULL     DEFAULT NULL,
  `address`     VARCHAR(128) NULL     DEFAULT NULL,
  `inn`         VARCHAR(20)  NULL     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = 'utf8'