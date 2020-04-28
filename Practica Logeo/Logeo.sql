Create database Logeo;

Use Logeo;

Create table Usuarios(
IdUsuarios Int  not null primary key,
Nombre_Usuario varchar (50),
Apellido_usuario varchar (50),
Usuario varchar(40),
Contrasenia varchar(50)




);

Create table Historial(
IdHistorial Int not null primary key,
IdUsuarios Int,
Fecha Date

);


select * from Usuarios;

select * from Historial;

insert into `Usuarios` values(1, "Gerson", "Alas", "gerson04", "12345");
insert into `Usuarios` values(2, "Antonio", "Carpio", "antonio09", "246810");


drop table Histoial;
drop table Usuarios;


