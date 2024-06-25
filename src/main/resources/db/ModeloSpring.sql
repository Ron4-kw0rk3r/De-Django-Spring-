

--- tabla usuarios 
-- para el almacenamiento de nombres y demas 

CREATE TABLE usuario (
    -- id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    edad INT NOT NULL CHECK (edad <= 100),
    estado boolean NOT NULL
    
);


