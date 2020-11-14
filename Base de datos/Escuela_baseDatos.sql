CREATE DATABASE  IF NOT EXISTS `escuela` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `escuela`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: escuela
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `calificaciones`
--

DROP TABLE IF EXISTS `calificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calificaciones` (
  `idcalificacion` int NOT NULL AUTO_INCREMENT,
  `idestudiante` int NOT NULL,
  `idclase` int NOT NULL,
  `calificacion` varchar(45) NOT NULL,
  PRIMARY KEY (`idcalificacion`),
  KEY `idestudiante_fk_idx` (`idestudiante`),
  KEY `idclase_fk_idx` (`idclase`),
  CONSTRAINT `idclase_fk` FOREIGN KEY (`idclase`) REFERENCES `clases` (`idclase`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idestudiante_fk` FOREIGN KEY (`idestudiante`) REFERENCES `estudiantes` (`idestudiante`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calificaciones`
--

LOCK TABLES `calificaciones` WRITE;
/*!40000 ALTER TABLE `calificaciones` DISABLE KEYS */;
INSERT INTO `calificaciones` VALUES (1,1,1,'6.0'),(2,1,3,'6.0'),(3,1,5,'6.0'),(4,1,7,'6.0'),(5,1,9,'6.0'),(6,2,1,'9.0'),(7,2,3,'9.0'),(8,2,5,'9.0'),(9,2,7,'9.0'),(10,2,9,'9.0'),(11,3,1,'6.5'),(12,3,3,'6.5'),(13,3,5,'6.5'),(14,3,7,'6.5'),(15,3,9,'6.5'),(16,4,1,'7.0'),(17,4,3,'7.0'),(18,4,5,'7.0'),(19,4,7,'7.0'),(20,4,9,'7.0'),(21,5,1,'7.5'),(22,5,3,'7.5'),(23,5,5,'7.5'),(24,5,7,'7.5'),(25,5,9,'7.5'),(26,6,1,'8.5'),(27,6,3,'8.5'),(28,6,5,'8.5'),(29,6,7,'8.5'),(30,6,9,'8.5'),(31,7,1,'10'),(32,7,3,'10'),(33,7,5,'10'),(34,7,7,'10'),(35,7,9,'10'),(36,8,1,'6'),(37,8,3,'7'),(38,8,5,'8'),(39,8,7,'9'),(40,8,9,'10'),(41,9,1,'7.7'),(42,9,3,'8.5'),(43,9,5,'9.2'),(44,9,7,'10'),(45,9,9,'9.8'),(46,10,1,'5.0'),(47,10,3,'5.0'),(48,10,5,'5.0'),(49,10,7,'5.0'),(50,10,9,'5.0'),(51,10,2,'10');
/*!40000 ALTER TABLE `calificaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clases`
--

DROP TABLE IF EXISTS `clases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clases` (
  `idclase` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `idprofesor` int NOT NULL,
  `idmateria` int NOT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`idclase`),
  KEY `idmateria_fk_idx` (`idmateria`),
  KEY `idprofesor_fk_idx` (`idprofesor`),
  CONSTRAINT `idmateria_fk` FOREIGN KEY (`idmateria`) REFERENCES `materias` (`idmateria`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idprofesor_fk` FOREIGN KEY (`idprofesor`) REFERENCES `profesores` (`idprofesor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clases`
--

LOCK TABLES `clases` WRITE;
/*!40000 ALTER TABLE `clases` DISABLE KEYS */;
INSERT INTO `clases` VALUES (1,'Español1A',1,1,1),(2,'Español2A',1,1,0),(3,'Matematicas1A',2,2,1),(4,'Matematicas2A',2,2,0),(5,'Ingles1A',4,3,1),(6,'Ingles2A',4,3,0),(7,'Computacion1A',3,4,1),(8,'Computacion2A',3,4,0),(9,'Historia1A',5,5,1),(10,'Ciencias2A',3,6,0);
/*!40000 ALTER TABLE `clases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiantes`
--

DROP TABLE IF EXISTS `estudiantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiantes` (
  `idestudiante` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Codigo` varchar(10) NOT NULL,
  PRIMARY KEY (`idestudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiantes`
--

LOCK TABLES `estudiantes` WRITE;
/*!40000 ALTER TABLE `estudiantes` DISABLE KEYS */;
INSERT INTO `estudiantes` VALUES (1,'Oscar Yael','Patiño Cordero','1294'),(2,'Isela Sofia ','Payan Olivares','1289'),(3,'Andrea Esmeralda','Perez Fernandez','1250'),(4,'Gustavo Emiliano','Ramirez Barragan','5394'),(5,'Fernanda ','Ramos Sanchez','7672'),(6,'Gael ','Rogerio Ozuna','5882'),(7,'Viridiana','Sanchez Aguilar','5035'),(8,'Julio Cesar','Segura Bahena','9658'),(9,'Maria Jose','Torres Gonzalez','5327'),(10,'Luis Eduardo','Valenzuela Ramirez','5815'),(11,'Andrea','Vazquez Lemus','6978');
/*!40000 ALTER TABLE `estudiantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `idmateria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idmateria`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (1,'Español'),(2,'Matematicas'),(3,'Ingles'),(4,'Computacion'),(5,'Historia'),(6,'Ciencias');
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `idprofesor` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Codigo` varchar(45) NOT NULL,
  PRIMARY KEY (`idprofesor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (1,'Sara ','Castro Ornelas','1478'),(2,'Matha','Rios Ayuso','7895'),(3,'Karen','Pimentel Hernandez','4567'),(4,'Gabriel','Lopez Herrera','1254'),(5,'Alejandro','Diaz Lomeli','2190');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-14 14:20:18
