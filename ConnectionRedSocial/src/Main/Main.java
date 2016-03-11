/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import RedSocial.IVerificator;
import RedSocial.RedFactory;
import java.util.Scanner;

/**
 *
 * @author emmanuel.gaviria
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese Red Social!!");
            String page=teclado.next();

            RedFactory factory = new RedFactory();
            IVerificator r= factory.getCreator(page);
            r.Verify();
        } catch (Exception e) {
            System.err.println("Error!!!");
        }
        
        
        
    }
    
}
