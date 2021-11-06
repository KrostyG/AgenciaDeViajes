﻿# AgenciaDeViajes
Una agencia de viajes desea implementar un sistema de ventas de sus productos.
Los productos que comercializa la agencia son pasajes aéreos, alojamientos y paquetes turísticos que incluye el pasaje y el alojamiento.
Cada producto tiene un código, una descripción y un precio. Para el caso de los pasajes se guarda además la fecha del mismo y la compañía 
aérea. Para el caso de los alojamientos se guarda el nombre del alojamiento.
El precio del paquete turístico es el precio del pasaje más el precio del alojamiento y sobre esto se calcula un 5% de descuento.
Cuando un cliente compra alguno de los productos, el empleado ingresa el DNI del cliente y si el mismo no existe, se da de alta en el 
sistema guardando el DNI, nombre, teléfono y mail.
Una vez verificada la existencia del cliente, se selecciona el o los productos a comprar y se genera una venta con los datos del cliente, los 
productos seleccionados y la cantidad de cada uno de ellos.
Al momento de cerrar la venta, el precio total se calcula sumando los precios de cada producto por la cantidad de cada uno de ellos.
Sobre este precio el cliente puede obtener un descuento vigente, hasta el momento del relevamiento los descuentos validos son:
a. Si el cliente ha realizado más de 3 compras con la agencia, se le bonifica un 5%
b. Si la cantidad de los productos es mayor a 4, se le bonifica un 3%
c. Si la venta incluye pasajes aéreos y el destino se encuentra en países europeos, se le bonifica el 5% de los pasajes.
Una vez finalizada la venta, el sistema de la agencia debe informar los productos vendidos a los sistemas de las líneas aéreas y hotelería a 
fin de que procedan a hacer las reservas de dichos productos.
El sistema debe permitir, además:
1. Consultar las ventas que tienen un producto determinado
2. Consultar las ventas de un cliente determinado
Se pide: 
Desarrolle en base al siguiente diagrama de clase que brinda la solución al problema plantead
