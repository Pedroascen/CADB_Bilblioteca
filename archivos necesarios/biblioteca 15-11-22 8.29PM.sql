-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-11-2022 a las 02:29:01
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
DROP PROCEDURE IF EXISTS `consulta_ejemplares`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `consulta_ejemplares` (`pTitulo` VARCHAR(100), `pAutor` VARCHAR(100), `pTipoMaterial` VARCHAR(50), `pIdioma` VARCHAR(100), `pOrderby` VARCHAR(50))  BEGIN
-- SI TIPO DE MATERIAL ESTA VACIO, MOSTRAR TODOS LOS RESULTADOS 


CREATE TEMPORARY TABLE tmptable(`TipoMaterial` varchar(50), `codigoMaterial` varchar(15), `Titulo` varchar(250), `Autores` varchar(250), `MaterialInfo` varchar(3500) );

IF pTipoMaterial = 'Todos' OR pTipoMaterial = 'Libro' THEN
	INSERT INTO tmptable
	SELECT 'Libro' AS TipoMaterial,  a.codigoMaterial, a.Titulo, `Autor(es)`,  concat(`Autor(es)`, ', ', Pais, ', ', Editorial, ', ', AnioPublicacion) AS MaterialInfo
	FROM biblioteca.material AS a
	INNER JOIN biblioteca.libro AS b ON a.codigoMaterial = b.codigoMaterialL
	WHERE 
    (CASE
		WHEN length(pTitulo) = 0 THEN 1
		WHEN length(pTitulo) > 0 AND a.Titulo LIKE CONCAT('%', pTitulo , '%') THEN 1
		ELSE 0
	END) = 1
    AND (CASE
		WHEN length(pAutor) = 0 THEN 1
		WHEN length(pAutor) > 0 AND `Autor(es)` LIKE CONCAT('%', pAutor , '%') THEN 1
		ELSE 0
	END) = 1
	AND (CASE
		WHEN pIdioma = 'Todos' THEN 1
		WHEN length(pIdioma) > 0 AND b.Idioma = pIdioma THEN 1
		ELSE 0
	END) = 1;
END IF;


IF pTipoMaterial = 'Todos' OR pTipoMaterial = 'Revista' THEN
	INSERT INTO tmptable
	SELECT 'Revista' AS TipoMaterial, a.codigoMaterial, a.Titulo, '' as Autores, concat(Editorial, ', ', ISSN, ', ', Idioma, ', ', Tamano, ', ', Periodicidad, ', ', FechaPublicacion) AS MaterialInfo
	FROM biblioteca.material AS a
	INNER JOIN biblioteca.revista AS b ON a.codigoMaterial = b.codigoMaterialR
	WHERE 
    (CASE
		WHEN length(pTitulo) = 0 THEN 1
		WHEN length(pTitulo) > 0 AND a.Titulo LIKE CONCAT('%', pTitulo , '%') THEN 1
		ELSE 0
	END) = 1
	AND (CASE
		WHEN pIdioma = 'Todos' THEN 1
		WHEN length(pIdioma) > 0 AND b.Idioma = pIdioma THEN 1
		ELSE 0
	END) = 1;
END IF;


IF pTipoMaterial = 'Todos' OR pTipoMaterial = 'Obra' THEN
	INSERT INTO tmptable
	SELECT 'Obra' AS TipoMaterial, a.codigoMaterial, a.Titulo, `Autor(es)`, concat(`Autor(es)`, ', ', Pais, ', ', Editorial, ', ', AnioPublicacion) AS MaterialInfo
	FROM biblioteca.material AS a
	INNER JOIN biblioteca.obra AS b ON a.codigoMaterial = b.codigoMaterialO
	WHERE 
    (CASE
		WHEN length(pTitulo) = 0 THEN 1
		WHEN length(pTitulo) > 0 AND a.Titulo LIKE CONCAT('%', pTitulo , '%') THEN 1
		ELSE 0
	END) = 1
    AND (CASE
		WHEN length(pAutor) = 0 THEN 1
		WHEN length(pAutor) > 0 AND `Autor(es)` LIKE CONCAT('%', pAutor , '%') THEN 1
		ELSE 0
	END) = 1
	AND (CASE
		WHEN pIdioma = 'Todos' THEN 1
		WHEN length(pIdioma) > 0 AND b.Idioma = pIdioma THEN 1
		ELSE 0
	END) = 1;
END IF;


IF pTipoMaterial = 'Todos' OR pTipoMaterial = 'Tesis' THEN
	INSERT INTO tmptable
	SELECT 'Tesis' AS TipoMaterial, a.codigoMaterial, a.Titulo, `Autor(es)`,  concat(`Autor(es)`, ', ', Ciudad, ', ', Pais, ', ', Universidad, ', ', FechaPublicacion) AS MaterialInfo
	FROM biblioteca.material AS a
	INNER JOIN biblioteca.tesis AS b ON a.codigoMaterial = b.codigoMaterialT
	WHERE 
    (CASE
		WHEN length(pTitulo) = 0 THEN 1
		WHEN length(pTitulo) > 0 AND a.Titulo LIKE CONCAT('%', pTitulo , '%') THEN 1
		ELSE 0
	END) = 1
    AND (CASE
		WHEN length(pAutor) = 0 THEN 1
		WHEN length(pAutor) > 0 AND `Autor(es)` LIKE CONCAT('%', pAutor , '%') THEN 1
		ELSE 0
	END) = 1
	AND (CASE
		WHEN pIdioma = 'Todos' THEN 1
		WHEN length(pIdioma) > 0 AND b.Idioma = pIdioma THEN 1
		ELSE 0
	END) = 1;
END IF;


IF pTipoMaterial = 'Todos' OR pTipoMaterial = 'CD' THEN
	INSERT INTO tmptable
	SELECT 'CD' AS TipoMaterial, a.codigoMaterial, a.Titulo, `Autor(es)`,  concat(`Autor(es)`, ', ', ciudad_publicacion, ', ', pais_publicacion, ', ', anio_publicacion) AS MaterialInfo
	FROM biblioteca.material AS a
	INNER JOIN biblioteca.cd AS b ON a.codigoMaterial = b.codigoMaterialC
	WHERE
    (CASE
		WHEN length(pTitulo) = 0 THEN 1
		WHEN length(pTitulo) > 0 AND a.Titulo LIKE CONCAT('%', pTitulo , '%') THEN 1
		ELSE 0
	END) = 1
    AND (CASE
		WHEN length(pAutor) = 0 THEN 1
		WHEN length(pAutor) > 0 AND `Autor(es)` LIKE CONCAT('%', pAutor , '%') THEN 1
		ELSE 0
	END) = 1
	AND (CASE
		WHEN pIdioma = 'Todos' THEN 1
		WHEN length(pIdioma) > 0 AND b.idioma = pIdioma THEN 1
		ELSE 0
	END) = 1;
END IF;


SELECT * 
FROM tmptable
ORDER BY 
  CASE WHEN pOrderby = 'Título' THEN Titulo END ASC, 
  CASE WHEN pOrderby = 'Autor' THEN Autores END ASC,
  CASE WHEN pOrderby = 'Clasificación' THEN TipoMaterial END ASC;

DROP TABLE tmptable;
END$$

DROP PROCEDURE IF EXISTS `devolucion`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `devolucion` (`materialId` VARCHAR(40), `carnetId` VARCHAR(40))  BEGIN
DECLARE existsMaterial INT Default 0;
DECLARE existsCarnet INT Default 0;
DECLARE cPrestado INT Default 0;
DECLARE cDisponible INT Default 0;
DECLARE PrestamoId INT Default 0;
DECLARE LateCharge double Default 0;

SELECT count(*) INTO existsMaterial from material WHERE codigoMaterial = materialId;
SELECT count(*) INTO existsCarnet from usuario WHERE carnet = carnetId;

SET existsMaterial = IFNULL(existsMaterial, 0);
SET existsCarnet = IFNULL(existsCarnet, 0);

SELECT max(cantidadDisponibles) INTO cDisponible from material WHERE codigoMaterial = materialId;
SELECT max(cantidadPrestados) INTO cPrestado from material WHERE codigoMaterial = materialId;
SET cPrestado = IFNULL(cPrestado, 0) - 1;

SELECT max(id) INTO PrestamoId from prestamo 
where carnet = carnetId AND codmaterial = materialId and estado = 1;
SET PrestamoId = IFNULL(PrestamoId, 0);

SELECT (DATEDIFF(CURDATE(), fecha_fin) * 0.25) INTO LateCharge 
from prestamo where carnet = carnetId AND codmaterial = materialId and estado = 1 limit 1;

IF LateCharge < 0 THEN
	SET LateCharge = 0;
END IF;

IF existsMaterial = 0 THEN
	SELECT '¡Código de material inválido!' as Result, 0 PrestamoId;
ELSEIF existsCarnet = 0 THEN 
	SELECT '¡Carnet inválido!' as Result, 0 PrestamoId;
ELSEIF PrestamoId = 0 THEN 
	SELECT 'El préstamo no existe.' as Result, 0 PrestamoId;
ELSEIF PrestamoId > 0 THEN
	UPDATE `biblioteca`.`prestamo` SET 
    `fecha_devolucion` = CURDATE(), 
    `mora` = LateCharge, 
    `estado` = 0
	where carnet = carnetId AND codmaterial = materialId and estado = 1;
    
    UPDATE `biblioteca`.`material` SET 
    `cantidadDisponibles` = (cDisponible + 1),  
    `cantidadPrestados` = cPrestado,
    `estado` = 1
	where codigoMaterial = materialId;
    
    IF LateCharge > 0 THEN
		SELECT 	CONCAT('Devolución realizada. Favor cancelar en concepto de mora: $', LateCharge) as Result, 
				PrestamoId AS PrestamoId;
	ELSE
		SELECT 'Devolución realizada con éxito.' as Result, PrestamoId AS PrestamoId;
	END IF;
    
END IF;

END$$

DROP PROCEDURE IF EXISTS `new_upd_cd`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_cd` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` VARCHAR(20), `cejemp` INT, `autor` VARCHAR(250), `paispubli` VARCHAR(25), `ciudadpub` VARCHAR(25), `anio_publi` INT(4), `volumen` INT, `idioma` VARCHAR(15), `tema` VARCHAR(25))  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(idCD) INTO lastID from cd;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('CDS', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadDisponibles`,`cantidadPrestados`, `estado`)
	VALUES (lcodmaterial, titulo, 4, ufisica, cejemp, cejemp, 0, 1);

	INSERT INTO `biblioteca`.`cd`(`IdCD`,`codigoMaterialC`,`Autor(es)`,`pais_publicacion`,`ciudad_publicacion`, `anio_publicacion`, `volumen`, `idioma`, `tema`)
	VALUES(lastID, lcodmaterial, autor, paispubli, ciudadpub, anio_publi, volumen, idioma, tema);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `biblioteca`.`material` SET `Titulo` = titulo, `ubicacionFisica` = ufisica, `cantidadEjemplares` = cejemp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `biblioteca`.`cd` 
   SET `Autor(es)` = autor, `pais_publicacion` = paispubli, `ciudad_publicacion` = ciudadpub, `anio_publicacion` = anio_publi, `volumen`=volumen, `idioma`=idioma, `tema`=tema
   WHERE `codigoMaterialC` = codmaterial;
END IF;


END$$

DROP PROCEDURE IF EXISTS `new_upd_libro`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_libro` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` VARCHAR(20), `cejemp` INT, `autor` VARCHAR(100), `npaginas` INT, `editorial` VARCHAR(50), `pais` VARCHAR(25), `isbn` INT, `anio` INT, `edicion` INT, `idioma` VARCHAR(15), `materia` VARCHAR(15), `descripcion` VARCHAR(250))  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdLibro) INTO lastID from libro;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('LIB', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadPrestados`,`cantidadDisponibles`, `estado`)
	VALUES (lcodmaterial, titulo, 1, ufisica, cejemp, 0, cejemp, 1);

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

DROP PROCEDURE IF EXISTS `new_upd_obra`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_obra` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` VARCHAR(20), `cejemp` INT, `autor` VARCHAR(100), `npaginas` INT, `editorial` VARCHAR(45), `pais` VARCHAR(25), `isbn` INT, `anio` INT, `edicion` INT, `idioma` VARCHAR(15), `genero` VARCHAR(15))  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdObra) INTO lastID from Obra;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('OBR', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadDisponibles`,`cantidadPrestados`, `estado`)
	VALUES (lcodmaterial, titulo, 2, ufisica, cejemp, cejemp, 0, 1);

	INSERT INTO `biblioteca`.`obra`(`IdObra`,`codigoMaterialO`,`Autor(es)`,`NumeroPaginas`,`Editorial`, `Pais`, `ISBN`, `AnioPublicacion`, `Edicion`, `Idioma`, `genero`)
	VALUES(lastID, lcodmaterial, autor, npaginas, editorial, pais, isbn, anio, edicion, idioma, genero);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `biblioteca`.`material` SET `Titulo` = titulo, `ubicacionFisica` = ufisica, `cantidadEjemplares` = cejemp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `biblioteca`.`obra` 
   SET `Autor(es)` = autor, `NumeroPaginas` = npaginas, `Editorial` = editorial, `Pais` = pais, `ISBN` = isbn, `AnioPublicacion` = anio, `Edicion` = edicion, `Idioma` = idioma, `Genero` = genero
   WHERE `codigoMaterialO` = codmaterial;
END IF;

END$$

DROP PROCEDURE IF EXISTS `new_upd_revista`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_revista` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` VARCHAR(20), `cejemp` INT, `editorial` VARCHAR(50), `issn` INT, `idioma` VARCHAR(15), `tamano` VARCHAR(50), `periodicidad` VARCHAR(20), `fechapublicacion` DATE)  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdRevista) INTO lastID from revista;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('REV', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadDisponibles`,`cantidadPrestados`, `estado`)
	VALUES (lcodmaterial, titulo, 3, ufisica, cejemp, cejemp, 0, 1);

	INSERT INTO `biblioteca`.`revista`(`IdRevista`,`codigoMaterialR`,`Editorial`,`ISSN`,`Idioma`,`tamano`, `Periodicidad`, `FechaPublicacion`)
	VALUES(lastID, lcodmaterial, editorial, issn, idioma, tamano, periodicidad, fechapublicacion);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `biblioteca`.`material` SET `Titulo` = titulo, `ubicacionFisica` = ufisica, `cantidadEjemplares` = cejemp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `biblioteca`.`revista` 
   SET `Editorial` = editorial, `ISSN` = issn, `Idioma` = idioma, `Tamano` = tamano, `Periodicidad` = periodicidad, `FechaPublicacion` = fechapublicacion
   WHERE `codigoMaterialR` = codmaterial;
END IF;

END$$

DROP PROCEDURE IF EXISTS `new_upd_tesis`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_tesis` (`codmaterial` VARCHAR(8), `titulo` VARCHAR(100), `ufisica` VARCHAR(20), `cejemp` INT, `autor` VARCHAR(250), `pais` VARCHAR(25), `ciudad` VARCHAR(25), `universidad` VARCHAR(250), `carrera` VARCHAR(250), `idioma` VARCHAR(15), `fechaPublicacion` DATE, `numeroPaginas` INT, `descripcion` VARCHAR(250), `palabrasclave` VARCHAR(250))  BEGIN
DECLARE lcodmaterial varchar(10);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdTesis) INTO lastID from tesis;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('TES', '', CONVERT( LPAD(CONVERT(lastID, CHAR(7)), 7, '0'), CHAR(10)));
    
    INSERT INTO `biblioteca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`ubicacionFisica`,`cantidadEjemplares`,`cantidadDisponibles`,`cantidadPrestados`, `estado`)
	VALUES (lcodmaterial, titulo, 5, ufisica, cejemp, cejemp, 0, 1);

	INSERT INTO `biblioteca`.`tesis`(`IdTesis`,`codigoMaterialT`,`Autor(es)`,`Pais`,`Ciudad`, `Universidad`, `Carrera`, `Idioma`, `FechaPublicacion`, `NumeroPaginas`, `Descripcion`, `Palabras clave`)
	VALUES(lastID, lcodmaterial, autor, pais, ciudad, universidad, carrera, idioma, FechaPublicacion, numeroPaginas, descripcion, palabrasclave);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `biblioteca`.`material` SET `Titulo` = titulo, `ubicacionFisica` = ufisica, `cantidadEjemplares` = cejemp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `biblioteca`.`tesis` 
   SET `Autor(es)` = autor, `Pais` = Pais, `Ciudad` = ciudad, `Universidad` = Universidad, `Carrera` = Carrera, `Idioma` = idioma, `FechaPublicacion` = FechaPublicacion, `NumeroPaginas` = NumeroPaginas, `Descripcion` = Descripcion, `Palabras clave` = Palabrasclave
   WHERE `codigoMaterialT` = codmaterial;
END IF;


END$$

DROP PROCEDURE IF EXISTS `new_user`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_user` (`uNombre` VARCHAR(25), `uApellido` VARCHAR(25), `uPassword` VARCHAR(40), `uRolId` INT)  BEGIN
DECLARE CarnetID varchar(8);
DECLARE cYear varchar(4) Default YEAR(CURDATE());

DECLARE sequence varchar(4);
DECLARE tUsers INT Default 0;
SELECT count(*) INTO tUsers from `biblioteca`.`usuario`;
SET tUsers = IFNULL(tUsers, 0) + 1;
SET sequence = CONVERT(LPAD(CONVERT(tUsers, CHAR(4)), 4, '0'), CHAR(4));

SET CarnetID = upper(substring(uNombre, 1, 1));
SET CarnetID = concat(CarnetID, upper(substring(uApellido, 1, 1)));
SET CarnetID = concat(CarnetID, upper(substring(cYear, 3, 2)));
SET CarnetID = concat(CarnetID, sequence);


INSERT INTO `biblioteca`.`usuario`
(`carnet`,`nombre`,`apellido`,`contrasena`,`id_rol`)
VALUES (CarnetID,uNombre,uApellido,uPassword,uRolId);

select CarnetID as CarnetID;

END$$

DROP PROCEDURE IF EXISTS `prestamo`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `prestamo` (`materialId` VARCHAR(40), `carnetId` VARCHAR(40))  BEGIN
DECLARE tiempolimit INT Default 0;
DECLARE fechafin date;
DECLARE lastID INT Default 0;

DECLARE existsMaterial INT Default 0;
DECLARE existsCarnet INT Default 0;
DECLARE cDisponible INT Default 0;
DECLARE cPrestado INT Default 0;
DECLARE LimiteDePrestamos INT Default 0;
DECLARE CantidadPrestadoPorUser INT Default 0;
DECLARE PrestamoActivo INT Default 0;

SELECT privilegios.tiempo_limite INTO tiempolimit
FROM  `biblioteca`.`usuario` 
INNER JOIN `biblioteca`.`privilegios` ON `usuario`.`id_rol` = `privilegios`.`rol_id` 
WHERE `usuario`.`carnet` = carnetId
LIMIT 1;

SELECT privilegios.cant_prestamos INTO LimiteDePrestamos
FROM  `biblioteca`.`usuario` 
INNER JOIN `biblioteca`.`privilegios` ON `usuario`.`id_rol` = `privilegios`.`rol_id` 
WHERE `usuario`.`carnet` = carnetId
LIMIT 1;

SELECT count(*) INTO existsMaterial from material WHERE codigoMaterial = materialId;
SELECT count(*) INTO existsCarnet from usuario WHERE carnet = carnetId;
SELECT count(*) INTO CantidadPrestadoPorUser from prestamo WHERE estado = 1 and carnet = carnetId;
SELECT count(*) INTO PrestamoActivo from prestamo WHERE estado = 1 and carnet = carnetId AND codmaterial = materialId;

SELECT max(id) INTO lastID from prestamo;
SELECT max(cantidadDisponibles) INTO cDisponible from material WHERE codigoMaterial = materialId;
SELECT max(cantidadPrestados) INTO cPrestado from material WHERE codigoMaterial = materialId;

SET cDisponible = IFNULL(cDisponible, 0);
SET cPrestado = IFNULL(cPrestado, 0) + 1;
SET fechafin = DATE_ADD(CURDATE(), INTERVAL tiempolimit DAY);
SET lastID = IFNULL(lastID, 0) + 1;
SET CantidadPrestadoPorUser = IFNULL(CantidadPrestadoPorUser, 0);
SET PrestamoActivo = IFNULL(PrestamoActivo, 0);

IF existsMaterial = 0 THEN
	SELECT '¡Código de material inválido!' as Result, 0 PrestamoId;
ELSEIF existsCarnet = 0 THEN 
	SELECT '¡Carnet inválido!' as Result, 0 PrestamoId;
ELSEIF cDisponible = 0 THEN 
	SELECT 'Lo sentimos. Este ejemplar no se encuentra disponible.' as Result, 0 PrestamoId;
ELSEIF LimiteDePrestamos = CantidadPrestadoPorUser THEN 
	SELECT 'Ha alcanzado su límite de préstamos, por lo que este préstamo no se puede efectuar.' as Result, 0 PrestamoId;
ELSEIF PrestamoActivo > 0 THEN 
	SELECT 'Ya tiene un préstamo activo para este mismo ejemplar.' as Result, 0 PrestamoId;
ELSE 
	INSERT INTO `biblioteca`.`prestamo`
	(`id`, `carnet`, `codmaterial`, `fecha_inicio`, `fecha_fin`, `estado`, `mora`,`fecha_devolucion`)
	VALUES (lastID, carnetId, materialId, CURDATE(), fechafin, 1, 0, null);

	UPDATE `biblioteca`.`material` SET `cantidadDisponibles` = (cDisponible - 1), `cantidadPrestados` = cPrestado 
	WHERE `codigoMaterial` = materialId;
    
    SELECT 'Préstamo realizado con éxito.' as Result, lastID AS PrestamoId;
END IF;

-- - Que al llegar cantidad disponible a 0, el estado cambie a 0 (en materiales).
SELECT max(cantidadDisponibles) INTO cDisponible from material WHERE codigoMaterial = materialId;
SET cDisponible = IFNULL(cDisponible, 0);

IF cDisponible = 0 THEN
	UPDATE `biblioteca`.`material` SET `estado` = 0 WHERE `codigoMaterial` = materialId;
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
--
-- Volcado de datos para la tabla `cd`
--

INSERT INTO `cd` (`IdCD`, `CodigoMaterialC`, `Autor(es)`, `pais_publicacion`, `ciudad_publicacion`, `anio_publicacion`, `volumen`, `idioma`, `tema`) VALUES
(1, 'CDS0000001', 'AC/DC', 'USA', 'USA', 2002, 3, 'Ingles', 'T.N.T');

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
--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`IdLibro`, `codigoMaterialL`, `Autor(es)`, `NumeroPaginas`, `Editorial`, `Pais`, `ISBN`, `AnioPublicacion`, `Edicion`, `Idioma`, `Materia`, `Descripcion`) VALUES
(1, 'LIB0000001', 'Anonimo', 1000, 'Anonimo', 'España', 2003341234, 2006, 15, 'Español', 'Religioso', 'Ninguna'),
(2, 'LIB0000002', 'Anonimo', 300, 'Hermanos Unidos', 'El Salvador', 2012345333, 2005, 1, 'Español', 'Literatura', 'Ninguna'),
(3, 'LIB0000003', 'Anonimo', 600, 'Hrnos Unidos', 'El Salvador', 1234565665, 2006, 6, 'Español', 'Literatura', 'Historia de Fantasia'),
(4, 'LIB0000004', 'Anonimo', 600, 'Hrnos Unidos', 'El Salvador', 1234345643, 2006, 2, 'Español', 'Literatura', 'Ninguna');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `codigoMaterial` varchar(10) NOT NULL,
  `Titulo` varchar(60) NOT NULL,
  `codigoTipoMaterial` int(11) NOT NULL,
  `ubicacionFisica` varchar(20) NOT NULL,
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
--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`codigoMaterial`, `Titulo`, `codigoTipoMaterial`, `ubicacionFisica`, `cantidadEjemplares`, `cantidadDisponibles`, `cantidadPrestados`, `estado`) VALUES
('CDS0000001', 'Clasicos Rock', 4, 'E-6', 10, 10, 0, 1),
('LIB0000001', 'La Biblia', 1, 'E-1', 5, 5, 0, 1),
('LIB0000002', 'Don Quijote ', 1, 'E-3', 3, 3, 0, 1),
('LIB0000003', 'El Mago de Oz', 1, 'E-2', 6, 6, 0, 1),
('LIB0000004', 'Las Cronicas', 1, 'E-2', 5, 4, 1, 1),
('OBR0000001', 'Prometeo Encadenado', 2, 'E-2', 5, 5, 0, 1),
('REV0000001', 'Salud', 3, 'E-4', 5, 4, 1, 1),
('TES0000001', 'Test Psicologico', 5, 'E-2', 1, 0, 1, 0);

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
--
-- Volcado de datos para la tabla `obra`
--

INSERT INTO `obra` (`IdObra`, `codigoMaterialO`, `Autor(es)`, `NumeroPaginas`, `Editorial`, `Pais`, `ISBN`, `AnioPublicacion`, `Edicion`, `Idioma`, `Genero`) VALUES
(1, 'OBR0000001', 'Esquilo', 300, 'Editorial Salvadoreña Hermanos Unidos', 'El Salvador', 2134456778, 2000, 2, 'Español', 'Epico');

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
  `fecha_devolucion` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `carnet_idx` (`carnet`),
  KEY `codmaterial_idx` (`codmaterial`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `prestamo`
--

TRUNCATE TABLE `prestamo`;
--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`id`, `carnet`, `codmaterial`, `fecha_inicio`, `fecha_fin`, `estado`, `mora`, `fecha_devolucion`) VALUES
(1, 'PH220009', 'TES0000001', '2022-11-13', '2022-11-20', 0, 0, '2022-11-15'),
(2, 'JS220007', 'REV0000001', '2022-11-13', '2022-11-20', 0, 0, '2022-11-15'),
(3, 'PH220009', 'CDS0000001', '2022-11-15', '2022-11-22', 0, 0, '2022-11-15'),
(4, 'AA220006', 'TES0000001', '2022-11-15', '2022-11-22', 1, 0, NULL),
(5, 'PH220009', 'REV0000001', '2022-11-15', '2022-11-22', 1, 0, NULL),
(6, 'PH220009', 'LIB0000004', '2022-11-15', '2022-11-22', 1, 0, NULL);

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
--
-- Volcado de datos para la tabla `revista`
--

INSERT INTO `revista` (`IdRevista`, `codigoMaterialR`, `Editorial`, `ISSN`, `Idioma`, `Tamano`, `Periodicidad`, `FechaPublicacion`) VALUES
(1, 'REV0000001', 'La Prensa', 2001234001, 'Español', '25x30', '20 Jun', '2022-12-20');

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
--
-- Volcado de datos para la tabla `tesis`
--

INSERT INTO `tesis` (`IdTesis`, `codigoMaterialT`, `Autor(es)`, `Pais`, `Ciudad`, `Universidad`, `Carrera`, `Idioma`, `FechaPublicacion`, `NumeroPaginas`, `Descripcion`, `Palabras clave`) VALUES
(1, 'TES0000001', 'Villafuerte', 'El Salvador', 'Ahuachapan', 'UES', 'Psicologia', 'Español', '2022-11-13', 945, 'Estudio sobre problemas sociales', 'Neuroartes');

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
('AA220006', 'Adriana', 'Abrego', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', 3),
('admin', 'admin', 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 1),
('JP220008', 'Juan ', 'Peres', '8cb2237d0679ca88db6464eac60da96345513964', 3),
('JS220007', 'John', 'Smith', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', 3),
('PH220009', 'Pablo Roberto', 'Humberto', '8cb2237d0679ca88db6464eac60da96345513964', 3);

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
