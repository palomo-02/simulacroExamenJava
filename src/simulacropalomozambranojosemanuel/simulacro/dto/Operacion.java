/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacropalomozambranojosemanuel.simulacro.dto;

/**
 *
 * @author Usuario
 */
public class Operacion {
    
    
    String operacion;
    int numero1;
    int numero2;
   double resultado;

    public Operacion(String operacion, int numero1, int numero2, double resultado) {
        this.operacion = operacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    
}
