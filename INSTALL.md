1.  comandos maven para la construcción de la aplicación:

        mvn package -P test

2.  instrucciones para correr la aplicación: 

    por consola
    
        java -jar target/demo-1.0-SNAPSHOT-jar-with-dependencies.jar com.example.App
        
    por cliente http
    
        curl --location --request GET 'http://localhost:4567/entornos'