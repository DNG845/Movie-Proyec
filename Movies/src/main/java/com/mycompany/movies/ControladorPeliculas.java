
package com.mycompany.movies;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ControladorPeliculas {
    private List<Pelicula> peliculas;

    public ControladorPeliculas() {
        peliculas = new ArrayList<>();
    }

    public boolean guardarDatos() {
        try {

            // Ejemplo de cómo agregar películas manualmente (simulación)
            peliculas.add(new Pelicula("Pelicula 1", "Resumen 1", "poster1.jpg"));
            peliculas.add(new Pelicula("Pelicula 2", "Resumen 2", "poster2.jpg"));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}



