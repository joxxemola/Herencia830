/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Usuario
 */
public class NominaController {
    protected String nombre;
    protected double salarioBase;
    
    public NominaController (String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    //metodo para polimórfico
    
    public double calcularPago(){
        return salarioBase;
    }
    
    public String getNombre(){
        return nombre;
    }
}
