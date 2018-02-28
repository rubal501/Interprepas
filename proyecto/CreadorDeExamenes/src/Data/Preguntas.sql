-- MySQL dump 10.16  Distrib 10.1.30-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: Preguntas
-- ------------------------------------------------------
-- Server version	10.1.30-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `incisos`
--

DROP TABLE IF EXISTS `incisos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incisos` (
  `identificador` char(4) DEFAULT NULL,
  `textoPregunta` char(200) DEFAULT NULL,
  `primeraRespuesta` char(130) DEFAULT NULL,
  `segundaRespuesta` char(130) DEFAULT NULL,
  `terceraRespuesta` char(130) DEFAULT NULL,
  `cuartaRespuesta` char(130) DEFAULT NULL,
  `respuestaCorrecta` int(1) DEFAULT NULL,
  `grado` char(1) DEFAULT NULL,
  `claveAsignatura` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incisos`
--

LOCK TABLES `incisos` WRITE;
/*!40000 ALTER TABLE `incisos` DISABLE KEYS */;
INSERT INTO `incisos` VALUES ('1111','Masa del sol?','seul','32','Dinamarca','otto von shenider',2,'6','1400'),('1112','Masa del sol?','seul','32','Dinamarca','otto von shenider',1,'6','1400');
/*!40000 ALTER TABLE `incisos` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-15 21:31:46
