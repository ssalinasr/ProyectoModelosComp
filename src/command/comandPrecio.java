/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author sebas
 */
public class comandPrecio implements ICommand{

    private infoVehiculo vehicle;
    
    public comandPrecio (infoVehiculo v){
        this.vehicle = v;
    }
    @Override
    public void execute() {
        vehicle.calcularPrecio();
    }
    
}
