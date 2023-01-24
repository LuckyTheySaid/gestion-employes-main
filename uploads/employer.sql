-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 02 jan. 2023 à 09:02
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gest_secrt`
--

-- --------------------------------------------------------

--
-- Structure de la table `employer`
--

CREATE TABLE `employer` (
  `id` bigint(20) NOT NULL,
  `num_badge` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `disponibilite_code` bigint(20) DEFAULT NULL,
  `fonction_code` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `employer`
--

INSERT INTO `employer` (`id`, `num_badge`, `nom`, `prenom`, `disponibilite_code`, `fonction_code`) VALUES
(4, '3714', 'TAOUAF', 'AHMED', 1, 1),
(5, '4712', 'KARKORI', 'ANASS', 2, 6),
(6, '9543', 'FAHMI', 'HAMZA', 1, 2),
(7, '1652', 'DOURHRI', 'ESSAFI', 1, 4),
(8, '7834', 'TAIM', 'ANAS', 1, 3),
(9, '5631', 'OUAALI', 'MAROUANE', 2, 3),
(10, '5621', 'AZZOUZI', 'RACHID', 1, 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `employer`
--
ALTER TABLE `employer`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_bf2y51oclnut6imtb0fbl8x3u` (`num_badge`),
  ADD KEY `FKjwup7ejbcjtamk6l786v9icta` (`disponibilite_code`),
  ADD KEY `FK72qknfeor0rib1f52gxxo4mdg` (`fonction_code`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `employer`
--
ALTER TABLE `employer`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `employer`
--
ALTER TABLE `employer`
  ADD CONSTRAINT `FK72qknfeor0rib1f52gxxo4mdg` FOREIGN KEY (`fonction_code`) REFERENCES `fonction` (`code`),
  ADD CONSTRAINT `FKjwup7ejbcjtamk6l786v9icta` FOREIGN KEY (`disponibilite_code`) REFERENCES `disponibilite` (`code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
