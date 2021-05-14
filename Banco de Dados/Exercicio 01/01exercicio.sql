CREATE TABLE alunos(
    nome VARCHAR(30),
    idade INT,
    nota1 DOUBLE,
    nota2 DOUBLE 
);
 <---comentario-->
INSERT INTO alunos VALUES
    ("Ana", 15, 7.5, 8.2),
    ("Lucas", null, 9, 8.6),
    ("Vanessa", 16, 6.6, 7.1),
    ("Leonardo", 15, 5, 4.5),
    ("Dênis", 17, 10, 10);

SELECT * FROM alunos;

SELECT  nome, (nota1+nota2)/2 FROM alunos;

SELECT nome, IF((nota1+nota2)/2 >= 7 ,"Aprovado","Reprovado") FROM alunos;

SELECT * from alunos WHERE idade BETWEEN 15 AND 16;

SELECT nome FROM alunos ORDER BY nome;

SELECT nome FROM alunos WHERE nome LIKE "%l%";

SELECT nome FROM alunos WHERE nome LIKE "A%";

SELECT COUNT(*) FROM alunos;

SELECT SUM(idade) FROM alunos;

SELECT MAX(idade) FROM  alunos;

SELECT MIN(idade) FROM alunos;

UPDATE alunos SET idade = 15 WHERE idade is NULL; 

DELETE FROM alunos WHERE idade > 15;

DROP TABLE alunos;



