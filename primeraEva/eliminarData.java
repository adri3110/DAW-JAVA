package primeraEva;

import java.io.*;
import java.util.Scanner;

public class eliminarData {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        DataInputStream dos=null;
        DataOutputStream dos2=null;
        String nombre="",nom="";
        int edad=0;
        float peso=0;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nom=tec.next();
            if(buscar(nom)){
                dos=new DataInputStream(new FileInputStream("c:\\ficheros/data.bin"));
                dos2=new DataOutputStream(new FileOutputStream("c:\\ficheros/adrian.bin"));
                 try
                {
                    while(true)
                    {
                        nombre=dos.readUTF();
                        edad=dos.readInt();
                        peso=dos.readFloat();
                        if(!nombre.equals(nom))
                        {
                            
                            dos2.writeUTF(nombre);
                            dos2.writeInt(edad);
                            dos2.writeFloat(peso);
                        }

                    }
                }
                catch(EOFException ex)
                {
                    dos.close();
                    
                    dos2.close();
                }
                    new File("c:\\ficheros/data.bin").delete();
                    new File("c:\\ficheros/adrian.bin").renameTo(new File("c:\\ficheros/data.bin"));
                    
                    System.out.println("Registro eliminado");  
                }
            else{
                System.out.println("el nombre a eliminar no existe ");
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
        return encontrado;
    }
}