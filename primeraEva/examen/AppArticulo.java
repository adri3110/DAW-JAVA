package primeraEva.examen;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AppArticulo {
    static ArrayList articulos=new ArrayList();
    static final int TOPE=100;
    static Scanner tec=new Scanner(System.in);
    
    public static void main(String[] args){
        int opcionElegida=0;
        
        /*
        //probar clases
        articulo a;
        a=new articulo();
        System.out.println(a.getNombreArticulo()+"  "+a.getNumeroUnidades()+"  "+a.getPrecio());
        a.setNumeroUnidades(20).setPrecio(200).setNombreArticulo("portatil");
        System.out.println(a.getNombreArticulo()+"  "+a.getNumeroUnidades()+"  "+a.getPrecio());
        
        System.out.println("Pulsa una tecla para volver al menu "); tec.next();
        */
        //fin probar clases
        
        cargar();
        salir:
        while(true)
        {
            for(int i=0;i<100;i++)System.out.println("");
            System.out.println("1.Introducir nuevo articulo ");
            System.out.println("2.Modificar precio ");
            System.out.println("3.Listar articulos ");
            System.out.println("4.Aplicar descuento ");
            System.out.println("Terminar");


            System.out.println("Opcion elegida: ");
            opcionElegida=tec.nextInt();
            for(int i=0;i<100;i++)System.out.println("");
            switch(opcionElegida)
            {
                case 1: introducir();break;
                case 2: modificar();break;
                case 3: listar();break;
                case 4: descuento();break;
                default:break salir;
                
            }
            
            System.out.println("Pulsa una tecla para volver al menu ");
            tec.next();
    
        }
        for(int i=0;i<100;i++)System.out.println("");
        System.out.println("PROGRAMA TERMINADO!!!");
        volcar();
    }
    public static void introducir() {
        String nom="";
        int numUni=0;
        double pre=0;
        String ns[]=articulo.getNombres();
        boolean encontrado=false;
        if(articulos.size()<TOPE){
            System.out.println("Introduce nombre del articulo: ");
            nom=tec.next();
            for(int i=0;i<ns.length;i++){
                if(ns[i].equals(nom)){
                    encontrado=true;
                }
            }
            if(encontrado){
                encontrado=false;
                for(Object a:articulos){
                    articulo ar=((articulo) a);
                    
                    if(ar.getNombreArticulo().equals(nom)){
                        encontrado=true;
                    }
                    
                }
                if(encontrado==false){
                    System.out.println("Introduce el precio del articulo: ");
                    pre=tec.nextDouble();
                    System.out.println("Introduce el nº de unidades del articulo: ");
                    numUni=tec.nextInt();
                    articulos.add(new articulo(nom,pre,numUni));
                    System.out.println("Articulo añadido!!! ");
                }
                else{
                    System.out.println("El articulo a insertar ya existe!!! ");
                }
            }
            else{
                System.out.println("Nombre del articulo no valido!!! ");
            }
            
        }
        else{
            System.out.println("No puede haber mas de "+TOPE+" articulos!!! ");
        }
    }
    
    public static void modificar() {
        String nom="";
        int numUni=0;
        double pre=0;
        String ns[]=articulo.getNombres();
        boolean encontrado=false;
        articulo arEnc=null;
       
        System.out.println("Introduce nombre del articulo: ");
        nom=tec.next();
        for(int i=0;i<ns.length;i++){
            if(ns[i].equals(nom)){
                encontrado=true;
            }
        }
        if(encontrado){
            encontrado=false;
            for(Object a:articulos){
                articulo ar=((articulo) a);

                if(ar.getNombreArticulo().equals(nom)){
                    encontrado=true;
                    arEnc=ar;
                }

            }
            if(encontrado==true){
                System.out.println("Introduce el precio del articulo: ");
                pre=tec.nextDouble();
                System.out.println("Introduce el nº de unidades del articulo: ");
                numUni=tec.nextInt();
                arEnc.setPrecio(pre);
                arEnc.setNumeroUnidades(numUni);
                System.out.println("Articulo modificado!!! ");
            }
            else{
                System.out.println("El articulo a modificar no existe!!! ");
            }
        }
        else{
            System.out.println("Nombre del articulo a modificar no es valido!!! ");
        }
    }
    
    public static void listar() {
        System.out.format("%-20s %6s %8s\n","PRODUCTO","PRECIO","UNIDADES");
        System.out.println("-------------------- ------ --------");
        for(Object a:articulos){
            articulo ar=((articulo) a);
            
            System.out.format("%-20s %6.2f %8d\n"
                    ,ar.getNombreArticulo(),ar.getPrecio(),ar.getNumeroUnidades());
        }
    }
    
    public static void descuento() {
        int acu=0;
        float media=0;
        for(Object a:articulos){
            articulo ar=((articulo) a);
            acu+=ar.getNumeroUnidades();
        }
        media=(float)acu/articulos.size();
        
        for(Object a:articulos){
            
            articulo ar=((articulo) a);
            if(ar.getNumeroUnidades()<media){
               ar.setPrecio(ar.getPrecio()*0.9);
            }
        }
    }
    
    public static void cargar() {
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\ficheros/articulo.bin"));
            articulos=(ArrayList)ois.readObject();
            ois.close();
        }
        
        catch(FileNotFoundException ex){ 
        }
        catch(ClassNotFoundException ex){
            System.out.println("!!! ");
            ex.printStackTrace();
        }
        catch(IOException ex){
            System.out.println("Error de e/s!!! ");
            ex.printStackTrace();
        }
        
    }
    
    public static void volcar() {
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\ficheros/articulo.bin"));
            oos.writeObject(articulos);
            oos.close();
        }
        catch(IOException ex){
            System.out.println("Error de e/s!!! ");
            ex.printStackTrace();
        }
    }
}