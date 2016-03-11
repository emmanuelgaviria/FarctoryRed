/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSocial;

/**
 *
 * @author emmanuel.gaviria
 */
public class RedFactory {
    
    public IVerificator getCreator(String page) {
       
        switch(page){
            case "Facebook":
                System.out.println("Bienvenido a facebook!");
                return new Facebook();
            case "Twitter":
                System.out.println("Bienvenido a Twitter!");
                return new Twitter();
            case "Google":
                System.out.println("Bienvenido a Google!");
                return new Google();
            
        }
        return null;
    }

   
        
}
