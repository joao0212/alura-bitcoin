CREATE TABLE `bitcoin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `preco` decimal(19,2) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `data` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

INSERT INTO bitcoin (preco, tipo, data) VALUES (58.55,'VENDA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.55,'VENDA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.99,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.00,'VENDA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.99,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.99,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.99,'COMPRA',NOW());
INSERT INTO bitcoin (preco, tipo, data) VALUES (58.01,'VENDA',NOW());