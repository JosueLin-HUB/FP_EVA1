/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_18_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out. println("Dime un dia (1-7)");
        dia = captu.nextInt();
        captu.nextLine();
        
        if(dia == 1){
            System.out.println("Domingo");
        }else if(dia == 2){
            System.out.println("Lunes");
        }else if(dia == 3){
            System.out.println("Martes");
        }else if(dia == 4){
            System.out.println("Miercoles");
        }else if(dia == 5){
            System.out.println("Jueves");
        }else if(dia == 6){
            System.out.println("Viernes"); 
        }else if(dia == 7){
            System.out.println("Sabado");
        }else
            System.out.println("Numero no valido");
        
    
    }
}
