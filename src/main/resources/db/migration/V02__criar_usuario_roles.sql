CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `habilitado` boolean NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`username`)
) ENGINE=InnoDB;

CREATE TABLE `permissao` (
	`id` int NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE usuario_permissao (
	`id` int NOT NULL AUTO_INCREMENT,
	`usuario_id` int NOT NULL,
	`permissao_id` int NOT NULL,
	PRIMARY KEY (`id`),
	FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
	FOREIGN KEY (`permissao_id`) REFERENCES `permissao` (`id`)
) ENGINE=InnoDB;
