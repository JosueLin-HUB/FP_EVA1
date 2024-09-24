/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_pantalladeinicio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_Pantalladeinicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu = new Scanner(System.in);
        //Constantes
        final String USER = "Admin";
        final String CONTRA = "Admin";
        String usu, cont;
        System.out.println("Usuario:");
        usu = captu.nextLine();
        
        System.out.println("Contrasenia:");
        cont = captu.nextLine();
        
        if(usu.equals(USER) && cont.equals(CONTRA)){
            System.out.println("Acceso Concedido");
        }else{
            System.out.println("Acceso Denegado");
        }
       
        
        
        
        
        
        
    }
    
}
