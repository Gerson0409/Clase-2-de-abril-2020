Create database Producto;

Use Producto;

CREATE TABLE `productozz` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombreProducto` VARCHAR(50) NULL,
`precioProducto`DOUBLE NULL,
`cantidadProducto` INT (50) NULL,
`totalProducto` DOUBLE NULL,
PRIMARY KEY (`id`));

insert into `productozz` values (1, "Azucar", 20, 100, 2000);
insert into `productozz` values (2, "papel", 20, 100, 2000);
select * from productozz;

drop table productozz;