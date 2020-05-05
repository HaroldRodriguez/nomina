/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 *@author Camila Urueña
 *@author Harold Gomez
 */
// atributos del modelo

    public class Persona {
        private String nombre;
        private String apellido;
        private int cedula;
        private int sueldo;
        private int diasTrabajados;
        private String estudios;
        private String [] idioma;


    public Persona(String nombre, String apellido,int cedula, int sueldo, int diasTrabajados,String estudios, String [] idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.diasTrabajados = diasTrabajados;
        this.estudios= estudios;
        this.idioma= idioma;
        
    }



    // Setter y Getter de las propiedades declaradas

   

    //metodo para calcular el aumento de estudios

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
    
     
    
    
    //metodo para calcular el saldo total de la persona 
   public int Total(int Sueldo, int diasTrabajados, String [] idioma ){
       
       int totalfinal=0;
       if(idioma.length ==0){
           totalfinal = Sueldo * diasTrabajados;
                   
       } else {
                      totalfinal = Sueldo * diasTrabajados;
                      for(int i=0; i< idioma.length ;i++){
                          if(idioma[i].equals("ingles")){
                              totalfinal= totalfinal + 10000;
                              
                          }else if(idioma[i].equals("frances")){
                              totalfinal= totalfinal + 10000;
                          }else if(idioma[i].equals("portugues"))
                          {
                              totalfinal= totalfinal + 10000;
                          }else if(idioma[i].equals("italiano")){
                              totalfinal= totalfinal + 10000;
                              
                          }else if(idioma[i].equals("latin")){
                              totalfinal= totalfinal + 10000;
                          }
                          
                      }
                }
   
       return totalfinal;
   }

    public String Total(int sueldo, int diasTrabajados, String estudios, String[] idioma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
            
    