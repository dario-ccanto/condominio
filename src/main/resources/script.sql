create database condominio;

use condominio;

CREATE TABLE `condominio`.`pauta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `data_inicio` DATE,
  `estado` INT,
  PRIMARY KEY (`id`)
);

CREATE TABLE `condominio`.`sessao_votacao` (
   `id` INT NOT NULL AUTO_INCREMENT,
   `pauta_id` INT NOT NULL,
   `tempo_votacao` INT NULL,
   `dt_abertura` DATETIME NOT NULL,
   PRIMARY KEY (`id`),
   FOREIGN KEY (pauta_id) REFERENCES Pauta(id)
);

CREATE TABLE `condominio`.`votacao` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `sessao_votacao_id` INT NULL,
    `cpf` VARCHAR(11) NULL,
    `voto` VARCHAR(1) NULL,
    `dt_criacao` DATETIME NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (sessao_votacao_id) REFERENCES sessao_votacao(id)
);
