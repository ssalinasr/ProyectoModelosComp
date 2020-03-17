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
public class descrVehicle1 implements descrManager{

    private descrManager manager_next;
    
    @Override
    public void setNext(descrManager dm) {
        this.manager_next = dm;
    }

    @Override
    public descrManager getManager() {
        return this.manager_next;
    }

    @Override
    public void description(String vehiclename, int id) {
        if (id == 1){
        System.out.println("Descripcion "+vehiclename);
        }
        else{
            System.out.println("No reconocido, ejecutando siguiente...");
            this.manager_next.description(vehiclename, id);
        }
    }
    
}
