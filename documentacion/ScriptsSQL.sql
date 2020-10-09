--Modulos
INSERT INTO "public"."modulos" ("id","nombre") VALUES
(1,'ventas'),(2,'ventasForm'),(3,'productos'),(4,'marcas'),(5,'rubros'),(6,'depositos'),
(7,'documentos'),(8,'mediosPago'),(9,'planesPago'),(10,'personas'),(11,'clientes'),(12,'vendedores'),
(13,'distribuidores'),(14,'transportistas'),(15,'relaciones'),(16,'condicionesFiscales'),(17,'usuarios'),(18,'perfiles'),
(19,'configuraciones'),(20,'empresas'),(21,'sucursales'),(22,'puntosVenta'),(23,'stock');

--Perfiles
INSERT INTO "public"."perfiles" ("id","nombre") VALUES
(1,'Super Admin'), (2,'Admin'), (3,'Franquiciado'), (4,'Cajero');

--Modulos perfiles
INSERT INTO "public"."perfiles_modulos" ("perfil_id","modulos_id") VALUES
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),(1,20),(1,21),(1,22),(1,23),
(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),(2,8),(2,9),(2,10),(2,12),(2,13),(2,14),(2,17),(2,18),(2,19),(2,21),(2,22),
(3,1),(3,2),(3,3),(3,6),(3,8),(3,9),(3,10),(3,11),(3,19),(3,21),(3,22),(3,23),
(4,1),(4,2);


--el password es 'password'
INSERT INTO "public"."usuarios" ("id", "nombre","username", "password","perfil_id") VALUES
('1', 'Martin','martin', '$2y$12$XV5dAvr8X92rQVbzViWyB.TQv/fGebULe.M/MEXEbzIE/3ZCIejLK',1);