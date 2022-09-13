
package primeraEva;

import clases.libreria;
import java.io.*;
import java.util.Scanner;
import static primeraEva.insertarData.buscar;

public class insertarRandom {
    public static void main(String[] args)throws InterruptedException{
        int opcionElegida=0;
        Scanner tec=new Scanner(System.in);
        
        salir:
        while(true)
        {
            libreria.saltarLinea(100);
            System.out.println("1.Insertar");
            System.out.println("2.Longitud del fichero");
            System.out.println("3.Número de registros");
            System.out.println("4.Vaciar fichero");
            System.out.println("5.Mostrar datos");
            System.out.println("6.Buscar");
            System.out.println("7.Eliminar");
            
            System.out.println("Terminar");


            System.out.println("Opcion elegida: ");
            opcionElegida=tec.nextInt();
            libreria.saltarLinea(100);
            switch(opcionElegida)
            {
                case 1: insertar();break;
                case 2: longitud();break;
                case 3: numeroReg();break;
                case 4: vaciar();break;
                case 5: mostrar();break;
                case 6: buscar();break;
                case 7: eliminar();break;
                default:break salir;
                
            }
            libreria.detenerControl("Pulsa una tecla para volver al menu ");
        }
        libreria.saltarLinea(100);
        System.out.println("PROGRAMA TERMINADO!!!");
    }
    
    
     public static void insertar() {
        Scanner tec=new Scanner(System.in);
        RandomAccessFile fra=null;
        String nombre="";
        int edad=0,lon=0;
        float peso=0;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            lon= nombre.length();
            
            for(int i=0;i<20-lon;i++){
                nombre=nombre+" ";
            }
            if(buscar(nombre.trim())==-1){
                System.out.print("Escribe la edad: ");
                edad=tec.nextInt();
                System.out.print("Escribe el peso: ");
                peso=tec.nextFloat();
                if(buscar(nombre.trim())==-1){
                    fra=new RandomAccessFile("c:\\ficheros/random.bin","rw");
                    fra.seek(fra.length());
                    fra.writeInt(1);
                    fra.writeUTF(nombre);
                    fra.writeInt(edad);
                    fra.writeFloat(peso);
                    
                    fra.close();
                }
                else{
                    System.out.println("Otro usuario ya a insertado ese nombre ");
                }
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
     
     public static void longitud() {
        RandomAccessFile fra=null;
                
        try
        {
            fra=new RandomAccessFile("c:\\ficheros/random.bin","rw");
            System.out.println(fra.length());
            fra.close();
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
     
     
     public static void numeroReg() {
        RandomAccessFile fra=null;
                
        try
        {
            fra=new RandomAccessFile("c:\\ficheros/random.bin","rw");
            System.out.println(fra.length()/34);
            fra.close();
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
     
     public static void vaciar() {
        RandomAccessFile fra=null;
                
        try
        {
            fra=new RandomAccessFile("c:\\ficheros/random.bin","rw");
            fra.setLength(0);
            fra.close();
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
     
     
     public static void mostrar() {
        RandomAccessFile fra=null;
        String nombre="";
        int edad=0,estado=0;
        float peso=0;
        
        try
        {
            fra=new RandomAccessFile("c:\\ficheros/random.bin","r");
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            try
            {
                while(true)
                {
                    estado=fra.readInt();
                    
                    nombre=fra.readUTF();
                    edad=fra.readInt();
                    peso=fra.readFloat();
                    if(estado!=0)
                        System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);

                }
            }
            catch(EOFException ex){
                fra.close();
                
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
     
public static long buscar(String nom) throws IOException,FileNotFoundException{
        RandomAccessFile fra=null;
        String nombre="";
        int estado=0;
        long posicion=0;
        
        long encontrado=-1;
        fra=new RandomAccessFile("c:\\ficheros/random.bin","r");
        try
        {
            while(true)
            {
                posicion=fra.getFilePointer();
                estado=fra.readInt();
                nombre=fra.readUTF().trim();
                fra.readInt();
                fra.readFloat();
                if(nombre.equals(nom) && estado!=0)
                {
                    encontrado=posicion;
                    
                }
            }
        }
        catch(EOFException ex)
        {
            fra.close();
        }
        return encontrado;
    }

    public static void buscar() {
        Scanner tec=new Scanner(System.in);
        RandomAccessFile fra=null;
        String nombre="";
        int edad=0,estado=0;
        long pos=0;
        float peso=0;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            pos= buscar(nombre);
            
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            if(pos==-1)
                System.out.println("No se encuentra!");
            else{
                fra=new RandomAccessFile("c:\\ficheros/random.bin","r");
                fra.seek(pos);
                estado=fra.readInt();
                nombre=fra.readUTF();
                edad=fra.readInt();
                peso=fra.readFloat();
                
                System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);
                
                fra.close();
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
    
    
     public static void eliminar() {
        Scanner tec=new Scanner(System.in);
        RandomAccessFile fra=null;
        String nombre="";
        int edad=0,lon=0,estado=0;
        float peso=0;
        long pos=0;
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            lon= nombre.length();
            
            for(int i=0;i<20-lon;i++){
                nombre=nombre+" ";
            }
            if(buscar(nombre.trim())!=-1){
                
                fra=new RandomAccessFile("c:\\ficheros/random.bin","rw");
                fra.seek(pos);
                
                estado=fra.readInt();
                System.out.println("el estado es: "+estado);
                if(estado!=0){
                    fra.seek(pos);
                    fra.writeInt(0);
                    nombre=fra.readUTF();
                    edad=fra.readInt();
                    peso=fra.readFloat();
                    System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
                    System.out.println("-------------------- ---- ----");
                    System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);
                    System.out.println("Registro eliminado correctamente ");
                }
                else{
                    System.out.println("Otro usuario ha borrado el registro ");
                }
                    
                fra.close();
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
}