-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2019 a las 04:20:57
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `construccion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `ID_DEPARTAMENTO` int(20) NOT NULL,
  `NOMBRE_DEPARTAMENTO` varchar(20) NOT NULL,
  `UBICACION_FISICA_DEPARTAMENTO` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `ID_EMPLEADO` varchar(20) NOT NULL,
  `COD_EMPLEADO` int(20) DEFAULT NULL,
  `CEDULA_EMPLEADO` int(20) DEFAULT NULL,
  `NOMBRE_EMPLEADO` varchar(50) DEFAULT NULL,
  `ID_DEPARTAMENTO` int(20) DEFAULT NULL,
  `ID_PUESTO` varchar(40) DEFAULT NULL,
  `SALARIO_MENSUAL_EMPLEADO` int(15) DEFAULT NULL,
  `RESPONSABLE_AREA` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel_riesgo`
--

CREATE TABLE `nivel_riesgo` (
  `ID_NIVEL_RIESGO` int(1) NOT NULL,
  `TIPO_RIESGO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

CREATE TABLE `puesto` (
  `ID_PUESTO` int(20) NOT NULL,
  `NOMBRE_PUESTO` varchar(30) NOT NULL,
  `ID_NIVEL_RIESGO` int(1) NOT NULL,
  `NIVEL_SALARIO_MIN` int(2) NOT NULL,
  `NIVEL_SALARIO_MAX` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_transaccion`
--

CREATE TABLE `registro_transaccion` (
  `ID_TRANSACCION_INGRESO` int(20) NOT NULL,
  `ID_EMPLEADO` varchar(20) NOT NULL,
  `ID_TIPO_INGRESO` varchar(20) NOT NULL,
  `FECHA` varchar(15) NOT NULL,
  `MONTO` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_transaccion_deduccion`
--

CREATE TABLE `registro_transaccion_deduccion` (
  `ID_TRANSACCION_DEDUCCION` int(20) NOT NULL,
  `ID_EMPLEADO` varchar(20) NOT NULL,
  `ID_TIPO_DEDUCCION` varchar(20) NOT NULL,
  `FECHA` varchar(15) NOT NULL,
  `MONTO` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_deduccion`
--

CREATE TABLE `tipo_deduccion` (
  `ID_TIPO_DEDUCCION` int(20) NOT NULL,
  `NOMBRE_TIPO_DEDUCCION` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_ingreso`
--

CREATE TABLE `tipo_de_ingreso` (
  `ID_TIPO_INGRESOI` int(20) NOT NULL,
  `NOMBRE_TIPO_INGRESO` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`ID_DEPARTAMENTO`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`ID_EMPLEADO`);

--
-- Indices de la tabla `nivel_riesgo`
--
ALTER TABLE `nivel_riesgo`
  ADD PRIMARY KEY (`ID_NIVEL_RIESGO`);

--
-- Indices de la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD PRIMARY KEY (`ID_PUESTO`);

--
-- Indices de la tabla `registro_transaccion`
--
ALTER TABLE `registro_transaccion`
  ADD PRIMARY KEY (`ID_TRANSACCION_INGRESO`);

--
-- Indices de la tabla `registro_transaccion_deduccion`
--
ALTER TABLE `registro_transaccion_deduccion`
  ADD PRIMARY KEY (`ID_TRANSACCION_DEDUCCION`);

--
-- Indices de la tabla `tipo_deduccion`
--
ALTER TABLE `tipo_deduccion`
  ADD PRIMARY KEY (`ID_TIPO_DEDUCCION`);

--
-- Indices de la tabla `tipo_de_ingreso`
--
ALTER TABLE `tipo_de_ingreso`
  ADD PRIMARY KEY (`ID_TIPO_INGRESOI`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
