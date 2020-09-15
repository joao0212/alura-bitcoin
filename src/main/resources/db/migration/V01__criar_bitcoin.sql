CREATE TABLE `bitcoin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `preco` decimal(19,2) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `data` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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