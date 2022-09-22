dependencies in `pom.xml`

        <dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-data-jpa</artifactId>
    	</dependency>

    	<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-jdbc</artifactId>
    	</dependency>

    	<dependency>
    		<groupId>mysql</groupId>
    		<artifactId>mysql-connector-java</artifactId>
    	</dependency>

configuration in `application.properties`

        spring.datasource.url=jdbc:mysql://localhost:3306/library
        spring.jpa.database=mysql
        spring.datasource.username=root
        spring.datasource.password=root
        spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver

        spring.jpa.generate-ddl=true
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true

        spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect