
package SpaceCup.Business.Filter;

import SpaceCup.Entity.Interfaces.IMessage;
import javax.swing.JOptionPane;

public class Message implements IMessage{
    @Override
    public void ErrorMessage(String message) {
       JOptionPane.showMessageDialog(null, message);   
        
    }

    @Override
    public void SucessMessage(String message) {
       JOptionPane.showMessageDialog(null, message);  
    }    
}
