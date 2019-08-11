package com.GARCIA;

import com.GARCIA.excepciones.ErrorValidacion;

public class ClienteTurista {
    public String nombre;
    public String telefono;
    public int numerodevisita;

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNumerodevisita() {

        return numerodevisita;
    }


    public void setNombre(String nombre) throws ErrorValidacion {
        if(nombre.length() > 50  ){
            throw new ErrorValidacion("El nombre debe de tener un maximo de 50 caracteres");
        }
        this.nombre = nombre;
    }

    public void setNumerodevisita(int numerodevisita) {
            this.numerodevisita++;


    }

    public void setTelefono(String telefono) throws ErrorValidacion {
        if (!telefono.matches("[0-9]{4}\\-[0-9]{4}")){
            throw new ErrorValidacion("El numero de telefono es invalido");
        }
        this.telefono = telefono;
    }



}
