CREATE TABLE Autor (
    idAutor INT PRIMARY KEY AUTO_INCREMENT,
    cedula VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE Libro (
    idLibro INT PRIMARY KEY AUTO_INCREMENT,
    idAutor INT,
    FOREIGN KEY (idAutor) REFERENCES Autor(idAutor)
);

INSERT INTO Autor (idAutor, cedula) VALUES
(1, '1234567890'),
(2, '0987654321'),
(3, '1122334455');

INSERT INTO Libro (idLibro, idAutor) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 2),
(6, 2),
(7, 3),
(8, 3),
(9, 3),
(10, 3);

DELIMITER //
CREATE PROCEDURE ObtenerLibrosPorAutor (IN cedulaAutor VARCHAR(20))
BEGIN
    SELECT Libro.idLibro, Autor.cedula
    FROM Libro
    JOIN Autor ON Libro.idAutor = Autor.idAutor
    WHERE Autor.cedula = cedulaAutor;
END //
DELIMITER ;
