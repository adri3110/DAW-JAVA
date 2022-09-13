
package primeraEva;

import clases.ObjectOutputStreamAppend;
import clases.Persona;
import java.io.*;
import java.util.Scanner;

public class insertarObject {
    public static void main(String[] args) {
         Scanner tec=new Scanner(System.in);
        ObjectOutputStream oos=null;
        String nombre="";
        int edad=0;
        float peso=0;
        Persona p=null;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            
            System.out.print("Escribe la edad: ");
            edad=tec.nextInt();
            System.out.print("Escribe el peso: ");
            peso=tec.nextFloat();
            
            p=new Persona(nombre,edad,peso);
            if(new File("c:\\ficheros/object.bin").exists())
                    oos=new ObjectOutputStreamAppend(new FileOutputStream("c:\\ficheros/object.bin",true));
            else  oos=new ObjectOutputStream(new FileOutputStream("c:\\ficheros/object.bin"));
                            
            
                
            oos.writeObject(p);
            
            oos.close();
            
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
