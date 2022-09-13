package primeraEva.examen;

import java.io.Serializable;

public class articulo implements Serializable{
    //atributos
    private String nombreArticulo="camara";
    private double precio=1;
    private int numeroUnidades=0;
    private static String[] nombres=new String[]{
        "camara",
        "ordenador",
        "movil",
        "portatil"
    };
    
    //metodos get
    public String getNombreArticulo()
    {
        return nombreArticulo;
    }
    public double getPrecio()
    {
        /*int cent=(int)(precio*100);
        return cent;*/
        return precio;
    }
    public int getNumeroUnidades()
    {
        return numeroUnidades;
    }
    //metodos set
    
    public articulo setNombreArticulo(String nombreArticulo)
    {
        boolean encontrado=false;
        String nom[]=getNombres();
        for(int i=0;i<nom.length;i++){
            if(nom[i].equals(nombreArticulo)) encontrado=true;
        }
        if(encontrado)
        this.nombreArticulo=nombreArticulo;
        return this;
    }
    
    public articulo setPrecio(double precio)
    {
        if(precio>0)
        this.precio=precio;
        return this;
    }
    
    public articulo setNumeroUnidades(int numeroUnidades)
    {
        if(numeroUnidades>=0)
        this.numeroUnidades=numeroUnidades;
        return this;
    }
    
    public static String[] getNombres()
    {
        return nombres;
    }
    
    //constructores
    
    public articulo(String nombreArticulo,double precio,int numeroUnidades)
    {
        setNombreArticulo(nombreArticulo);
        setPrecio(precio);
        setNumeroUnidades(numeroUnidades);
    }
    public articulo(String nombreArticulo)
    {
        this(nombreArticulo,1,0);
    }
    
    public articulo(double precio)
    {
        this("portatil",precio,0);
    }
    
    public articulo(int numeroUnidades)
    {
        this("portatil",1,numeroUnidades);
    }
    public articulo(String nombreArticulo,double precio)
    {
        this(nombreArticulo,precio,0);
    }
    
    public articulo(double precio,String nombreArticulo)
    {
        this(nombreArticulo,precio,0);
    }
    
    public articulo()
    {
        this("movil",1,0);
    }
}