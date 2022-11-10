-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 10-11-2022 a las 23:55:30
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--
CREATE DATABASE IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `biblioteca`;

DELIMITER $$
--
-- Procedimientos
--
DROP PROCEDURE IF EXISTS `new_upd_libro`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_libro` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` INT, `cejemp` INT, `autor` VARCHAR(100), `npaginas` INT, `editorial` VARCHAR(50), `pais` VARCHAR(25), `isbn` INT, `anio` INT, `edicion` INT, `idioma` VARCHAR(15), `materia` VARCHAR(15), `descripcion` VARCHAR(250))  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdLibro) INTO lastID from libro;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('LIB', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadPrestados`,`cantidadDisponibles`, `estado`)
	VALUES (lcodmaterial, titulo, 1, ufisica, cejemp, cejemp, 0, 1);

	INSERT INTO `biblioteca`.`libro`(`IdLibro`,`codigoMaterialL`,`Autor(es)`,`NumeroPaginas`,`Editorial`, `Pais`, `ISBN`, `AnioPublicacion`, `Edicion`, `Idioma`, `Materia`, `Descripcion`)
	VALUES(lastID, lcodmaterial, autor, npaginas, editorial, pais, isbn, anio, edicion, idioma, materia, descripcion);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `biblioteca`.`material` SET `Titulo` = titulo, `ubicacionFisica` = ufisica, `cantidadEjemplares` = cejemp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `biblioteca`.`libro` 
   SET `Autor(es)` = autor, `NumeroPaginas` = npaginas, `Editorial` = editorial, `Pais` = pais, `ISBN` = isbn, `AnioPublicacion` = anio, `Edicion` = edicion, `Idioma` = idioma, `Materia` = materia, `Descripcion` = descripcion
   WHERE `codigoMaterialL` = codmaterial;
END IF;


END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cd`
--

DROP TABLE IF EXISTS `cd`;
CREATE TABLE IF NOT EXISTS `cd` (
  `IdCD` int(11) NOT NULL,
  `CodigoMaterialC` varchar(10) NOT NULL,
  `Autor(es)` varchar(250) NOT NULL,
  `pais_publicacion` varchar(25) NOT NULL,
  `ciudad_publicacion` varchar(25) NOT NULL,
  `anio_publicacion` year(4) NOT NULL,
  `volumen` int(11) NOT NULL,
  `idioma` varchar(15) NOT NULL,
  `tema` varchar(25) NOT NULL,
  PRIMARY KEY (`IdCD`),
  KEY `CodigoMaterialC_idx` (`CodigoMaterialC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `cd`
--

TRUNCATE TABLE `cd`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

DROP TABLE IF EXISTS `libro`;
CREATE TABLE IF NOT EXISTS `libro` (
  `IdLibro` int(11) NOT NULL,
  `codigoMaterialL` varchar(10) NOT NULL,
  `Autor(es)` varchar(100) NOT NULL,
  `NumeroPaginas` int(11) NOT NULL,
  `Editorial` varchar(50) NOT NULL,
  `Pais` varchar(25) NOT NULL,
  `ISBN` bigint(13) NOT NULL,
  `AnioPublicacion` year(4) NOT NULL,
  `Edicion` int(11) NOT NULL,
  `Idioma` varchar(15) NOT NULL,
  `Materia` varchar(15) NOT NULL,
  `Descripcion` varchar(250) NOT NULL,
  PRIMARY KEY (`IdLibro`),
  KEY `codigoMaterialL_idx` (`codigoMaterialL`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `libro`
--

TRUNCATE TABLE `libro`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `codigoMaterial` varchar(10) NOT NULL,
  `Titulo` varchar(60) NOT NULL,
  `codigoTipoMaterial` int(11) NOT NULL,
  `ubicacionFisica` int(11) NOT NULL,
  `cantidadEjemplares` int(11) NOT NULL,
  `cantidadDisponibles` int(11) NOT NULL,
  `cantidadPrestados` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`codigoMaterial`),
  KEY `codigoTipoMaterial_idx` (`codigoTipoMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `material`
--

TRUNCATE TABLE `material`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obra`
--

DROP TABLE IF EXISTS `obra`;
CREATE TABLE IF NOT EXISTS `obra` (
  `IdObra` int(11) NOT NULL,
  `codigoMaterialO` varchar(10) NOT NULL,
  `Autor(es)` varchar(100) NOT NULL,
  `NumeroPaginas` int(11) NOT NULL,
  `Editorial` varchar(45) NOT NULL,
  `Pais` varchar(25) NOT NULL,
  `ISBN` bigint(13) NOT NULL,
  `AnioPublicacion` year(4) NOT NULL,
  `Edicion` int(11) NOT NULL,
  `Idioma` varchar(15) NOT NULL,
  `Genero` varchar(15) NOT NULL,
  PRIMARY KEY (`IdObra`),
  KEY `codigoMaterialO_idx` (`codigoMaterialO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `obra`
--

TRUNCATE TABLE `obra`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
CREATE TABLE IF NOT EXISTS `prestamo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carnet` varchar(8) NOT NULL,
  `codmaterial` varchar(10) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `estado` int(11) NOT NULL,
  `mora` double NOT NULL,
  `fecha_devolucion` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `carnet_idx` (`carnet`),
  KEY `codmaterial_idx` (`codmaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `prestamo`
--

TRUNCATE TABLE `prestamo`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegios`
--

DROP TABLE IF EXISTS `privilegios`;
CREATE TABLE IF NOT EXISTS `privilegios` (
  `rol_id` int(11) NOT NULL,
  `tiempo_limite` int(11) NOT NULL,
  `cant_prestamos` int(11) NOT NULL,
  PRIMARY KEY (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `privilegios`
--

TRUNCATE TABLE `privilegios`;
--
-- Volcado de datos para la tabla `privilegios`
--

INSERT INTO `privilegios` (`rol_id`, `tiempo_limite`, `cant_prestamos`) VALUES
(2, 14, 6),
(3, 7, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revista`
--

DROP TABLE IF EXISTS `revista`;
CREATE TABLE IF NOT EXISTS `revista` (
  `IdRevista` int(11) NOT NULL,
  `codigoMaterialR` varchar(10) NOT NULL,
  `Editorial` varchar(50) NOT NULL,
  `ISSN` int(8) NOT NULL,
  `Idioma` varchar(15) NOT NULL,
  `Tamano` varchar(50) NOT NULL,
  `Periodicidad` varchar(20) NOT NULL,
  `FechaPublicacion` date NOT NULL,
  PRIMARY KEY (`IdRevista`),
  KEY `codigoMaterialR_idx` (`codigoMaterialR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `revista`
--

TRUNCATE TABLE `revista`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

DROP TABLE IF EXISTS `rol`;
CREATE TABLE IF NOT EXISTS `rol` (
  `id` int(11) NOT NULL,
  `nombre_rol` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `rol`
--

TRUNCATE TABLE `rol`;
--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `nombre_rol`) VALUES
(1, 'Administrador'),
(2, 'Profesor'),
(3, 'Alumno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tesis`
--

DROP TABLE IF EXISTS `tesis`;
CREATE TABLE IF NOT EXISTS `tesis` (
  `IdTesis` int(11) NOT NULL,
  `codigoMaterialT` varchar(10) NOT NULL,
  `Autor(es)` varchar(250) NOT NULL,
  `Pais` varchar(25) NOT NULL,
  `Ciudad` varchar(25) NOT NULL,
  `Universidad` varchar(250) NOT NULL,
  `Carrera` varchar(250) NOT NULL,
  `Idioma` varchar(15) NOT NULL,
  `FechaPublicacion` date NOT NULL,
  `NumeroPaginas` int(11) NOT NULL,
  `Descripcion` varchar(250) NOT NULL,
  `Palabras clave` varchar(250) NOT NULL,
  PRIMARY KEY (`IdTesis`),
  KEY `codigoMaterialT_idx` (`codigoMaterialT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `tesis`
--

TRUNCATE TABLE `tesis`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipomaterial`
--

DROP TABLE IF EXISTS `tipomaterial`;
CREATE TABLE IF NOT EXISTS `tipomaterial` (
  `codigoTipoMaterial` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoTipoMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `tipomaterial`
--

TRUNCATE TABLE `tipomaterial`;
--
-- Volcado de datos para la tabla `tipomaterial`
--

INSERT INTO `tipomaterial` (`codigoTipoMaterial`, `descripcion`) VALUES
(1, 'Libro'),
(2, 'Obra'),
(3, 'Revista'),
(4, 'CD'),
(5, 'Tesis');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `carnet` varchar(8) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `contrasena` varchar(40) NOT NULL,
  `id_rol` int(11) NOT NULL,
  PRIMARY KEY (`carnet`),
  KEY `id_rol` (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `usuario`
--

TRUNCATE TABLE `usuario`;
--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`carnet`, `nombre`, `apellido`, `contrasena`, `id_rol`) VALUES
('admin', 'admin', 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 1),
('profesor', 'profesor', 'profesor', '8cb2237d0679ca88db6464eac60da96345513964', 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cd`
--
ALTER TABLE `cd`
  ADD CONSTRAINT `CodigoMaterialC` FOREIGN KEY (`CodigoMaterialC`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `codigoMaterialL` FOREIGN KEY (`codigoMaterialL`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `material`
--
ALTER TABLE `material`
  ADD CONSTRAINT `codigoTipoMaterial` FOREIGN KEY (`codigoTipoMaterial`) REFERENCES `tipomaterial` (`codigoTipoMaterial`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `obra`
--
ALTER TABLE `obra`
  ADD CONSTRAINT `codigoMaterialO` FOREIGN KEY (`codigoMaterialO`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `carnet` FOREIGN KEY (`carnet`) REFERENCES `usuario` (`carnet`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `codmaterial` FOREIGN KEY (`codmaterial`) REFERENCES `material` (`codigoMaterial`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `privilegios`
--
ALTER TABLE `privilegios`
  ADD CONSTRAINT `rol_id` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `revista`
--
ALTER TABLE `revista`
  ADD CONSTRAINT `codigoMaterialR` FOREIGN KEY (`codigoMaterialR`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `tesis`
--
ALTER TABLE `tesis`
  ADD CONSTRAINT `codigoMaterialT` FOREIGN KEY (`codigoMaterialT`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `id_rol` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
