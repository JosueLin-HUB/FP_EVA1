/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA1_9_Conversion {

    public static void main(String[] args) {
    double fare, cent, kelvin;
    Scanner captu = new Scanner(System.in);
    System.out.println("Dame la temperatura en grados farenheit");
    fare = captu.nextDouble();
    cent = (fare - 32) / 1.8;
    System.out.println("Grados centigrados = " + cent);
    
    System.out.println("Dame la temperatura en grados centigradost");
    cent = captu.nextDouble();
    fare = cent * 1.8 + 32;
    System.out.println("Grados farenheit = " + fare);
    
    System.out.println("Dame la temperatura en grados kelvin");
    kelvin = captu.nextDouble();
    cent = kelvin - 273.15;
    System.out.println("Grados centigrados = " + cent);
    
    System.out.println("Dame la temperatura en grados centigrados");
    cent = captu.nextDouble();
    kelvin = cent + 263.15;
    System.out.println("Grados kelvin = " + kelvin);
    
    
    }
}
