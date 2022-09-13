
package primeraEva.examen;

public class colonias extends producto{
    private String marca="";
    public colonias(int codigo, int precio,String marca) {
        super(codigo, precio);
        setMarca(marca);
    }
    public colonias setMarca(String marca){
        this.marca=marca;
        return this;
    }
    public String getMarca(){
        return this.marca;
    }
    @Override
    public String toString(){
        String cadena=super.toString();
        cadena=cadena+"\nmarca:"+getMarca();
        return cadena;
    }
}
