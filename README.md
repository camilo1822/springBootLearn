# springBootLearn

## Servicio rest para listar productos a partir de una base de datos mockeada
### Cuenta con dos servicios 
- Listar: Trae toda la lista de productos (http://localhost:8001/listar)
- Ver: Trae un producto especifico por el ID (http://localhost:8001/ver/1)

## Tecnologías
- Database H2: sirve para utilizar bases de datos en el desarrollo, la base de datos se crear cuando el server se inicia y se elimina cuando el server se baja. Para que springBoot sepa que toca crear una DB toca crear un archivo llamado **"import.sql"** en la ruta **"src/main/resources"** y allí se pone la data con la que se trabajará. EJM:
```html
INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic', 800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony', 700, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple', 5000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Samsung', 1000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('LG', 900, NOW());
```
