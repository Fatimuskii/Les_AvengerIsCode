-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-05-2019 a las 21:09:20
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `les_avengeris`
--

-- --------------------------------------------------------


--
-- Estructura de tabla para la tabla `representantes`
--
CREATE TABLE IF NOT EXISTS `representantes` (
`IdRepresentante` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `telefono` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`IdRepresentante`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)
)ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;

--
-- Estructura de tabla para la tabla `locales`
--


CREATE TABLE IF NOT EXISTS `locales` (
  `IdLocal` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `telefono` int(11) NOT NULL,
  `CIF` int(11) NOT NULL,
  `direccion` int(11) NOT NULL,
  `CP` int(11) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `representante` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL, 
  PRIMARY KEY (`IdLocal`, `representante`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC),
  INDEX `fk_local_representante_idx` (`representante` ASC),
  CONSTRAINT `fk_local_representante`
    FOREIGN KEY (`representante`)
    REFERENCES `representantes` (`IdRepresentante`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

