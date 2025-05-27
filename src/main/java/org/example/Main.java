package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.usuarios();
    }

    public void usuarios(){
        Set<String> usuario = new HashSet<>();

        //Añadiendo personas a usuarios
        usuario.add("Adriana");
        usuario.add("Mario Ivan");
        usuario.add("Natalie");
        usuario.add("Jonatan");
        usuario.add("Adriana");

        //Mostrando el contenido de usuario
        System.out.println("El contenido de HashSet: " + usuario);

        //Verificar si Adriana existe
        System.out.println("¿Contiene 'Adriana'? " + usuario.contains("Adriana"));

    }
}