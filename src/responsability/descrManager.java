/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsability;

/**
 *
 * @author sebas
 */
public interface descrManager {
    
    public void setNext(descrManager dm);
    public descrManager getManager();
    public void description(String vehiclename, int id);
    
}
