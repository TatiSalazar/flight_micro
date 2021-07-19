INSERT INTO public.compania(
	id, nombre_compania)
	VALUES (1, 'Avianca'),
	(2,'Viva Air');

INSERT INTO public.aeropuerto(
	id, aeropuerto_activo, ciudad, nombre, numero_pistas)
	VALUES (1,'si','Armenia','Aeropuerto Internacional El Eden','2'),
	(2,'si','Pereira','Aeropuerto Internacional Matecaña','3'),
	(3,'si','Manizales','Aeropuerto Nacional La Nubia','3'),
	(4,'si','Cali','Aeropuerto Internacional Alfonso Bonilla Aragón','3');


INSERT INTO public.destino_origen(
	id, nombre_aeropuert_origen, nombre_aeropuerto_destino, nombre_ciudad_destino, nombre_ciudad_origen)
	VALUES (1,'Aeropuerto Internacional El Eden','Aeropuerto Internacional Alfonso Bonilla Aragón','Cali','Armenia'),
	(2,'Aeropuerto Internacional Alfonso Bonilla Aragón','Aeropuerto Internacional El Eden','Armenia','Cali'),
	(3,'Aeropuerto Internacional Matecaña','Aeropuerto Internacional Alfonso Bonilla Aragón','Cali','Pereira'),
	(4,'Aeropuerto Nacional La Nubia','Aeropuerto Internacional El Eden','Armenia','Manizales');

INSERT INTO public.itinerario(
	id, fecha_llegada, fecha_salida, destino_origen)
	VALUES 
	(1,'2021-06-29 05:00:00','2021-06-29 03:00:00',1),
	(2,'2021-06-30 03:00:00','2021-06-30 01:00:00',2),
	(3,'2021-07-01 07:00:00','2021-07-01 06:00:00',3);

INSERT INTO public.avion(
	id, capacidad, modelo, aeropuerto, compania)
	VALUES (1, 74,'ATR-72' , 1, 1),
	(2, 180,'Airbus A320' , 1, 2),
	(3, 74,'ATR-72' , 2, 1),
	(4, 74,'ATR-72' , 3, 1),
	(5, 74,'ATR-72' , 4, 1);

INSERT INTO public.vuelo(
	id, capacidad, numero_vuelo, avion, compania, itinerario)
	VALUES 
	(1, 74, 1, 1, 1, 1),
	(2, 74, 2, 1, 1, 1),
	(3, 180, 3, 1, 2, 1);

INSERT INTO public.pasajero(
	id, documento, email, nombre, telefono)
	VALUES 
	(1, '10100123', 'jorgesalazar@gmail.com','Eduardo Crosthwaite', '321818732'),
	(2, '41768023', 'mariaalazar@gmail.com','Maria Pineda', '3019084563'),
	(3, '1095967409','gjaramillo@hotmail.com','Geraldine Jaramillo', '312450945');

INSERT INTO public.pasaje(
	id, asiento, clase, valor, pasajero, vuelo)VALUES 
	(1, 45, 'turista', 200.000, 1, 1),
	(2, 15, 'economica', 100.000, 2, 1),
	(3, 22, 'turista', 400.000, 3, 1);




