package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.Filtro();
    }

    public void Filtro(){
        Set<String> palabras = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.printf("Por favor introduzca una palabra: ");
        palabra = sc.nextLine();

        if (palabras.contains(palabra)){
            System.out.println("La palabra ya existe");
        } else {
            palabras.add(palabra.toUpperCase());
        }

        System.out.println("Contenido de palabras: " + palabras);
    }
}