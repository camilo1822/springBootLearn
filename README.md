# springBootLearn
## Eureka
Se implementa la libreria de netflix **EUREKA** para crear servidor de aplicaciones, eureka ya cuenta con balanceador de carga **RIBBON**.
URL: http://localhost:8761/

Se debe agregar las dependencias:
- Del lado del servidor
```html
<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>
```
- Del lado del cliente
```html
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
	</dependencies>
```
