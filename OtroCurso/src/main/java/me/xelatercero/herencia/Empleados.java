
package me.xelatercero.herencia;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Empleados {
    
    public Empleados(String nombre, double sueldo, int ano, int mes, int dia) {
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        calendar = new GregorianCalendar(ano, mes, dia);
        id = idSiguiente;
        idSiguiente++;
        listaEmpleados.add(this);
        
        
        
    }
    
    private final String nombre; 
    private double sueldo;
    private int ano;
    private int mes;
    private int dia;
    private int id;
    private static int idSiguiente = 1;
    private GregorianCalendar calendar;
    private static ArrayList<Empleados> listaEmpleados = new ArrayList<>();
    
    
    
    
    //SETTERS
    
    public void setSueldo(int sueldo ) {
        
        this.sueldo = sueldo;
        
        
    }
    
    public void setEmpleado(Empleados emp) {
        
        
        
    }
    
    //GETTERS
    
    public String getNombre() {
        return nombre;
    }
    
    public static ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }
    
    public static void removeEmpleado(Empleados emp) {
        listaEmpleados.remove(emp);
    }
    
    
    public String getSueldo() {
        return "El sueldo de " + nombre + " es de " + sueldo;
    }
    
    public GregorianCalendar getFechaAlta() {
        return calendar;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDatosTotales() {
        
        return "Nombre: " + nombre + "\n" +
               "Id: " + id + "\n" +
               "Fecha de Alta: " + calendar + "\n" +
               "Sueldo: " + sueldo;
        
    }
    
    
}
