
package SpaceCup.Business.Filter;

import SpaceCup.Entity.Interfaces.IMessage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Message implements IMessage{
    @Override
    public void ErrorMessage(String message) {
       JOptionPane.showMessageDialog(null, message);   
        try {
            throw new Exception(message);
        } catch (Exception ex) {
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void SucessMessage(String message) {
       JOptionPane.showMessageDialog(null, message);  
    }    
}
