/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_17_Rangos {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Dame tu calificacion");
        califa = captu.nextInt();
        captu.nextLine();
        
        if(califa >=0 && califa <=100)
            System.out.println("Tu calificacion es valida = "+ califa);
        else
            System.out.println("Tu calificacion no es valida");
        
        if(califa >=70 && califa <=100)
            System.out.println("Aprobaste");
        else
            System.out.println("Reprobaste");
        
    }
}
