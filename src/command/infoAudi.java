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
public class infoAudi implements infoVehiculo{
    
    private String marca;
    private double precio;
    
    public infoAudi(String m, double p){
        this.marca = m;
        this.precio = p;
    }

    @Override
    public void calcularPrecio(){
        if(this.marca.equals("audi")){
            this.precio = this.precio -15;
            System.out.println(this.precio);
        }
    }
    
}
