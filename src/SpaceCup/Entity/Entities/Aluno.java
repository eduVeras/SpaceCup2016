/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Aluno {
    
    private String RM;
    private String Password;

    public Aluno() {
    }

    
    public Aluno(String RM, String Password) {
        this.RM = RM;
        this.Password = Password;
    }

    
    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
