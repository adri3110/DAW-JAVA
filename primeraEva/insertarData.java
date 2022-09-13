
package primeraEva;

import java.io.*;
import java.util.Scanner;

public class insertarData {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        DataOutputStream dos=null;
        String nombre="";
        int edad=0;
        float peso=0;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            if(!buscar(nombre)){
            
            System.out.print("Escribe la edad: ");
            edad=tec.nextInt();
            System.out.print("Escribe el peso: ");
            peso=tec.nextFloat();
            
            dos=new DataOutputStream(new FileOutputStream("c:\\ficheros/data.bin",true));
            dos.writeUTF(nombre);
            dos.writeInt(edad);
            dos.writeFloat(peso);

            dos.close();
            }
            else{
                System.out.println("el nombre a insertar ya existe ");
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
    public static boolean buscar(String nom) throws IOException,FileNotFoundException{
        DataInputStream dis=null;
        String nombre="";
        boolean encontrado=false;
        try{
            dis=new DataInputStream(new FileInputStream("c:\\ficheros/data.bin"));
            try
            {
                while(true)
                {
                    nombre=dis.readUTF();
                    dis.readInt();
                    dis.readFloat();
                    if(nombre.equals(nom))
                    {
                        encontrado=true;
                    }
                }
            }
            catch(EOFException ex)
            {
                dis.close();
            }
        }
        catch(FileNotFoundException ex)
        {
                        
        }
        return encontrado;
    }
}