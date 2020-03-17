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
public class descrSort implements descrManager {
    
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
        descrVehicle1 v1 = new descrVehicle1();
        descrVehicle2 v2 = new descrVehicle2();
        descrVehicle3 v3 = new descrVehicle3();
        descrVehicle4 v4 = new descrVehicle4();
        descrVehicle5 v5 = new descrVehicle5();
        descrVehicle6 v6 = new descrVehicle6();
        descrVehicle7 v7 = new descrVehicle7();
        descrVehicle8 v8 = new descrVehicle8();
        
        this.manager_next = v1;
        
        v1.setNext(v2);
        v2.setNext(v3);
        v3.setNext(v4);
        v4.setNext(v5);
        v5.setNext(v6);
        v6.setNext(v7);
        v7.setNext(v8);
        
        this.manager_next.description(vehiclename, id);
        
    }
    
    
    
}
