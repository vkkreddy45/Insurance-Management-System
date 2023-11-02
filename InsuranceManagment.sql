-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: insurancemanagement
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `claim`
--

DROP TABLE IF EXISTS `claim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `claim` (
  `claim_id` bigint NOT NULL AUTO_INCREMENT,
  `approval_date` date DEFAULT NULL,
  `claim_adjuster_notes` varchar(255) DEFAULT NULL,
  `claim_amount` double NOT NULL,
  `claim_date` date DEFAULT NULL,
  `claim_status` varchar(255) DEFAULT NULL,
  `client_id` bigint DEFAULT NULL,
  `date_of_loss` date DEFAULT NULL,
  `description_of_loss` varchar(255) DEFAULT NULL,
  `policy_id` bigint DEFAULT NULL,
  PRIMARY KEY (`claim_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claim`
--

LOCK TABLES `claim` WRITE;
/*!40000 ALTER TABLE `claim` DISABLE KEYS */;
/*!40000 ALTER TABLE `claim` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client_policy`
--

DROP TABLE IF EXISTS `client_policy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client_policy` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `claim_from` date DEFAULT NULL,
  `claim_till` date DEFAULT NULL,
  `created_at` date NOT NULL,
  `client_id` bigint DEFAULT NULL,
  `policy_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKen43jtw1gyciw85u98j5k01qt` (`client_id`),
  KEY `FKnw8yj7rdkxsgch8tes9ltc0r3` (`policy_id`),
  CONSTRAINT `FKen43jtw1gyciw85u98j5k01qt` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`),
  CONSTRAINT `FKnw8yj7rdkxsgch8tes9ltc0r3` FOREIGN KEY (`policy_id`) REFERENCES `policy` (`policy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client_policy`
--

LOCK TABLES `client_policy` WRITE;
/*!40000 ALTER TABLE `client_policy` DISABLE KEYS */;
/*!40000 ALTER TABLE `client_policy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `client_id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `client_type` varchar(255) DEFAULT NULL,
  `contact_information` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy`
--

DROP TABLE IF EXISTS `policy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policy` (
  `policy_id` bigint NOT NULL AUTO_INCREMENT,
  `cooling_period` int NOT NULL,
  `coverage_amount` double NOT NULL,
  `duration_untill` int NOT NULL,
  `policy_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`policy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy`
--

LOCK TABLES `policy` WRITE;
/*!40000 ALTER TABLE `policy` DISABLE KEYS */;
INSERT INTO `policy` VALUES (1,0,10000,1,'auto insurance'),(2,1,15000,1,'auto insurance'),(3,0,12000,1,'car insurance'),(4,1,18000,1,'car insurance'),(5,0,50000,1,'life insurance'),(6,1,75000,1,'life insurance'),(7,0,200000,1,'property insurance'),(8,1,300000,1,'property insurance'),(9,0,10000,1,'renters insurance'),(10,1,15000,1,'renters insurance'),(11,0,11000,1,'auto insurance'),(12,1,16000,1,'auto insurance'),(13,0,13000,1,'car insurance'),(14,1,19000,1,'car insurance'),(15,0,55000,1,'life insurance'),(16,1,80000,1,'life insurance'),(17,0,220000,1,'property insurance'),(18,1,320000,1,'property insurance'),(19,0,12000,1,'renters insurance'),(20,1,17000,1,'renters insurance'),(21,0,10500,1,'auto insurance'),(22,1,15500,1,'auto insurance'),(23,0,12500,1,'car insurance'),(24,1,18500,1,'car insurance');
/*!40000 ALTER TABLE `policy` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-24 13:43:10
