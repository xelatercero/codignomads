
package me.xelatercero.herencia;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class UsoEmpleados {
    
    public static void main(String[] args) {
        
        Empleados jose = new Empleados("Jose", 2300, 2007, 11, 9);
        
        Empleados maria = new Empleados("Maria", 2300, 2007, 11, 9);
        
       
        
        ArrayList<Empleados> lista = Empleados.getListaEmpleados();
        
       for(Empleados emp : lista) {
           
           System.out.println(emp.getNombre());
           System.out.println(emp.getId());
       }
       
       Jefes ana = new Jefes("Ana", 5000, 2001, 10, 21);
       Jefes ana2 = new Jefes("Ana2", 5000, 2001, 10, 21);
       
       ana.despedirEmpleado("Ana", 3);
       
       for(Empleados emp : lista) {
           
           System.out.println(emp.getNombre());
           System.out.println(emp.getId());
       }
       
        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(new Clock(), 0, 5000);
        
        
    }
    
}
