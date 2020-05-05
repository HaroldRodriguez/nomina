/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 */
@ManagedBean
@RequestScoped
public class ControladorNavegacion  implements Serializable{ //escucha los eventos de algun boton
     //Declara variables de tipo objeto
    private String nombre;
    private String apellido;
    private int cedula;
    private int sueldo;
    private int diasTrabajados;
    private String estudios;
    private String [] idioma;
    
    
    Persona persona = new Persona(nombre,apellido,cedula,sueldo,diasTrabajados,estudios,idioma);
    /**
     * Creates a new instance of ControladorNavegacion
     */
    
    public ControladorNavegacion()  {
        
    }
    
    // Setter y Getter de las propiedades declaradas

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

 
    
     
}
