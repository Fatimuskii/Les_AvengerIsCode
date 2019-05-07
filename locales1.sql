-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
--
-- Base de datos: `les_avengeris`
--

-- --------------------------------------------------------


--
-- Estructura de tabla para la tabla `representantes`
--
CREATE TABLE representantes (
  IdRepresentante int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(20) NOT NULL,
  telefono int(11) NOT NULL,
  email varchar(30) NOT NULL,
  PRIMARY KEY (IdRepresentante)
);

--
-- Estructura de tabla para la tabla `locales`
--


CREATE TABLE IF NOT EXISTS locales (
  IdLocal int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(20) NOT NULL,
  telefono int(11) NOT NULL,
  CIF int(11) NOT NULL,
  direccion varchar(30) NOT NULL,
  CP int(11) NOT NULL,
  localidad varchar(20) NOT NULL,
  representante int(11) NOT NULL,
  activo tinyint(1) NOT NULL, 
  PRIMARY KEY (IdLocal, representante)
  
);


ALTER TABLE locales ADD CONSTRAINT representante_local_FK FOREIGN KEY (representante)
	REFERENCES representantes (IdRepresentante)
	ON DELETE CASCADE;
--
-- Ã�ndices para tablas volcadas
