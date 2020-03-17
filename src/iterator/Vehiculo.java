/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author sebas
 */
public class Vehiculo {
    
    private VehiculoCreator[] vehiculos = new VehiculoCreator[8];
    private int id = 0;
    private String vehiclename;
    
    public Vehiculo(String n){
        this.vehiclename = n;
    }
    
    public String getnameVehicle(){
        return this.vehiclename;
    }
    
    public void add(String marca){
        VehiculoCreator v = new VehiculoCreator(marca, this.vehiclename);
        this.vehiculos[id++] = v;
    }
    
    public VehiculoIterator iterator(){
        return new VehiculoIterator(vehiculos);
    }
    
}
