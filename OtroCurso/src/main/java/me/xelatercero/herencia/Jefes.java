package me.xelatercero.herencia;

import java.util.ArrayList;

public class Jefes extends Empleados {

    public Jefes(String nombre, double sueldo, int ano, int mes, int dia) {
        super(nombre, sueldo, ano, mes, dia);
        jefes.add(this);
    }
    
    ArrayList<Jefes> jefes = new ArrayList<>();

    public void despedirEmpleado(String nombre, int id) {

        ArrayList<Empleados> empleados = Empleados.getListaEmpleados();
        boolean bolNombre = false;
        boolean boliD = false;
        boolean esUnJefe = false;
        

        for (Empleados emp : empleados) {
            
            

            if (nombre.equalsIgnoreCase(emp.getNombre())) {

                bolNombre = true;

                if (id == emp.getId()) {
                    boliD = true;
                    
                    if(jefes.contains(emp)) {
                        esUnJefe = true;
                        System.out.println("No puedes despedir a un jefe");
                        break;
                    } else {
                        Empleados.removeEmpleado(emp);
                        break;
                    }
      
                } else {
                    boliD = false;
                }
            } 

            

        }
        
        if(esUnJefe != true) {
            
            if (bolNombre) {

                if (boliD) {

                    System.out.println("El empleado fue despedido");

                } else {
                    System.out.println("El id no coincide con el empleado");
                }

            } else {
                System.out.println("El nombre no coincide con ningun empleado");
            }
            
        }
        
        
        
    }

}
