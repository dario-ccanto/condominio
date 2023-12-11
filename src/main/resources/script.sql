create database condominio;

use condominio;

CREATE TABLE `condominio`.`pauta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `data_inicio` DATE,
  `estado` INT,
  PRIMARY KEY (`id`)
);