package com.example;

import static spark.Spark.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties properties = new Properties();
        properties.load(App.class.getClassLoader().getResourceAsStream("app.properties"));

        String entorno = properties.getProperty("PROPIEDAD_1");
        System.out.println(entorno);

        get("/entornos", (req, res) -> "En el ambiente " + entorno);
    }
}
