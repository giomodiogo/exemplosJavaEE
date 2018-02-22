# exemplosServlet

Projeto com alguns exemplos de Servlets, utilizando configurações no arquivo **web.xml** e também com **Annotations (Servlet 4.0).**

Para executar o projeto é preciso o **Eclipse** e o **WildFly**.

**Url padrão:** [localhost:8080/javaee-servlet/PATH_SERVLET](localhost:8080/javaee-servlet "localhost:8080/javaee-servlet")

**Em cada Servlet existe uma breve documentação. Explicando o funcionamento e também os links de acesso.**

### Para criar o projeto do zero:

- Criar o projeto com maven: **maven-archetype-webapp**
- Group Id: **com.javaee.servlet**
- Artifact Id:  **javaee.servlet**
- Package: **com.javaee.servlet**
- Adicionar a dependência no pom:

````xml
<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>javax.servlet-api</artifactId>
		<version>4.0.0</version>
		<scope>provided</scope>
</dependency>
````
