-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Mar-2023 às 15:38
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projetojava2023`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(5) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `dataNasc` varchar(15) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bairro` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `rua` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `num` int(6) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `dataNasc`, `cpf`, `tel`, `email`, `bairro`, `rua`, `num`, `cidade`) VALUES
(2, 'sara silva', '123', '123', '123', 'sara@gmail.com', 'centro', 'a', 12, 'eldorado'),
(3, 'ana', '12', '123123123', '56943', 'ana@gmail.com', '12', '12', 12, 'eldorado'),
(4, 'dias', '12', '1212121', '682394', 'Dias@gmail.com', 'centro', 'centro', 9, 'moNTES Claros'),
(6, 'vasgd', '23/54/2435', '223.525.252-34', '(22)2222-2222', '23452354', '2352345235', '23523542', 5423523, '235235423'),
(7, 'teste', '22352352', '523.523.523-52', '523.523.523-52', '523523523', '523452352', '35235235', 235235, '2352354'),
(9, 'ana', '12/31/2312', '123.123.123-21', '(12) 4 1414-3134', '?????', 'çççaã', '???????', 745675467, '?????'),
(10, '3214234', '21/34/1234', '144.124.342-34', '(23) 4 2342-3423', '23423423423', '423423', '423423423', 4234234, '234234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(5) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `dataNasc` varchar(20) DEFAULT NULL,
  `cpf` varchar(19) DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bairro` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `rua` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `num` int(6) DEFAULT NULL,
  `cidade` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `dataNasc`, `cpf`, `email`, `bairro`, `rua`, `num`, `cidade`) VALUES
(1, 'zizi', '121234', '123123123', 'zizi@', 'zona franca', '2', 12, 's?o paulo'),
(2, 'carol bezerra', '12345678', '1230987654', 'Carol@gmail.com', 'zona norte', 'mirante', 12, 'S?o paulo'),
(3, 'bento', '12121234', '1231231245', 'bento@gmail.com', 'zona oeste', 'cachoeira', 56, 'S?o francisco'),
(4, 'bia', '123757545', '1234567789', 'bia@gmail.com', 'montes claros', 'juarez', 15, 'Montes Claros'),
(6, 'teste', '1280694', '520398569', 'Teste@gmail', '123', '1', 67, 'N?o exites'),
(9, 'teste', '12', '12', 'bere@', 'centro', 'a', 12, 'moc'),
(12, 'viktor ariel', '12', '1231231234', 'viktor@gmail.com', 'centro', 'MOntes claros', 12, 'centro'),
(13, 'berenice', '19971203', '151515', 'berenice@gmail.com', 'centro', 'novela', 12, 'MOntes claros'),
(14, 'bere', '12', '1', 'bere@2', 'centro', 'b', 13, 'moc'),
(15, 'caio', '1997', '12', 'caio@', 'c', 'a', 13, 'moc'),
(16, '42521345213', '45/12/3451', '123.451.425-15', '123521352143521', '435214351', '234512345', 2134521345, '213452134');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `id` int(5) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `usuario`, `senha`, `email`) VALUES
(4, 'ana', 'ana123', 'ana@gmail'),
(15, 'caio', 'caio@123', 'caio@'),
(16, 'viktor', '1', 'viktor@gmail.com'),
(17, 'dudu', '1', 'dudu@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `notafiscal`
--

CREATE TABLE `notafiscal` (
  `id` int(99) NOT NULL,
  `data` varchar(16) DEFAULT NULL,
  `qtdRetirada` int(50) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `codProduto` varchar(50) DEFAULT NULL,
  `funcionario` varchar(50) DEFAULT NULL,
  `cliente` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `notafiscal`
--

INSERT INTO `notafiscal` (`id`, `data`, `qtdRetirada`, `preco`, `codProduto`, `funcionario`, `cliente`) VALUES
(1, '12/45/1999', 541251, 12512, '125412', '51251', '23512');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `codProduto` int(10) NOT NULL,
  `lote` varchar(50) DEFAULT NULL,
  `validade` varchar(20) DEFAULT NULL,
  `descricao` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nome` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `quantidade` int(10) DEFAULT NULL,
  `preco` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codProduto`, `lote`, `validade`, `descricao`, `nome`, `quantidade`, `preco`) VALUES
(1, 'A', '12', 'TARJA PRETA', 'PISCO', 12, 12),
(2, 'A', '12', 'Tarja Branca', 'Begetacil', 23, 34),
(3, 'asgasdga', '45/23/4523', '523452345', '2345234', 523452345, 2345234);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`,`email`);

--
-- Índices para tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`codProduto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  MODIFY `id` int(99) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `codProduto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
