CREATE TABLE IF NOT EXISTS `user` (
`idperson` int(5) NOT NULL AUTO_INCREMENT,
`name` varchar(10) NOT NULL,
`surname` varchar(10) NOT NULL,
`dateBirthday` date NOT NULL,
`email` varchar(60) NOT NULL,
`dateRegister` date NOT NULL,
PRIMARY KEY (`idperson`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;