/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_10_Formulas {

    public static void main(String[] args) {
        double dis, vel, tie, acel;
    Scanner captu = new Scanner(System.in);
    System.out.println("Dame la velocidad en m/s");
    vel = captu.nextDouble();
    System.out.println("Dame la aceleracion en m/s2");
    acel = captu.nextDouble();
    System.out.println("Dame el tiempo en segundos");
    tie = captu.nextDouble();
    
    dis= (vel*tie)+ (acel*(tie*tie)/2);
    System.out.println("La distancia es "+dis+ " Metros");
    
    
    
    }
}
