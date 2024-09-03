/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author elfor
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
    //Operaciones aritmeticas
    int x = 10; //Declaracion y asiignacion al mismo tiempo
    int y = 5;
    int suma, resta, multi, divi, pot, raiz;//Declarar varias variables en un mismo codigo
    //Suma y resta
    suma = x + y;//operador de suma
    System.out.println("Suma de x + y");
    System.out.println(suma);
    
    resta = x - y;
    System.out.println("Resta de x - y");
    System.out.println(resta);
    
    //Multiplicacion
    multi = x * y;
    System.out.println("Multiplicacion de x * y");
    System.out.println(multi);
    
    //Division
    divi = x / y;
    System.out.println("Division de x(10) / Y(5)");
    System.out.println(divi);
    //Cambiamos la variable
    x = 11;
    y = 3;
    divi = x / y;
    System.out.println("Division de x(11) / y(3)");
    System.out.println(divi);
    
    double val1 = 11;
    double val2 = 3;
    double diviD;
    diviD = val1 / val2;
    System.out.println("Division entre numeros decimales");
    System.out.println(diviD);
    
    
    
    }
}
