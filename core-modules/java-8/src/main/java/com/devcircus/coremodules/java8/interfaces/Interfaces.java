package com.devcircus.coremodules.java8.interfaces;

import com.devcircus.coremodules.java8.interfaces.uno.Clase1;
import com.devcircus.coremodules.java8.interfaces.uno.Implementacion1;
import com.devcircus.coremodules.java8.interfaces.uno.Implementacion2;
import com.devcircus.coremodules.java8.interfaces.uno.Interfaz;

public class Interfaces {

    public static void main(String[] args) {

        Implementacion1 i1 = new Implementacion1();
        Implementacion2 i2 = new Implementacion2();

        // Metodos 'normales' y default i1.metodo(); i1.saludar();
        i2.metodo();
        i2.saludar();

        // Metodos estaticos
        // =====================================================================
        Clase1 c1 = new Clase1();
        c1.metodoEstatico();
        Clase1.metodoEstatico();

        // No podemos acceder a los mï¿½todos estï¿½ticos de la interfaz utilizando una
        // variable
        // del tipo que la implementa
        //i1.metodoEstatico();
        // Tenemos que utilizar la interfaz para ello
        Interfaz.metodoEstatico();

        Interfaz interfaz = null;
        // interfaz.metodoEstatico(); //No compila
        // interfaz.metodo();
        // interfaz.saludar();
    }
}
