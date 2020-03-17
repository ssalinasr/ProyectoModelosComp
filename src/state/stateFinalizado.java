/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author sebas
 */
public class stateFinalizado implements stateVehicle{
    
    private String statef;

    @Override
    public void registrarEstado(String state) {
        this.statef = state;
        System.out.println("Estado de la entrega: "+this.statef);
    }
    
    
}
