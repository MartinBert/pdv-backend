--Modulos
INSERT INTO "public"."modulos" ("id","nombre") VALUES
(1,'depositos'),(2,'distribuidores'),(3,'marcas'),(4,'perfiles'),(5,'productos'),(6,'rubros'),(7,'usuarios');

--Perfiles
INSERT INTO "public"."perfiles" ("id","nombre") VALUES
(1,'Administrador');

--Modulos perfiles
INSERT INTO "public"."perfiles_modulos" ("perfil_id","modulos_id") VALUES
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7);

--el password es 'password'

INSERT INTO "public"."usuarios" ("id", "nombre","username", "password","perfil_id") VALUES
('1', 'Martin','martin', '$2a$10$e59rGaFvpijWXLh03j0aZOzBYQNrIRIjlB8sGwLvBL35fecblsW1m',1);