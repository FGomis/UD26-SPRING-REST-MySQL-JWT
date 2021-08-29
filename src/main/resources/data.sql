DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;

CREATE TABLE peliculas (
  id INT NOT NULL AUTO_INCREMENT,
  titulo varchar(100) DEFAULT NULL,
  calificacion_edad varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE salas (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) DEFAULT NULL,
  pelicula INT,
  PRIMARY KEY (id),
  FOREIGN KEY (pelicula) REFERENCES peliculas (id)
);

INSERT INTO peliculas (titulo, calificacion_edad) VALUES ('El Señor de los Anillos: El Retorno del Rey','PG-13');
INSERT INTO peliculas (titulo, calificacion_edad) VALUES ('Pulp Fiction','+18');

INSERT INTO salas (nombre, pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 2', 2);


