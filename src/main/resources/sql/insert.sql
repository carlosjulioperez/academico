TRUNCATE TABLE actividad CASCADE;
TRUNCATE TABLE alumno CASCADE;
TRUNCATE TABLE materia CASCADE;

INSERT INTO actividad (id,descripcion) VALUES (1, 'Resumen de Paper');
INSERT INTO actividad (id,descripcion) VALUES (2, 'Resumen de Lectura');
INSERT INTO actividad (id,descripcion) VALUES (3, 'Lección primer parcial');
INSERT INTO actividad (id,descripcion) VALUES (4, 'Lección segundo parcial');
INSERT INTO actividad (id,descripcion) VALUES (5, 'Proyecto primer parcial');
INSERT INTO actividad (id,descripcion) VALUES (6, 'Proyecto segundo parcial');
INSERT INTO actividad (id,descripcion) VALUES (7, 'Trabajo grupal');
INSERT INTO actividad (id,descripcion) VALUES (8, 'Examen primer parcial');
INSERT INTO actividad (id,descripcion) VALUES (9, 'Examen segundo parcial');
INSERT INTO actividad (id,descripcion) VALUES (10, 'Resumen en Clase');

INSERT INTO materia (id,descripcion) VALUES (1, 'Contabilidad');
INSERT INTO materia (id,descripcion) VALUES (2, 'Matemáticas Financieras');
INSERT INTO materia (id,descripcion) VALUES (3, 'Aplicaciones Distribuidas');
INSERT INTO materia (id,descripcion) VALUES (4, 'Investigación de operaciones');
INSERT INTO materia (id,descripcion) VALUES (5, 'Estudios de Mercado');
INSERT INTO materia (id,descripcion) VALUES (6, 'Análisis de Sistemas');
INSERT INTO materia (id,descripcion) VALUES (7, 'Inglés');
INSERT INTO materia (id,descripcion) VALUES (8, 'Auditoría');
INSERT INTO materia (id,descripcion) VALUES (9, 'Redes de Computadoras');
INSERT INTO materia (id,descripcion) VALUES (10,'Marketing para Desarrolladores de Software');

INSERT INTO alumno (id,apellido,nombre) VALUES (1, 'Pérez Quizhpe', 'Carlos Julio');
INSERT INTO alumno (id,apellido,nombre) VALUES (2, 'Abad Juarez', 'Alicia Esther');
INSERT INTO alumno (id,apellido,nombre) VALUES (3, 'Zambrano Izquierdo', 'Vicente Segundo');
INSERT INTO alumno (id,apellido,nombre) VALUES (4, 'Loor Baca', 'Juan Andrés');
INSERT INTO alumno (id,apellido,nombre) VALUES (5, 'Morales Zumba', 'Ulbio Esteban');
INSERT INTO alumno (id,apellido,nombre) VALUES (6, 'Nájera Orrantia', 'José Luís');
INSERT INTO alumno (id,apellido,nombre) VALUES (7, 'Hidalgo Flor', 'Ana María');
INSERT INTO alumno (id,apellido,nombre) VALUES (8, 'Coello Arreaga', 'Lorena Soledad');
INSERT INTO alumno (id,apellido,nombre) VALUES (9, 'Valladares Lucio', 'Julio César');
INSERT INTO alumno (id,apellido,nombre) VALUES (10,'Freire Freire', 'Juana Luisa');

