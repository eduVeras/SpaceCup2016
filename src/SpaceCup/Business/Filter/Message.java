/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Business.Filter;

import SpaceCup.Entity.Interfaces.IMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Felix
 */
public class Message implements IMessage{
    @Override
    public void ErrorMessage(String message) {
       JOptionPane.showMessageDialog(null, "Error : " + message);   
    }

    @Override
    public void SucessMessage(String message) {
       JOptionPane.showMessageDialog(null, "Success : " + message);  
    }    
}
