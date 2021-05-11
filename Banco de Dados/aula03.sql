CREATE TABLE produtos(
    codigo INT AUTO_INCREMENT PRIMARY key,
    nome VARCHAR (40),
    valor DECIMAL (10,2),
    marca VARCHAR (30)
);

INSERT INTO produtos VALUES
(null,"iPhone X",4000, "Apple"),
(null,"Galaxy S21", 4300,"Samsung"),
(null,"TV NanoCell 50", 2699, "LG"),
(null,"PlaySatation 5", 5000,"Sony"),
(null,"Notebook Inspiron", 4100,"Dell");

SELECT * FROM produtos;

SELECT nome FROM produtos WHERE marca IN ("Samsung","LG","Sony");

SELECT * FROM produtos WHERE valor BETWEEN 2500 AND 4000;

INSERT INTO produtos VALUES (null,"Teclado",null,"Microsoft");

SELECT * FROM produtos WHERE valor IS  null;

SELECT * FROM produtos WHERE valor IS NOT  null;

TRUNCATE TABLE produtos;

