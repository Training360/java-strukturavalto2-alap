-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


DROP DATABASE IF EXISTS `pizzabolt`;
CREATE SCHEMA IF NOT EXISTS `pizzabolt` DEFAULT CHARACTER SET 'utf8' COLLATE 'utf8_hungarian_ci' ;
USE pizzabolt;

-- 
-- Tábla szerkezet: `futar`
-- 

DROP TABLE IF EXISTS `futar`;
CREATE TABLE IF NOT EXISTS `futar` (
  `id` int(3) NOT NULL default '0',
  `nev` varchar(25) collate utf8_hungarian_ci NOT NULL default '',
  `telefon` varchar(12) collate utf8_hungarian_ci NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

-- 
-- Tábla adatok: `futar`
-- 

INSERT INTO `futar` VALUES (1, 'Hurrikán', '123456');
INSERT INTO `futar` VALUES (2, 'Gyalogkakukk', '666666');
INSERT INTO `futar` VALUES (3, 'Gömbvillám', '888888');
INSERT INTO `futar` VALUES (4, 'Szélvész', '258369');
INSERT INTO `futar` VALUES (5, 'Imperial', '987654');

-- --------------------------------------------------------

-- 
-- Tábla szerkezet: `pizza`
-- 

DROP TABLE IF EXISTS `pizza`;
CREATE TABLE IF NOT EXISTS `pizza` (
  `id` int(3) NOT NULL default '0',
  `nev` varchar(15) collate utf8_hungarian_ci NOT NULL default '',
  `ar` int(4) NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

-- 
-- Tábla adatok: `pizza`
-- 

INSERT INTO `pizza` VALUES (1, 'Capricciosa', 900);
INSERT INTO `pizza` VALUES (2, 'Frutti di Mare', 1100);
INSERT INTO `pizza` VALUES (3, 'Hawaii', 780);
INSERT INTO `pizza` VALUES (4, 'Vesuvio', 890);
INSERT INTO `pizza` VALUES (5, 'Sorrento', 990);

-- --------------------------------------------------------

-- 
-- Tábla szerkezet: `rendeles`
-- 

DROP TABLE IF EXISTS `rendeles`;
CREATE TABLE  IF NOT EXISTS  `rendeles` (
  `id` int(8) NOT NULL default '0',
  `vevo_id` int(6) NOT NULL default '0',
  `futar_id` int(3) NOT NULL default '0',
  `datum` date NOT NULL default '0000-00-00',
  `ido` float NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

-- 
-- Tábla adatok: `rendeles`
-- 

INSERT INTO `rendeles` VALUES ( 1, 4, 2, '2010-10-01', 13.15);
INSERT INTO `rendeles` VALUES ( 2, 7, 2, '2010-10-01', 14.17);
INSERT INTO `rendeles` VALUES ( 3, 1, 1, '2010-10-02', 11.07);
INSERT INTO `rendeles` VALUES ( 4, 5, 2, '2010-10-02', 14.55);
INSERT INTO `rendeles` VALUES ( 5, 2, 3, '2010-10-02', 15.27);
INSERT INTO `rendeles` VALUES ( 6, 4, 2, '2010-10-03', 15.58);
INSERT INTO `rendeles` VALUES ( 7, 6, 2, '2010-10-04', 11.44);
INSERT INTO `rendeles` VALUES ( 8, 7, 4, '2010-10-04', 12.11);
INSERT INTO `rendeles` VALUES ( 9, 1, 5, '2010-10-04', 14.33);
INSERT INTO `rendeles` VALUES (10, 3, 5, '2010-10-04', 18.04);
INSERT INTO `rendeles` VALUES (11, 2, 1, '2010-10-05', 16.38);
INSERT INTO `rendeles` VALUES (12, 5, 2, '2010-10-05', 17.02);
INSERT INTO `rendeles` VALUES (13, 6, 2, '2010-10-06', 12.17);
INSERT INTO `rendeles` VALUES (14, 4, 3, '2010-10-06', 13.21);
INSERT INTO `rendeles` VALUES (15, 1, 4, '2010-10-06', 15.05);
INSERT INTO `rendeles` VALUES (16, 2, 5, '2010-10-06', 15.59);
INSERT INTO `rendeles` VALUES (17, 7, 2, '2010-10-06', 18.44);
INSERT INTO `rendeles` VALUES (18, 3, 2, '2010-10-07', 12.01);
INSERT INTO `rendeles` VALUES (19, 4, 5, '2010-10-07', 13.44);
INSERT INTO `rendeles` VALUES (20, 1, 1, '2010-10-07', 17.25);
INSERT INTO `rendeles` VALUES (21, 5, 3, '2010-10-08', 14.29);

-- --------------------------------------------------------

-- 
-- Tábla szerkezet: `tetel`
-- 

DROP TABLE IF EXISTS `tetel`;
CREATE TABLE  IF NOT EXISTS  `tetel` (
  `rendeles_id` int(8) NOT NULL default '0',
  `pizza_id` int(3) NOT NULL default '0',
  `db` int(3) NOT NULL default '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

-- 
-- Tábla adatok: `tetel`
-- 

INSERT INTO `tetel` VALUES ( 1, 1, 2);
INSERT INTO `tetel` VALUES ( 1, 4, 3);
INSERT INTO `tetel` VALUES ( 2, 2, 1);
INSERT INTO `tetel` VALUES ( 3, 1, 2);
INSERT INTO `tetel` VALUES ( 4, 1, 1);
INSERT INTO `tetel` VALUES ( 4, 4, 1);
INSERT INTO `tetel` VALUES ( 5, 2, 4);
INSERT INTO `tetel` VALUES ( 6, 1, 1);
INSERT INTO `tetel` VALUES ( 6, 4, 1);
INSERT INTO `tetel` VALUES ( 6, 5, 1);
INSERT INTO `tetel` VALUES ( 7, 5, 5);
INSERT INTO `tetel` VALUES ( 8, 4, 3);
INSERT INTO `tetel` VALUES ( 9, 2, 1);
INSERT INTO `tetel` VALUES (10, 1, 1);
INSERT INTO `tetel` VALUES (10, 4, 1);
INSERT INTO `tetel` VALUES (11, 1, 1);
INSERT INTO `tetel` VALUES (12, 2, 2);
INSERT INTO `tetel` VALUES (12, 4, 2);
INSERT INTO `tetel` VALUES (13, 4, 1);
INSERT INTO `tetel` VALUES (13, 5, 1);
INSERT INTO `tetel` VALUES (13, 2, 1);
INSERT INTO `tetel` VALUES (14, 2, 2);
INSERT INTO `tetel` VALUES (15, 1, 1);
INSERT INTO `tetel` VALUES (16, 2, 1);
INSERT INTO `tetel` VALUES (16, 4, 1);
INSERT INTO `tetel` VALUES (16, 5, 1);
INSERT INTO `tetel` VALUES (17, 1, 2);
INSERT INTO `tetel` VALUES (17, 2, 3);
INSERT INTO `tetel` VALUES (18, 1, 4);
INSERT INTO `tetel` VALUES (18, 5, 1);
INSERT INTO `tetel` VALUES (19, 1, 1);
INSERT INTO `tetel` VALUES (19, 2, 1);
INSERT INTO `tetel` VALUES (19, 4, 1);
INSERT INTO `tetel` VALUES (19, 5, 1);
INSERT INTO `tetel` VALUES (20, 5, 3);
INSERT INTO `tetel` VALUES (21, 2, 2);
INSERT INTO `tetel` VALUES (21, 4, 1);

-- --------------------------------------------------------

-- 
-- Tábla szerkezet: `vevo`
-- 

DROP TABLE IF EXISTS `vevo`;
CREATE TABLE IF NOT EXISTS `vevo` (
  `id` int(6) NOT NULL default '0',
  `nev` varchar(30) collate utf8_hungarian_ci NOT NULL default '',
  `cim` varchar(30) collate utf8_hungarian_ci NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

-- 
-- Tábla adatok: `vevo`
-- 

INSERT INTO `vevo` VALUES (1, 'Hapci', '');
INSERT INTO `vevo` VALUES (2, 'Vidor', '');
INSERT INTO `vevo` VALUES (3, 'Tudor', '');
INSERT INTO `vevo` VALUES (4, 'Kuka', '');
INSERT INTO `vevo` VALUES (5, 'Szende', '');
INSERT INTO `vevo` VALUES (6, 'Szundi', '');
INSERT INTO `vevo` VALUES (7, 'Morgó', '');
        
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;