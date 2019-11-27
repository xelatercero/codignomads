
package me.xelatercero.herencia;

import java.util.ArrayList;
import java.util.TimerTask;


public class Clock extends TimerTask {

    @Override
    public void run() {
        
        ArrayList<Empleados> empleados = Empleados.getListaEmpleados();
        
        for(Empleados emp : empleados ) {
        
            System.out.println(emp.getNombre());
                    
        
        }
        
        
    }
    
       
    
}
