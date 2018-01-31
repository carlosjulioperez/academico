TRUNCATE TABLE actividad CASCADE;
TRUNCATE TABLE alumno CASCADE;
TRUNCATE TABLE calendarioespol CASCADE;
TRUNCATE TABLE materia CASCADE;
TRUNCATE TABLE nivelacademico CASCADE;
TRUNCATE TABLE paralelo CASCADE;
TRUNCATE TABLE profesor CASCADE;
TRUNCATE TABLE registro CASCADE;

INSERT INTO actividad (id,descripcion) VALUES 
    (1, 'Resumen de Paper'),
    (2, 'Resumen de Lectura'),
    (3, 'Lección primer parcial'),
    (4, 'Lección segundo parcial'),
    (5, 'Proyecto primer parcial'),
    (6, 'Proyecto segundo parcial'),
    (7, 'Trabajo grupal'),
    (8, 'Examen primer parcial'),
    (9, 'Examen segundo parcial'),
    (10, 'Resumen en Clase');

INSERT INTO materia (id,descripcion) VALUES 
    (1, 'Contabilidad'),
    (2, 'Matemáticas Financieras'),
    (3, 'Aplicaciones Distribuidas'),
    (4, 'Investigación de operaciones'),
    (5, 'Estudios de Mercado'),
    (6, 'Análisis de Sistemas'),
    (7, 'Inglés'),
    (8, 'Auditoría'),
    (9, 'Redes de Computadoras'),
    (10,'Marketing para Desarrolladores de Software');

INSERT INTO alumno (id,apellido,nombre) VALUES 
    (1, 'Pérez Quizhpe', 'Carlos Julio'),
    (2, 'Abad Juarez', 'Alicia Esther'),
    (3, 'Zambrano Izquierdo', 'Vicente Segundo'),
    (4, 'Loor Baca', 'Juan Andrés'),
    (5, 'Morales Zumba', 'Ulbio Esteban'),
    (6, 'Nájera Orrantia', 'José Luís'),
    (7, 'Hidalgo Flor', 'Ana María'),
    (8, 'Coello Arreaga', 'Lorena Soledad'),
    (9, 'Valladares Lucio', 'Julio César'),
    (10,'Freire Freire', 'Juana Luisa');

INSERT INTO nivelacademico (id,descripcion) VALUES 
    (1, 'Tercer Nivel'),
    (2, 'Cuarto Nivel'),
    (3, 'Doctorado');

INSERT INTO profesor (id,apellido,nombre,nivelacademico_id) VALUES 
    (1, 'Contreras Quimí', 'Rolando Jacinto', 1),
    (2, 'Macías López', 'Ana Soledad', 2),
    (3, 'Basurto Ruiz', 'Lorena Lucía', 1),
    (4, 'Hidalgo Salazar', 'Fabián Xavier', 1),
    (5, 'Pin Pita', 'Kléver Andrés', 2),
    (6, 'Quirola Abad', 'Fabiola Lucy', 2),
    (7, 'Jiménez Roca', 'Wendy Rita', 3),
    (8, 'Villafuerte Rosado', 'Diego Fernando', 1),
    (9, 'Izquierdo Sánchez', 'Otela Julissa', 2),
    (10,'Nieto Wong', 'Gigio Felipe', 3);

INSERT INTO calendarioespol (id,anio,semestre,fechainiciovigencia,fechafinalvigencia) VALUES 
(1,2018, 1, TIMESTAMP '2018-01-30 00:00:00', TIMESTAMP '2018-07-30 00:00:00');

INSERT INTO paralelo(id, calendarioespol_id, materia_id, profesor_id, descripcion, horainicio, duracionhoras) VALUES
(1, 1, 6, 7, 'Paralelo 001', '07:00', 2); 

INSERT INTO registro(id, alumno_id, paralelo_id, fechaRegistro, estadoRegistro) VALUES
(1, 1, 1, TIMESTAMP '2018-01-30 00:00:00', true); 
