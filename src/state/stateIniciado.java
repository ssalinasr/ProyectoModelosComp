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
public class stateIniciado implements stateVehicle{
    
    private String statei;

    @Override
    public void registrarEstado(String state) {
        this.statei = state;
        System.out.println("Estado de la entrega: "+this.statei);
    }
    
    
}
