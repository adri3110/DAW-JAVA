
package primeraEva;

import java.io.*;


public class mostrarData {
    public static void main(String[] args) {
        DataInputStream dis=null;
        String nombre="";
        int edad=0;
        float peso=0;
        
        try
        {
            dis=new DataInputStream(new FileInputStream("c:\\ficheros/data.bin"));
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            try
            {
                while(true)
                {

                    nombre=dis.readUTF();
                    edad=dis.readInt();
                    peso=dis.readFloat();
                    System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);

                }
            }
            catch(EOFException ex){
                dis.close();
                
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
