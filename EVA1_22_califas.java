/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_22_califas {

    public static void main(String[] args) {
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dame tu calificacion");
        cali = captu.nextInt();
        captu.nextLine();
        
        if(cali >= 90 && cali <=100){
            System.out.println("Tu calificacion es A");
        }else if(cali >= 83 && cali <= 89){
            System.out.println("tu calificacion es B");
        }else if(cali >= 73 && cali <= 82){
            System.out.println("tu calificacion es C");
        }else if(cali >=60  && cali <= 72){
            System.out.println("tu calificacion es D");
        }else if(cali >= 0 && cali <= 59){
            System.out.println("tu calificacion es F");
        }else if(cali < 0 && cali > 100){
            System.out.println("Calificacion no valida");
        }        
        
        
        
    }
}
