-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for suli
CREATE DATABASE IF NOT EXISTS `suli` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `suli`;

-- Dumping structure for table suli.diak
CREATE TABLE IF NOT EXISTS `diak` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nev` varchar(30) DEFAULT NULL,
  `szuldatum` date DEFAULT NULL,
  `naplo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `naplo_id` (`naplo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table suli.diak: ~4 rows (approximately)
/*!40000 ALTER TABLE `diak` DISABLE KEYS */;
INSERT INTO `diak` (`id`, `nev`, `szuldatum`, `naplo_id`) VALUES
	(1, 'Szabó Tünde', '2010-02-10', 1),
	(2, 'Nagy Péter', '2010-03-03', 1),
	(3, 'Kiss Rózsa', '2010-04-15', 1),
	(4, 'Kovács Barna', '2010-05-10', 3);
/*!40000 ALTER TABLE `diak` ENABLE KEYS */;

-- Dumping structure for table suli.jegy
CREATE TABLE IF NOT EXISTS `jegy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ertek` int(11) DEFAULT NULL,
  `leiras` varchar(10) DEFAULT NULL,
  `datum` date DEFAULT NULL,
  `diak_id` int(11) NOT NULL,
  `tantargy` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `diak_id` (`diak_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table suli.jegy: ~10 rows (approximately)
/*!40000 ALTER TABLE `jegy` DISABLE KEYS */;
INSERT INTO `jegy` (`id`, `ertek`, `leiras`, `datum`, `diak_id`, `tantargy`) VALUES
	(1, 5, 'jeles', '2022-01-03', 1, 'magyar'),
	(2, 3, 'közepes', '2022-01-04', 1, 'matek'),
	(3, 4, 'jó', '2022-01-05', 2, 'biológia'),
	(4, 2, 'elégséges', '2022-01-10', 3, 'fizika'),
	(5, 4, 'jó', '2022-01-11', 3, 'kémia'),
	(6, 4, 'jó', '2022-01-11', 3, 'magyar'),
	(7, 4, 'jó', '2022-01-12', 1, 'magyar'),
	(8, 3, 'közepes', '2022-01-12', 2, 'matek'),
	(9, 5, 'jeles', '2022-01-03', 1, 'Kémia'),
	(10, 3, 'közepes', '2022-01-15', 2, 'történelem');
/*!40000 ALTER TABLE `jegy` ENABLE KEYS */;

-- Dumping structure for table suli.naplo
CREATE TABLE IF NOT EXISTS `naplo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leiras` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table suli.naplo: ~2 rows (approximately)
/*!40000 ALTER TABLE `naplo` DISABLE KEYS */;
INSERT INTO `naplo` (`id`, `leiras`) VALUES
	(1, '6B'),
	(2, '6C');
/*!40000 ALTER TABLE `naplo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
