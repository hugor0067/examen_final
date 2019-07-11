CREATE Database ocean;
use ocean;


CREATE TABLE Poisson (
id Int Auto_increment NOT NULL,
nom VARCHAR (100),
type Int NOT NULL,
photo VARCHAR(2048),
CONSTRAINT poisson_PK PRIMARY KEY (id),
);


#------------------------------------------------------------
# Table: Especes
#------------------------------------------------------------

CREATE TABLE Especes (
id Int Auto_increment NOT NULL,
nom VARCHAR (100) NOT NULL,
description VARCHAR(1024),
CONSTRAINT Especes_PK PRIMARY KEY (id),
);