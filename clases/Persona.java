
package clases;

import java.io.Serializable;

public class Persona implements Serializable{
    public String nombre="";
    public int edad=0;
    public float peso=0;
    
    public Persona(String nombre,int edad,float peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }
}
