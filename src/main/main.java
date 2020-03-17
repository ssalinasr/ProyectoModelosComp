/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import command.*;
import iterator.*;
import java.math.BigInteger;
import java.util.Iterator;
import mediator.mediatorCredito;
import responsability.*;
import state.*;
import templatemethod.*;


/**
 *
 * @author sebas
 */
public class main {
    
    public static void main(String[] args) throws InterruptedException {
        /*descrSort s = new descrSort();
        s.description("Mazda", 3);
        s.description("Toyota", 8);
        s.description("Audi", 6);
        s.description("I'm an error", 9);
*/
        
/*        context c = new context();
        c.iniciado("iniciado"); 
*/
    
/*
    Vehiculo f = new Vehiculo("Vehiculos xd");
    f.add("Audi");
    f.add("Mazda");
    f.add("Toyota");
    f.add("Kia");
    
    Iterator<VehiculoCreator> i = f.iterator();
    while(i.hasNext()){
        VehiculoCreator vb = i.next();
        vb.print();  
    }
*/

    /*calculateInterface calc;
    double value = 55000;
    calc = new calculateNacional();
    System.out.println(calc.calcularImporte(value));
    calc = new calculateExtranjero();
    System.out.println(calc.calcularImporte(value));
*/
   
/*    
    mediatorCredito d = new mediatorCredito();
        System.out.println(d.verificarForm(new BigInteger("5551779059069436"), "paypal"));

    
  */
    
    infoMazda m = new infoMazda("mazda",676);
    comandPrecio p = new comandPrecio(m);
    p.execute();
    
    
    infoToyota t = new infoToyota("toyota",676);
    comandPrecio x = new comandPrecio(t);
    x.execute();
    
    
    infoAudi q = new infoAudi("audi",676);
    comandPrecio z = new comandPrecio(q);
    z.execute();
            

    }
    
}
