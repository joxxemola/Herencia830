/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Usuario
 */

import Modelo.Empleado;
import Modelo.Gerente;
import Controlador.NominaController;


public class Herencia830 {
    
    public static void main (String[] args){
        
        System.out.println("Aprendiendo herencia");
        NominaController control = new NominaController();
        
        //poliformismo
        
        control.RegistrarEmpleados(new Empleado("Jose D Molano", 5000));
        control.RegistrarEmpleados(new Gerente("Salome Diaz", 7000, 600));
        
        //Listado de pagos 
        System.out.println("=== litado de pagos ===");
        for(Empleado emp: control.obtenerLita()){
          //aqui es donde actua el polimorfismo: cada objeto sabe como calcular su pago.
          System.out.println("Nombre:" +emp.getNombre());
          System.out.println("Pago: $:" +emp.calcuclarPago());
          System.out.println("--------------------------------");
          
          //sobrecarga 
          System.out.println("=== Prueba de sobrecarga ===");
          Empleado busqueda1 =control.buscar("Jose D Molano");
          Empleado busqueda2 =control.buscar(1);
          
          System.out.println("=== Pueba de sobrecarga busqueda por nombre: ===" + (busqueda1 != null? busqueda1.getNombre():"No existe"));
          System.out.println("=== Pueba de sobrecarga busqueda por indiece: ===" + (busqueda2 != null? busqueda1.getNombre():"No existe"));
          
        }
    }
}
