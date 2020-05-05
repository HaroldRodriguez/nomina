/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

/**
 *
 *@author Camila Urueña
 *@author Harold Gomez
 */
@ManagedBean
@RequestScoped
public class Mostrar implements Serializable {
    //se llama al @ManagedBean para mostratr los datos que se ingresaron de la persona
    @ManagedProperty("#{controladorNavegacion}")
    
    //atributos del @ManagedBean
    private ControladorNavegacion controlador;
    /**
     * Creates a new instance of Mostrar
     */
    public Mostrar() {
    }
    //Setter y Getter 
    public ControladorNavegacion getControlador() {
        return controlador;
    }

    public void setControlador(ControladorNavegacion controlador) {
        this.controlador = controlador;
    }
    
    //metodo que pinta en el otro formulario la informacion final
    
    public String MostrarInformacion(){
        return "El empleado: "+controlador.getNombre()+" "+controlador.getApellido()+ ", " 
                + "identificado con CC: "+ controlador.getCedula()+ ", " +  
                "Trabajo: " +controlador.getDiasTrabajados()+ " dias,"   +
                " con estudio de: "+ controlador.getEstudios()+ ", "+
                " habla:"+ controlador.getIdioma().length +   " idiomas, "+
                "sueldo por día: "+ controlador.getSueldo()+  " , " +
                " ||| La nomina final del empleado es: "+ controlador.getPersona().Total( controlador.getSueldo(), controlador.getDiasTrabajados(), controlador.getIdioma());
          
    }
    
}
