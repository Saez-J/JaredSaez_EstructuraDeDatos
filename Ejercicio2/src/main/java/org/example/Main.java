package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.Evento();
    }

    //Ejercicio de control de asistentes a un evento
    public void Evento(){
        Set<String> control =  new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un codigo de invitado: ");
        String codigo = sc.nextLine();

        if(control.contains(codigo)){
            System.out.println("El codigo ya fue ingresado");
        } else {
            control.add(codigo);
        }

        //Lista de asistencia
        System.out.println("Lista de Asistencia: " + control);
    }
}