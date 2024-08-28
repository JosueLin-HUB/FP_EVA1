/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;//Esto es el import

/**
 *
 * @author elfor
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
       //Declarar
    String marca;
    String modelo;
    int year;
    double precio;
       //¿Como se captura?
       //SCANNER
       //Herramineta --> Clase:Nos proporciona muchas herramientas
    Scanner capturar;//Creamos el import
    capturar = new Scanner(System.in);//Creamos la herramienta 
    // Hay que dar instrucciones al usuario
    System.out.println("Introduce la marca del vehiculo");
    marca = capturar.nextLine();//Esta regresa todo el texto hasta que le demos enter
    System.out.println("Introduce el modelo del vehiculo");
    modelo = capturar.nextLine();
    System.out.println("Introduce el annio vehiculo");
    year = capturar.nextInt();
    System.out.println("Introduce el precio del vehiculo");
    precio = capturar.nextDouble();
    //Imprimir los datos
    System.out.println("Datos Recolectados");
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(year);
    System.out.println(precio);
     
    
           
    }
}
