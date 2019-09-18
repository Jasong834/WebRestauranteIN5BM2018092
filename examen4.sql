create database dbRestaurante;
use dbRestaurante;

create table areas(
	idarea int not null primary key auto_increment,
    descripcion varchar(45) not null
);

create table cocinero(
	idcocinero int not null primary key auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    especialidad varchar(45)
);

create table sucursal(
	idsucursal int not null primary key auto_increment,
    departamento varchar(45) not null,
    nombre varchar(45) not null
);



create table plato(
	idplato int not null primary key auto_increment,
    descripcion varchar (45) not null
);

create table cliente(
	idcliente int not null primary key auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    dpi varchar(45) not null
);

create table mesero(
	idmesero int not null primary key auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null
);

create table mesa(
	idmesa int not null primary key auto_increment,
    descripcion varchar(45) not null,
    idarea int not null,
    foreign key mesa(idarea) references  areas(idarea)
);

create table factura(
	idfactura int not null primary key auto_increment,
    idcliente int not null,
    idmesero int not null,
    idsucursal int not null,
    idmesa int not null,
    fecha date not null,
    foreign key factura_cliente(idcliente)references cliente(idcliente),
    foreign key factura_mesero(idmesero) references mesero(idmesero),
    foreign key factura_sucursal(idsucursal) references sucursal(idsucursal),
    foreign key factura_mesa(idmesa) references mesa(idmesa)
);

create table detalleFactura(
	iddetallefactura int not null primary key auto_increment,
    idfactura int not null,
    idplato int not null,
    idcocinero int not null,
    cantidad int not null,
    precio double  not null,
    total double as (cantidad * precio) not null,
    foreign key detalle_factura(idfactura) references factura (idfactura),
    foreign key detalle_cocinero(idcocinero) references cocinero(idcocinero),
    foreign key detalle_plato(idplato) references plato(idplato)
);