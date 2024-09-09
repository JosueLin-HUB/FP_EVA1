/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;
/**
 *
 * @author elfor
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
       //Condicional
       //Logica booleana -> Operaciones de verdadero falso
       //solicitar edad
       int edad;
       Scanner captu = new Scanner(System.in);
       System.out.println("Dime tu edad");
       edad = captu.nextInt();
       //Determinar si tiene 18 años //Mayor o igual a 18
       //Las operaciones logicas solo generan verdadero o falso
       if (edad >= 18){;//Bloque para verdadero
       System.out.println("Es un adulto");
       }else{//bloque para el falso
       System.out.println("Es un menor de edad");
       }
       //si son varias instrucciones las tienes que agrupar con llaves
      
       
       
       
       
    }
}
