-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2022 at 12:43 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timetickerdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerID` int(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `PhoneNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmpID` int(5) NOT NULL,
  `EmpName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `InvoiceID` int(5) NOT NULL,
  `Quanitity` int(11) NOT NULL,
  `WatchID` int(5) NOT NULL,
  `CustomerID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `partsupplier`
--

CREATE TABLE `partsupplier` (
  `SupplierID` int(5) NOT NULL,
  `SupplierName` varchar(30) NOT NULL,
  `WatchID` int(5) NOT NULL,
  `PartID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `repairtask`
--

CREATE TABLE `repairtask` (
  `TaskID` int(5) NOT NULL,
  `EmployeeID` int(5) NOT NULL,
  `CustomerID` int(5) NOT NULL,
  `InvoiceID` int(5) NOT NULL,
  `PartID` int(5) NOT NULL,
  `Description` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `spareparts`
--

CREATE TABLE `spareparts` (
  `SupplierID` int(5) NOT NULL,
  `WatchID` int(5) NOT NULL,
  `PartID` int(5) NOT NULL,
  `Quantity` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `PartID` int(5) NOT NULL,
  `Quantity` char(5) NOT NULL,
  `ItemPrice` float NOT NULL,
  `SupplierID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `watch`
--

CREATE TABLE `watch` (
  `WatchID` int(5) NOT NULL,
  `BrandName` varchar(20) NOT NULL,
  `Material` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`InvoiceID`),
  ADD KEY `watchID` (`WatchID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `partsupplier`
--
ALTER TABLE `partsupplier`
  ADD PRIMARY KEY (`SupplierID`),
  ADD KEY `WatchID` (`WatchID`),
  ADD KEY `PartID` (`PartID`);

--
-- Indexes for table `repairtask`
--
ALTER TABLE `repairtask`
  ADD PRIMARY KEY (`TaskID`),
  ADD KEY `EmployeeID` (`EmployeeID`),
  ADD KEY `InvoiceID` (`InvoiceID`),
  ADD KEY `CustomerID` (`CustomerID`),
  ADD KEY `PartID` (`PartID`);

--
-- Indexes for table `spareparts`
--
ALTER TABLE `spareparts`
  ADD PRIMARY KEY (`SupplierID`),
  ADD KEY `PartID` (`PartID`),
  ADD KEY `WatchID` (`WatchID`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`PartID`),
  ADD KEY `SupplierID` (`SupplierID`);

--
-- Indexes for table `watch`
--
ALTER TABLE `watch`
  ADD PRIMARY KEY (`WatchID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CustomerID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `EmpID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `InvoiceID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `partsupplier`
--
ALTER TABLE `partsupplier`
  MODIFY `SupplierID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `repairtask`
--
ALTER TABLE `repairtask`
  MODIFY `TaskID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `spareparts`
--
ALTER TABLE `spareparts`
  MODIFY `SupplierID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `PartID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `watch`
--
ALTER TABLE `watch`
  MODIFY `WatchID` int(5) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `CustomerID` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`),
  ADD CONSTRAINT `watchID` FOREIGN KEY (`WatchID`) REFERENCES `watch` (`WatchID`);

--
-- Constraints for table `partsupplier`
--
ALTER TABLE `partsupplier`
  ADD CONSTRAINT `partsupplier_ibfk_1` FOREIGN KEY (`WatchID`) REFERENCES `watch` (`WatchID`),
  ADD CONSTRAINT `partsupplier_ibfk_2` FOREIGN KEY (`PartID`) REFERENCES `stock` (`PartID`);

--
-- Constraints for table `repairtask`
--
ALTER TABLE `repairtask`
  ADD CONSTRAINT `EmployeeID` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmpID`),
  ADD CONSTRAINT `InvoiceID` FOREIGN KEY (`InvoiceID`) REFERENCES `invoice` (`InvoiceID`),
  ADD CONSTRAINT `PartID` FOREIGN KEY (`PartID`) REFERENCES `stock` (`PartID`),
  ADD CONSTRAINT `repairtask_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);

--
-- Constraints for table `spareparts`
--
ALTER TABLE `spareparts`
  ADD CONSTRAINT `spareparts_ibfk_1` FOREIGN KEY (`PartID`) REFERENCES `stock` (`PartID`),
  ADD CONSTRAINT `spareparts_ibfk_2` FOREIGN KEY (`WatchID`) REFERENCES `watch` (`WatchID`);

--
-- Constraints for table `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`SupplierID`) REFERENCES `partsupplier` (`SupplierID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
