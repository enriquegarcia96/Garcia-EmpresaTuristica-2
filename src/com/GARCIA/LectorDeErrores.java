package com.GARCIA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeErrores {

    public static int EntradaInt(String mensaje){
        Scanner lector = new Scanner(System.in);
        System.out.println(mensaje);

        try{
            int numero = lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return EntradaInt(mensaje);
        }
    }


}
