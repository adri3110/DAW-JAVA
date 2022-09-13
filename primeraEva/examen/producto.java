package primeraEva.examen;

public class producto {
    private int codigo=0,precio=0;
    
    public producto(int codigo,int precio){
        setCodigo(codigo);
        setPrecio(precio);
        
    }
    /*public producto(){
    }*/
    public producto setPrecio(int precio){
        if(precio<0)return this;
        this.precio=precio;
        return this;
    }
    public producto setCodigo(int codigo){
        if(codigo<0)return this;
        this.codigo=codigo;
        return this;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCodigo(){
        return this.codigo;
    }
    @Override
    public String toString(){
        String cadena="codigo:"+getCodigo()+"\nprecio:"+getPrecio();
        return cadena/*+"\n"+super.toString()*/;
    }
    
}
