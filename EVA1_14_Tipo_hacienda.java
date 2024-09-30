/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_hacienda;

import java.util.Scanner;
/**
 *
 * @author elfor
 */
public class EVA1_14_Tipo_hacienda {

    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el tipo de persona F:Fisica M:Moral");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caracter es "+tipo);
        
        
        
        
    }
}
