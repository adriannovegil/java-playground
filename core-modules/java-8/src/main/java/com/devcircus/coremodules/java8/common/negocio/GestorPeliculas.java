package com.devcircus.coremodules.java8.common.negocio;

import com.devcircus.coremodules.java8.common.modelo.Pelicula;
import java.util.Optional;

public class GestorPeliculas {

    public Pelicula buscar(Integer id) {

        switch (id) {
            case 1:
                return new Pelicula(1, "Alien");
            case 2:
                return new Pelicula(2, "Die Hard");
            case 3:
                return new Pelicula(3, "Bracula");
            default:
                return null;
        }

    }

    public Optional<Pelicula> buscarOptional(Integer id) {

        //Si creamos un opcional con un null tenemos un NullPointerException
        //Optional.of(null);
        switch (id) {
            case 1:
                return Optional.of(new Pelicula(1, "Alien"));
            case 2:
                return Optional.of(new Pelicula(2, "Die Hard"));
            case 3:
                return Optional.of(new Pelicula(3, "Bracula"));
            default:
                return Optional.empty();
        }

    }

}
