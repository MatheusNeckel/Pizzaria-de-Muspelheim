-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: pizzariademuspelheim
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `bebidas`
--

DROP TABLE IF EXISTS `bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bebidas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Dose` decimal(3,2) NOT NULL,
  `Preco` decimal(3,2) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebidas`
--

LOCK TABLES `bebidas` WRITE;
/*!40000 ALTER TABLE `bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Sobrenome` varchar(45) NOT NULL,
  `Data_Nascimento` date NOT NULL,
  `Genero` varchar(45) NOT NULL,
  `Telefone` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `Endereco` varchar(255) NOT NULL,
  `Ponto_Referencia` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Senha` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'João','Pererira','2006-05-11','Masculino','(54)9923456','032.657.890-34','Rua Fulano de Tal','Próx. ao bairro fictício','joaopedro919@gmail.com','136925'),(2,'Maria','Filipina','2004-08-22','Feminino','(54)99123456','098.217.453-87','Rua Não Te interessa','Perto de Sei Lá o que','filipmaria124@gmail.com','Lelepo1234');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes_pedidos`
--

DROP TABLE IF EXISTS `clientes_pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes_pedidos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Clientes_id` int NOT NULL,
  `Pedidos_id` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Clientes_id` (`Clientes_id`),
  KEY `Pedidos_id` (`Pedidos_id`),
  CONSTRAINT `clientes_pedidos_ibfk_1` FOREIGN KEY (`Clientes_id`) REFERENCES `clientes` (`ID`),
  CONSTRAINT `clientes_pedidos_ibfk_2` FOREIGN KEY (`Pedidos_id`) REFERENCES `pedidos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes_pedidos`
--

LOCK TABLES `clientes_pedidos` WRITE;
/*!40000 ALTER TABLE `clientes_pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes_pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Caminho_Imagem` varchar(500) NOT NULL,
  `Valor_Total` varchar(45) DEFAULT NULL,
  `Status_pedido` varchar(45) NOT NULL,
  `Tipo_Pagamento` varchar(45) NOT NULL,
  `Data_pedido` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos_bebidas`
--

DROP TABLE IF EXISTS `pedidos_bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos_bebidas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Pedidos_id` int NOT NULL,
  `Bebidas_id` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pedidos_id` (`Pedidos_id`),
  KEY `Bebidas_id` (`Bebidas_id`),
  CONSTRAINT `pedidos_bebidas_ibfk_1` FOREIGN KEY (`Pedidos_id`) REFERENCES `pedidos` (`ID`),
  CONSTRAINT `pedidos_bebidas_ibfk_2` FOREIGN KEY (`Bebidas_id`) REFERENCES `bebidas` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos_bebidas`
--

LOCK TABLES `pedidos_bebidas` WRITE;
/*!40000 ALTER TABLE `pedidos_bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos_pizzas`
--

DROP TABLE IF EXISTS `pedidos_pizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos_pizzas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Pedidos_id` int NOT NULL,
  `Pizzas_id` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pedidos_id` (`Pedidos_id`),
  KEY `Pizzas_id` (`Pizzas_id`),
  CONSTRAINT `pedidos_pizzas_ibfk_1` FOREIGN KEY (`Pedidos_id`) REFERENCES `pedidos` (`ID`),
  CONSTRAINT `pedidos_pizzas_ibfk_2` FOREIGN KEY (`Pizzas_id`) REFERENCES `pizzas` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos_pizzas`
--

LOCK TABLES `pedidos_pizzas` WRITE;
/*!40000 ALTER TABLE `pedidos_pizzas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_pizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizzas`
--

DROP TABLE IF EXISTS `pizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizzas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Tamanho` varchar(45) NOT NULL,
  `Preco` decimal(3,2) NOT NULL,
  `Descricao` varchar(45) NOT NULL,
  `Quantidade` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzas`
--

LOCK TABLES `pizzas` WRITE;
/*!40000 ALTER TABLE `pizzas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Senha` varchar(45) NOT NULL,
  `Tipo_de_Usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'MatheusNeckel','matheusneckel818@gmail.com','Leleco56789@','Gerente');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_clientes`
--

DROP TABLE IF EXISTS `usuarios_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_clientes` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Usuarios_id` int NOT NULL,
  `Clientes_id` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Usuarios_id` (`Usuarios_id`),
  KEY `Clientes_id` (`Clientes_id`),
  CONSTRAINT `usuarios_clientes_ibfk_1` FOREIGN KEY (`Usuarios_id`) REFERENCES `usuarios` (`ID`),
  CONSTRAINT `usuarios_clientes_ibfk_2` FOREIGN KEY (`Clientes_id`) REFERENCES `clientes` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_clientes`
--

LOCK TABLES `usuarios_clientes` WRITE;
/*!40000 ALTER TABLE `usuarios_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_pedidos`
--

DROP TABLE IF EXISTS `usuarios_pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_pedidos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Usuarios_id` int NOT NULL,
  `Pedidos_id` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Usuarios_id` (`Usuarios_id`),
  KEY `Pedidos_id` (`Pedidos_id`),
  CONSTRAINT `usuarios_pedidos_ibfk_1` FOREIGN KEY (`Usuarios_id`) REFERENCES `usuarios` (`ID`),
  CONSTRAINT `usuarios_pedidos_ibfk_2` FOREIGN KEY (`Pedidos_id`) REFERENCES `pedidos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_pedidos`
--

LOCK TABLES `usuarios_pedidos` WRITE;
/*!40000 ALTER TABLE `usuarios_pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios_pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'pizzariademuspelheim'
--

--
-- Dumping routines for database 'pizzariademuspelheim'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-18 17:06:09
