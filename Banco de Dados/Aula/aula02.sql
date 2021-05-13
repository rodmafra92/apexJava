/*
    OPERADORES RELACIONAIS
    > MAIOR
    < MENOR
    >= MAIOR OU IGUAL
    <= MENOR OU IGUAL
    = IGUAL
    <> DIFERENTE

    OPERADORES LOGICOS
    E AND
    OU OR 
*/
CREATE TABLE alunos(
    nome VARCHAR(30),
    nota1 FLOAT,
    nota2 FLOAT
);

INSERT INTO alunos VALUES
("Bruno", 7, 8.5),
("Carla", 9, 10),
("Ellen", 6, 8),
("Paula", 7, 5);

SELECT * FROM alunos;

SELECT  nome, (nota1+nota2)/2 FROM alunos;

/*
    ORDER BY -> Ordenação
    ASC-> Menor/Maior ou A/Z
    DESC-> Maior/Menor ou Z/a
*/
SELECT nome FROM alunos ORDER BY nome DESC ;

SELECT nome, IF((nota1+nota2)/2 >=7,"Aprovado", "Reprovado") FROM alunos;

SELECT 
    nome,
    CONCAT(if((nota1+nota2)/2 >=7,"Aprovado", "Reprovado")," com média ",(nota1+nota2)/2)
    FROM alunos;

    SELECT COUNT(*) FROM alunos;

    SELECT MAX(nota1) FROM alunos;

    SELECT MIN(nota1) FROM alunos;

    SELECT AVG(nota1) FROM alunos;

    SELECT nome, nota1 FROM alunos WHERE nota1 >= 7;

    /*
        %A -> Inicia com o termo
        E% -> Finaliza com o termo
        %u% -> Contêm o termo
    */
    SELECT nome FROM alunos WHERE nome LIKE "%U%";

    UPDATE alunos SET nota2 = 7 WHERE nome = "Paula";

    DELETE FROM alunos WHERE nome = "Carla";

    DROP TABLE alunos;