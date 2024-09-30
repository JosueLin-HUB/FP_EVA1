/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_23_Anio_Bisiesto {

    public static void main(String[] args) {
        int modulo = 800 % 400;
        int anio;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime un año");
        anio = captu.nextInt();
        captu.nextLine();
        
        
        if(anio % 4 == 0 && anio % 100 > 0 || anio % 400 == 0){
            System.out.println("Es anio bisiesto");
        }else
            System.out.println("No es anio bisiesto");
        
        
        
        
    }
}
