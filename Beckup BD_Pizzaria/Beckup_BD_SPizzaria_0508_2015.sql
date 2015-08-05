-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: localhost    Database: pizzaria
-- ------------------------------------------------------
-- Server version	5.6.25-log

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
-- Table structure for table `cardapio`
--

DROP TABLE IF EXISTS `cardapio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardapio` (
  `car_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `car_descricao` varchar(100) DEFAULT NULL,
  `car_tipo` varchar(25) DEFAULT NULL,
  `car_valor` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`car_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardapio`
--

LOCK TABLES `cardapio` WRITE;
/*!40000 ALTER TABLE `cardapio` DISABLE KEYS */;
INSERT INTO `cardapio` VALUES (1,'Pizza Margarida','Pizza',24.00),(2,'Cocacola','Refrigerante',5.23),(3,'Pizza Frango com','Pizza',37.12),(4,'Coca 1,5L','Refrigerante',5.00);
/*!40000 ALTER TABLE `cardapio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `cli_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(50) DEFAULT NULL,
  `cli_rua` varchar(50) DEFAULT NULL,
  `cli_bairro` varchar(50) DEFAULT NULL,
  `cli_telefone` varchar(50) DEFAULT NULL,
  `cli_datacad` date DEFAULT NULL,
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'King ','Avenida ','Lagiano','(92)8420-7330','2015-06-29'),(2,'Mauro','Rua policia Economica','Benfica','(23)4444-4555','2015-06-29'),(3,'Mendes Miguel','Rua mi','ALTAR','(33)4444-3333','2015-07-02');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrgador`
--

DROP TABLE IF EXISTS `entrgador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrgador` (
  `ent_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ent_nome` varchar(50) DEFAULT NULL,
  `ent_status` varchar(50) DEFAULT NULL,
  `ent_datacad` date DEFAULT NULL,
  PRIMARY KEY (`ent_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrgador`
--

LOCK TABLES `entrgador` WRITE;
/*!40000 ALTER TABLE `entrgador` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrgador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_fun_cod` int(10) unsigned NOT NULL,
  `item_cli_cod` int(10) unsigned NOT NULL,
  `item_ped_cod` int(10) unsigned NOT NULL,
  `item_car_cod` int(10) unsigned NOT NULL,
  `item_quantidade` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`item_cod`,`item_fun_cod`,`item_cli_cod`,`item_ped_cod`,`item_car_cod`),
  KEY `ItemCardapio` (`item_car_cod`),
  KEY `ItemPedido` (`item_ped_cod`,`item_cli_cod`,`item_fun_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,1,1,7,1,1),(2,1,1,7,2,1),(3,1,3,9,4,2);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `fun_cod` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `fun_nome` varchar(50) DEFAULT NULL,
  `fun_senha` varchar(50) DEFAULT NULL,
  `fun_permissao` varchar(50) DEFAULT NULL,
  `fun_cargo` varchar(50) DEFAULT NULL,
  `fun_datacad` date DEFAULT NULL,
  `fun_login` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`fun_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'Manuel Mendes','123','Normal','Pizzaiolo(a)','2015-07-02','Mano'),(2,'Avelino ','123','Normal','Atendente','2015-07-14','AV'),(3,'Avelino Chigando','1234','Gerente ','Gerente','2015-07-14','Avv'),(4,'Samuel Luanda','1234','Gerente ','Entregador','2015-07-14','Samu');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `ped_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ped_cli_cod` int(10) unsigned NOT NULL,
  `ped_fun_cod` int(10) unsigned NOT NULL,
  `ped_data` date DEFAULT NULL,
  `ped_hora` time(2) DEFAULT NULL,
  `ped_total` decimal(10,2) DEFAULT NULL,
  `ped_status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ped_cod`,`ped_cli_cod`,`ped_fun_cod`),
  KEY `PedidoCliente` (`ped_cli_cod`),
  KEY `PedidoFuncionario` (`ped_fun_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (7,1,1,'2015-07-30','17:10:15.00',29.23,'Pedido Aberto'),(9,3,1,'2015-07-30','17:27:01.00',10.00,'Pedido Aberto');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-05 14:29:29
