/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;
/**
 *
 * @author elfor
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
    String nombre;
    String genero;
    int duracion;
    String reparto;
    String clasificacion;
    
    Scanner capturar;
    capturar = new Scanner(System.in);
    
     System.out.println("Dime el nombre de la pelicula");
     nombre = capturar.nextLine();
     System.out.println("Dime el genero");
     genero = capturar.nextLine();
     System.out.println("Dime la duracion");
     duracion = capturar.nextInt();
     capturar.nextLine();
     System.out.println("Dime el reparto");
     reparto = capturar.nextLine();
     System.out.println("Dime la clasificacion");
     clasificacion = capturar.nextLine();
     
     
    System.out.println("Datos de la pelicula-------------");
    System.out.println(nombre);
    System.out.println(genero);
    System.out.println(duracion);
    System.out.println(reparto);
    System.out.println(clasificacion);
     
    }
}
