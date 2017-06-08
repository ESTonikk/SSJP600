# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.5.5-10.1.21-MariaDB)
# Datenbank: BinDown
# Erstellt am: 2017-06-08 08:54:25 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Export von Tabelle apps_countries
# ------------------------------------------------------------

CREATE TABLE `apps_countries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country_code` varchar(2) NOT NULL DEFAULT '',
  `country_name` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=246 DEFAULT CHARSET=utf8;



# Export von Tabelle employee
# ------------------------------------------------------------

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(100) DEFAULT NULL,
  `emp_address` varchar(500) DEFAULT NULL,
  `emp_mobile_nos` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;



# Export von Tabelle Hersteller
# ------------------------------------------------------------

CREATE TABLE `Hersteller` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Street` varchar(40) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Streetnumber` int(5) DEFAULT NULL,
  `City` varchar(40) DEFAULT NULL,
  `ZIP` varchar(5) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `Fax` varchar(15) DEFAULT NULL,
  `Mail` varchar(20) DEFAULT NULL,
  `ContactPerson` varchar(30) DEFAULT NULL,
  `Country` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Country` (`Country`),
  CONSTRAINT `FKfmk20rc7o956yxffuc5iia0mw` FOREIGN KEY (`id`) REFERENCES `Land` (`id`),
  CONSTRAINT `hersteller_ibfk_1` FOREIGN KEY (`Country`) REFERENCES `Land` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

LOCK TABLES `Hersteller` WRITE;
/*!40000 ALTER TABLE `Hersteller` DISABLE KEYS */;

INSERT INTO `Hersteller` (`id`, `Street`, `Name`, `Streetnumber`, `City`, `ZIP`, `Phone`, `Fax`, `Mail`, `ContactPerson`, `Country`)
VALUES
	(1,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL),
	(2,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL),
	(3,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL),
	(4,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL),
	(5,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL),
	(6,'Neschener Str.','DR BOY GmbH & Co. KG',6,'Neustadt-Fernthal','53577','+4926833070','+49268332771','info@dr-boy.de',NULL,NULL);

/*!40000 ALTER TABLE `Hersteller` ENABLE KEYS */;
UNLOCK TABLES;


# Export von Tabelle Land
# ------------------------------------------------------------

CREATE TABLE `Land` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `country_code` varchar(2) DEFAULT NULL,
  `country_name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
