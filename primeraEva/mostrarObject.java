
package primeraEva;

import clases.Persona;
import java.io.*;

public class mostrarObject {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        String nombre="";
        int edad=0;
        float peso=0;
        Persona p=null;
        
        try
        {
            ois=new ObjectInputStream(new FileInputStream("c:\\ficheros/object.bin"));
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            try
            {
                while(true)
                {
                    p=(Persona)ois.readObject();
                    System.out.format("%-20s %4d %4.1f\n",p.nombre,p.edad,p.peso);
                }
            }
            catch(EOFException ex){
                ois.close();
                
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Fichero no encontrado!!! ");
            
        }
        catch(IOException ex)
        {
            System.out.println("Error de e/s!!! ");
            
        }
        catch(Exception ex)
        {
            System.out.println("error desconocido");
            
        } 
        
    }
}
