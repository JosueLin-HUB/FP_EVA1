/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_switch;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_20_Switch {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out. println("Numero correspondiente al dia (1-7)");
        dia = captu.nextInt();
        captu.nextLine();
        
        switch(dia){
            case 1:
                System.out. println("Lunes");
                break;
            case 2:
                System.out. println("Martes");
                break;
            case 3:
                System.out. println("Miercoles");
                break;
            case 4:
                System.out. println("Jueves");
                break;
            case 5:
                System.out. println("Viernes");
                break;
            case 6:
                System.out. println("Sabado");
                break;
            case 7:
                System.out. println("Domingo");
                break;
            default:
                System.out. println("Numero no valido"); // sin break     
        }
        
        
        
        
        
    }
}
