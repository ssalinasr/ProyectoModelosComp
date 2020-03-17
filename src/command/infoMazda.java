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
public class infoMazda implements infoVehiculo{
    
    private String marca;
    private double precio;
    
    public infoMazda(String m, double p){
        this.marca = m;
        this.precio = p;
    }

    @Override
    public void calcularPrecio(){
        if(this.marca.equals("mazda")){
            this.precio = this.precio -50;
            System.out.println(this.precio);
        }
    }
    
}
