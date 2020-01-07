-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2019 at 12:42 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `deneme`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `kullanici_adi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `sifre` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`kullanici_adi`, `sifre`) VALUES
('kocalparslan97', 'malazgirt');

-- --------------------------------------------------------

--
-- Table structure for table `birim`
--

CREATE TABLE `birim` (
  `birim_id` int(11) NOT NULL,
  `sirket_id` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `isim` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Kotakapasitesi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Kotadanismani` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Teslimtarihi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Kotadonemi` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `birim`
--

INSERT INTO `birim` (`birim_id`, `sirket_id`, `isim`, `Kotakapasitesi`, `Kotadanismani`, `Teslimtarihi`, `Kotadonemi`) VALUES
(1011, '1001', 'Veri Yapıları', '6', 'İlhan Aydın', '2019-12-30', '3');

-- --------------------------------------------------------

--
-- Table structure for table `bolum`
--

CREATE TABLE `bolum` (
  `bolum_id` int(11) NOT NULL,
  `fakulte_id` int(11) NOT NULL,
  `bolumAyrintilari` varchar(55) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `bolum`
--

INSERT INTO `bolum` (`bolum_id`, `fakulte_id`, `bolumAyrintilari`) VALUES
(63, 56, 'Deneme Bölümü'),
(4000, 4000, 'Bilgisayar Mühendisliği'),
(4001, 4000, 'Makine Mühendisliği'),
(4002, 4000, 'Elektrik-Elektronik Mühendisliği'),
(5000, 5000, 'İç Mimarlık'),
(6000, 6000, 'Göz Hastalıkları '),
(6001, 6000, 'Kbb Hastalıkları ');

-- --------------------------------------------------------

--
-- Table structure for table `duyurular`
--

CREATE TABLE `duyurular` (
  `Duyuru_id` int(11) NOT NULL,
  `Durum` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `Teslimtarihi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `duyurular`
--

INSERT INTO `duyurular` (`Duyuru_id`, `Durum`, `Teslimtarihi`) VALUES
(1, 'AKTİF', '2019-08-26');

-- --------------------------------------------------------

--
-- Table structure for table `fakülte`
--

CREATE TABLE `fakülte` (
  `Fakülte_id` int(11) NOT NULL,
  `Fakülteadı` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `Ayrıntılar` varchar(55) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `fakülte`
--

INSERT INTO `fakülte` (`Fakülte_id`, `Fakülteadı`, `Ayrıntılar`) VALUES
(4000, 'Mühendislik Fakültesi', ''),
(5000, 'Mimarlık Fakültesi', ''),
(6000, 'Tıp Fakültesi', '');

-- --------------------------------------------------------

--
-- Table structure for table `kayitlisirket`
--

CREATE TABLE `kayitlisirket` (
  `ogrenci_id` int(11) NOT NULL,
  `sirketid` int(11) NOT NULL,
  `sirketisim` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `danismanadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `kayitlisirket`
--

INSERT INTO `kayitlisirket` (`ogrenci_id`, `sirketid`, `sirketisim`, `danismanadi`) VALUES
(0, 2000, '0', ''),
(0, 2001, '0', ''),
(0, 2002, '0', '');

-- --------------------------------------------------------

--
-- Table structure for table `kayıtlıuygulama`
--

CREATE TABLE `kayıtlıuygulama` (
  `Kota_id` int(11) NOT NULL,
  `Ogrenci_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `kayıtlıuygulama`
--

INSERT INTO `kayıtlıuygulama` (`Kota_id`, `Ogrenci_id`) VALUES
(7000, 8000),
(7001, 8001),
(7002, 8002),
(7003, 8003),
(7004, 8004),
(7005, 8005),
(7006, 8006);

-- --------------------------------------------------------

--
-- Table structure for table `kisi`
--

CREATE TABLE `kisi` (
  `TC` bigint(11) NOT NULL,
  `isim` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `kullaniciadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `ayrintilar` varchar(55) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `kisi`
--

INSERT INTO `kisi` (`TC`, `isim`, `kullaniciadi`, `sifre`, `ayrintilar`) VALUES
(3648578471, 'Alparslan KOÇ', 'alparslankoc', '152535', 'Bİlgisayar Mühendisliği '),
(28606841926, 'Abdullah ALA', 'abdullahala', '356595', 'İç Mimarlık'),
(98765432100, 'Serdar AKBAŞ', 'serdarakbas', '154575', 'KBB Hastalıkları ');

-- --------------------------------------------------------

--
-- Table structure for table `kota`
--

CREATE TABLE `kota` (
  `kota_id` int(11) NOT NULL,
  `birim_id` int(11) NOT NULL,
  `kotaDonemi` int(11) NOT NULL,
  `Kotakapasitesi` int(11) NOT NULL,
  `danismanKapasitesi` int(11) NOT NULL,
  `Teslimtarihi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `kota`
--

INSERT INTO `kota` (`kota_id`, `birim_id`, `kotaDonemi`, `Kotakapasitesi`, `danismanKapasitesi`, `Teslimtarihi`) VALUES
(56, 45, 56, 56, 565, '2019-12-30'),
(7000, 1000, 3, 3, 2, '2019-08-26'),
(7001, 1001, 3, 3, 3, '2019-08-26'),
(7002, 1002, 3, 2, 1, '2019-08-26'),
(7003, 1003, 3, 2, 2, '2019-08-26'),
(7004, 1004, 3, 10, 3, '2019-08-26'),
(7005, 1005, 3, 5, 1, '2019-08-26'),
(7006, 1006, 3, 5, 1, '2019-08-26'),
(7007, 1007, 3, 10, 2, '2019-08-26'),
(7009, 1008, 3, 4, 1, '2019-08-26');

-- --------------------------------------------------------

--
-- Table structure for table `ogrenci`
--

CREATE TABLE `ogrenci` (
  `ogrenci_id` int(11) NOT NULL,
  `AGNO` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `yas` int(11) NOT NULL,
  `bolum_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `ogrenci`
--

INSERT INTO `ogrenci` (`ogrenci_id`, `AGNO`, `yas`, `bolum_id`) VALUES
(12, '4', 21, 63),
(8000, '2,01', 20, 4000),
(8001, '1,96', 20, 6001),
(8002, '1,80', 19, 4002),
(8003, '1,92', 18, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `sekreterlik`
--

CREATE TABLE `sekreterlik` (
  `sekreterlik_id` int(11) NOT NULL,
  `fakulte_id` int(11) NOT NULL,
  `bolum_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `sekreterlik`
--

INSERT INTO `sekreterlik` (`sekreterlik_id`, `fakulte_id`, `bolum_id`) VALUES
(35, 3999, 63),
(9000, 4000, 4001),
(9001, 4000, 4002),
(9003, 4000, 4002),
(9004, 5000, 5000),
(9005, 6000, 6001),
(9006, 6000, 6002);

-- --------------------------------------------------------

--
-- Table structure for table `sirket`
--

CREATE TABLE `sirket` (
  `sirket_id` int(11) NOT NULL,
  `sirket_isim` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `sirket_sehir` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `sirket_adres` varchar(55) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `sirket`
--

INSERT INTO `sirket` (`sirket_id`, `sirket_isim`, `sirket_sehir`, `sirket_adres`) VALUES
(2000, 'NovaPm', 'Elazığ', 'Fırat Teknokent'),
(2001, 'Logical Defense', 'Elazığ', 'Fırat Teknokent'),
(2002, 'Gamelab', 'İstanbul', 'KÜGİM Küçükçekmece Girişimcilik ve İnovasyon Merkezi '),
(2003, 'Mia Yazılım', 'Ankara ', 'Gazi Üniversitesi Gölbaşı Yerleşkesi Tekno Plaza No:32'),
(2004, 'İf Yazılım', 'Ankara', 'Workinton Next Level  ');

-- --------------------------------------------------------

--
-- Table structure for table `stajbasvurusu`
--

CREATE TABLE `stajbasvurusu` (
  `Uygulama_id` int(11) NOT NULL,
  `Uygulamadurumu` varchar(155) COLLATE utf8_turkish_ci NOT NULL,
  `yapilacakstaj` int(11) NOT NULL,
  `baslangic` date NOT NULL,
  `bitis` date NOT NULL,
  `Uygulanmatarihi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `stajbasvurusu`
--

INSERT INTO `stajbasvurusu` (`Uygulama_id`, `Uygulamadurumu`, `yapilacakstaj`, `baslangic`, `bitis`, `Uygulanmatarihi`) VALUES
(10000, 'Tamamlandı', 1, '2019-08-26', '2019-09-23', '2019-09-23'),
(10001, 'Tamamlanmadı', 2, '2019-08-26', '2019-09-23', '2019-09-23'),
(10002, 'Tamamlandı', 1, '2019-08-26', '2019-09-23', '2019-09-23'),
(10003, 'Tamamlandı', 1, '2019-08-26', '2019-09-23', '2019-09-23');

-- --------------------------------------------------------

--
-- Table structure for table `yeniuygulama`
--

CREATE TABLE `yeniuygulama` (
  `yeniuygulama_id` int(11) NOT NULL,
  `sirket_id` int(11) NOT NULL,
  `ogrenci_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `yenişirket`
--

CREATE TABLE `yenişirket` (
  `ogrenci_id` int(11) NOT NULL,
  `sirket_id` int(11) NOT NULL,
  `sirket_isim` int(11) NOT NULL,
  `danismanadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `birim`
--
ALTER TABLE `birim`
  ADD PRIMARY KEY (`birim_id`);

--
-- Indexes for table `bolum`
--
ALTER TABLE `bolum`
  ADD PRIMARY KEY (`bolum_id`);

--
-- Indexes for table `duyurular`
--
ALTER TABLE `duyurular`
  ADD PRIMARY KEY (`Duyuru_id`);

--
-- Indexes for table `fakülte`
--
ALTER TABLE `fakülte`
  ADD PRIMARY KEY (`Fakülte_id`);

--
-- Indexes for table `kayitlisirket`
--
ALTER TABLE `kayitlisirket`
  ADD PRIMARY KEY (`sirketid`);

--
-- Indexes for table `kisi`
--
ALTER TABLE `kisi`
  ADD PRIMARY KEY (`TC`);

--
-- Indexes for table `kota`
--
ALTER TABLE `kota`
  ADD PRIMARY KEY (`kota_id`);

--
-- Indexes for table `ogrenci`
--
ALTER TABLE `ogrenci`
  ADD PRIMARY KEY (`ogrenci_id`);

--
-- Indexes for table `sekreterlik`
--
ALTER TABLE `sekreterlik`
  ADD PRIMARY KEY (`sekreterlik_id`);

--
-- Indexes for table `sirket`
--
ALTER TABLE `sirket`
  ADD PRIMARY KEY (`sirket_id`);

--
-- Indexes for table `stajbasvurusu`
--
ALTER TABLE `stajbasvurusu`
  ADD PRIMARY KEY (`Uygulama_id`);

--
-- Indexes for table `yeniuygulama`
--
ALTER TABLE `yeniuygulama`
  ADD PRIMARY KEY (`yeniuygulama_id`);

--
-- Indexes for table `yenişirket`
--
ALTER TABLE `yenişirket`
  ADD PRIMARY KEY (`ogrenci_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `birim`
--
ALTER TABLE `birim`
  MODIFY `birim_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1012;

--
-- AUTO_INCREMENT for table `bolum`
--
ALTER TABLE `bolum`
  MODIFY `bolum_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6002;

--
-- AUTO_INCREMENT for table `duyurular`
--
ALTER TABLE `duyurular`
  MODIFY `Duyuru_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;

--
-- AUTO_INCREMENT for table `fakülte`
--
ALTER TABLE `fakülte`
  MODIFY `Fakülte_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6001;

--
-- AUTO_INCREMENT for table `kota`
--
ALTER TABLE `kota`
  MODIFY `kota_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7010;

--
-- AUTO_INCREMENT for table `ogrenci`
--
ALTER TABLE `ogrenci`
  MODIFY `ogrenci_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21322;

--
-- AUTO_INCREMENT for table `sekreterlik`
--
ALTER TABLE `sekreterlik`
  MODIFY `sekreterlik_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9007;

--
-- AUTO_INCREMENT for table `sirket`
--
ALTER TABLE `sirket`
  MODIFY `sirket_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2006;

--
-- AUTO_INCREMENT for table `stajbasvurusu`
--
ALTER TABLE `stajbasvurusu`
  MODIFY `Uygulama_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10005;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
