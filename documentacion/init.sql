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
(2,1),(2,2),(2,3),(2,4),(2,5),(2,8),(2,9),(2,17),(2,18),(2,19),(2,21),(2,22),
(3,1),(3,2),(3,3),(3,6),(3,8),(3,9),(3,10),(3,11),(3,19),(3,21),(3,22),(3,23),
(4,1),(4,2);

--Usuarios
--Password Prysoft: password, default users: 12345
INSERT INTO "public"."usuarios" ("id", "nombre","username", "password","perfil_id") VALUES
('1', 'Super Admin','prysoft', '$2y$12$XV5dAvr8X92rQVbzViWyB.TQv/fGebULe.M/MEXEbzIE/3ZCIejLK',1),
('2', 'Admin','admin', '$2y$12$MQfxsOL1Ub4iJMCUNyZx1u2gabW6X1a7mEJzR4bCGpOMh2ou.bylu',2),
('3', 'Franquiciado','franquiciado', '$2y$12$MQfxsOL1Ub4iJMCUNyZx1u2gabW6X1a7mEJzR4bCGpOMh2ou.bylu',3),
('4', 'Cajero','cajero', '$2y$12$MQfxsOL1Ub4iJMCUNyZx1u2gabW6X1a7mEJzR4bCGpOMh2ou.bylu',4);

--Documentos comerciales
INSERT INTO "public"."documentos_comerciales" ("id", "activo", "codigo_documento", "iva_cat", "letra", "nombre", "tipo") VALUES
(1,true,'001',1,'A','FACTURAS A',true),
(2,true,'002',1,'A','NOTAS DE DEBITO A',true),
(3,true,'003',1,'A','NOTAS DE CREDITO A',true),
(4,true,'004',1,'A','RECIBOS A',true),
(5,true,'006',2,'B','FACTURAS B',true),
(6,true,'007',2,'B','NOTAS DE DEBITO B',true),
(7,true,'008',2,'B','NOTAS DE CREDITO B',true),
(8,true,'009',2,'B','RECIBOS B',true),
(9,true,'011',3,'C','FACTURAS C',true),
(10,true,'012',3,'C','NOTAS DE DEBITO C',true),
(11,true,'013',3,'C','NOTAS DE CREDITO C',true),
(12,true,'015',3,'C','RECIBOS C',true),
(13,true,'063',1,'A','LIQUIDACIONES A',true),
(14,true,'064',2,'B','LIQUIDACIONES B',true),
(15,true,'068',3,'C','LIQUIDACION C',true),
(16,true,'080',4,'Z','INFORME DIARIO DE CIERRE (ZETA) - CONTROLADORES FISCALES',true),
(17,true,'081',1,'A','TIQUE FACTURA A',true),
(18,true,'082',2,'B','TIQUE FACTURA B',true),
(19,true,'091',4,'R','REMITOS R',true),
(20,true,'111',3,'C','TIQUE FACTURA C',true),
(21,true,'112',1,'A','TIQUE NOTA DE CREDITO A',true),
(22,true,'113',2,'B','TIQUE NOTA DE CREDITO B',true),
(23,true,'114',3,'C','TIQUE NOTA DE CREDITO C',true),
(24,true,'115',1,'A','TIQUE NOTA DE DEBITO A',true),
(25,true,'116',2,'B','TIQUE NOTA DE DEBITO B',true),
(26,true,'117',3,'C','TIQUE NOTA DE DEBITO C',true),
(27,true,'9999',4,'X','Ticket X',false);

--Condiciones Fiscales
INSERT INTO "public"."condiciones_fiscales" ("id", "nombre") VALUES
('1', 'Responsable Inscrípto'),('2', 'Monotributista'),('3', 'Consumidor Final');

--Condiciones & documentos
INSERT INTO "public"."condiciones_documentos" VALUES
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,13),(1,14),(1,16),
(1,17),(1,18),(1,21),(1,22),(1,24),(1,25),(1,27),(2,9),(2,10),(2,11),(2,12),
(2,15),(2,16),(2,19),(2,20),(2,23),(2,26),(2,27),(3,5),(3,6),(3,7),(3,8),
(3,9),(3,10),(3,11),(3,12),(3,14),(3,15),(3,18),(3,19),(3,20),(3,22),(3,23),
(3,25),(3,26),(3,27);

