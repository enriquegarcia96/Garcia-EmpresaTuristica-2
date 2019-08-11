package com.GARCIA;

import com.GARCIA.excepciones.ErrorValidacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ClienteTurista> clienteTuristas = new ArrayList();

        Scanner lector = new Scanner(System.in);

        System.out.println("**Empresa Turistica Los 4 Hermanos**");
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ingreso De Nuevos Turistas");
            System.out.println("2. Mostrar Turistas");
            System.out.println("3. Salir");
            int opcion = LectorDeErrores.EntradaInt("Ingrese una de las opciones:  ");

            switch (opcion) {

                case 1:
                    int contador = 0;
                    int captura = -5;

                    System.out.println("** Resgistro de turistas **");
                    System.out.println("Ingrese El Nombre Del Cliente:  ");
                    String nombre = lector.nextLine();
                    ClienteTurista nuevoturista = new ClienteTurista();

                    System.out.println("Ingrese El Numero De Telefono: ");
                    String telefono = lector.nextLine();


                    try {
                        if (!telefono.isBlank()) {
                            nuevoturista.setTelefono(telefono);
                            nuevoturista.setNombre(nombre);
                        }
                    } catch (ErrorValidacion e) {
                        System.err.println(e.getMessage());
                    }

                    for (ClienteTurista c : clienteTuristas) {
                        if (c.telefono.equals(telefono)) {
                            System.out.println("Numero Ingresado Anterior Mente, Gracias Por Volver");
                            captura = contador;
                        }
                        contador++;
                    }

                    if (captura != -5) {
                        clienteTuristas.get(captura).setNumerodevisita(1);
                    } else {
                        clienteTuristas.add(nuevoturista);
                        System.out.println("¡Cliente Registrado Existosamente!\n");
                    }
                    break;

                case 2:
                    System.out.println("Historial De Turistas\n");
                    if (clienteTuristas.isEmpty()) {
                        System.out.println("Primero Debe De Ingresar Turistas!");
                    } else {
                        System.out.println("Mostrando Turistas");
                    }

                    for (ClienteTurista c : clienteTuristas) {
                        if (c instanceof ClienteTurista) ;
                        System.out.println("Cliente" + " " + c.nombre + " " + "Numero Telefonico: " + c.telefono + " " + "Numero De Visitas Anteriores " + c.numerodevisita + "\n");

                    }
                    break;

                case 3:
                    System.out.println("Adios!");
                    continuar = false;
                    break;

                default:
                   System.out.println("opcion incorrecta");
            }




        }
    }
}
