CREATE TABLE produtos(

    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (20),
    marca VARCHAR (20),
    valor DECIMAL (10,2)
);

INSERT INTO produtos VALUES
    (null,"Galaxy S10", "Samsung", 5000),
    (null,"iPhone 11", "Apple", 6000),
    (null,"Moto G7", "Motorola", 1500),
    (null,"Galaxy Note 10", "Samsung", 6500),
    (null,"iPhone8", "Apple", 3000);

SELECT * FROM produtos;

SELECT COUNT(*), marca FROM produtos GROUP BY marca;

SELECT * FROM  produtos WHERE marca IN  ("Samsung", "Apple");

SELECT * FROM produtos WHERE marca IN ("Samsung", "Apple") AND valor < 6000;

INSERT INTO produtos VALUES (null,"iPhone 11 max", "Apple", 6500);

SELECT nome, valor FROM produtos WHERE valor = (SELECT max(valor) FROM produtos);

DELETE  FROM produtos WHERE marca = "Samsung";

INSERT INTO produtos VALUES
    (null,"Galaxy A7","Samsung", 2000),
    (null,"Galaxy A8", "Samsung", 2350);

TRUNCATE TABLE produtos;

DROP TABLE produtos;
