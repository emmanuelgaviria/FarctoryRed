/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSocial;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author emmanuel.gaviria
 */
public class Twitter implements IVerificator
{
    @Override
    public void Verify() {
           try {

            Desktop.getDesktop().browse(new URI ("http://www.twitter.com"));
        } catch (Exception ex) {
          
        }
    }
    
}
