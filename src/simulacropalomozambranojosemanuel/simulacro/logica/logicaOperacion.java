/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacropalomozambranojosemanuel.simulacro.logica;

import java.util.ArrayList;
import java.util.List;
import simulacropalomozambranojosemanuel.simulacro.dto.Operacion;

/**
 *
 * @author Usuario
 */



public class logicaOperacion {
    
    private static ArrayList<Operacion> operaciones = new ArrayList<>();
    
    
    public static void añadir(Operacion operacion) {
        
        
        operaciones.add(operacion);
    }
    public static List <Operacion> getLista(){
    
    return operaciones;
    
    }
    
}
