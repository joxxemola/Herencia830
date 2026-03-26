/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Empleado;
import Modelo.Gerente;
import java.util.ArrayList;

public class NominaController {
   
    private ArrayList<Empleado> listaEmpleados;
    //crear atributos

    public NominaController() {
        
        this.listaEmpleados= new ArrayList<>(); 
    }
    
    //Registro de empleados 
    public void RegistrarEmpleados(Empleado e){
    
        listaEmpleados.add(e);
        
        //sobrecarga
        public Empleado buscar(String nombre){  
            
            for(Empleado e: listaEmpleados){
            
            }        
        }
    }
    
     
 }