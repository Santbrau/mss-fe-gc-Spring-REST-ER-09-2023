DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas(
	codigo int auto_increment,
    nombre nvarchar(150),
    calificacion_edad int,
    PRIMARY KEY(codigo)
);

CREATE TABLE salas(
	codigo int auto_increment,
    nombre nvarchar(150),
    pelicula int,
    PRIMARY KEY(codigo),
    FOREIGN KEY(pelicula) REFERENCES peliculas (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);