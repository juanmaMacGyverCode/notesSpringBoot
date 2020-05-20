USE notasSpring;

CREATE TABLE notas(
	idNota INT AUTO_INCREMENT,
	titulo VARCHAR(40) NOT NULL,
	descripcion VARCHAR(40) NOT NULL,
	rutaImagen VARCHAR(100) NOT NULL,
	PRIMARY KEY(idNota)
)ENGINE=InnoDB;

INSERT INTO notas VALUES (1, "Hola", "Primer Hola mundo!", "http://localhost:8080/img/privaticese.jpg");