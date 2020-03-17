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
public class context {
    
    private stateVehicle state;
    
    public void iniciado(String status) throws InterruptedException{
        this.state = new stateIniciado();
        state.registrarEstado(status);
        Thread.sleep(1000);
        proceso(status);
    }
    
    public void proceso(String status) throws InterruptedException{
        this.state = new stateProceso();
        status = "en proceso";
        state.registrarEstado(status);
        Thread.sleep(1000);
        finalizado(status);
    }
    
    public void finalizado(String status){
        this.state = new stateFinalizado();
        status = "finalizado";
        state.registrarEstado(status);
    }
    
}
