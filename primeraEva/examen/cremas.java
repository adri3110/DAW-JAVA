
package primeraEva.examen;

public class cremas extends producto{
    private String lab="";
    public cremas(int codigo, int precio,String lab) {
        super(codigo, precio);
        setLab(lab);
    }
    
    public cremas setLab(String lab){
        this.lab=lab;
        return this;
    }
    public String getLab(){
        return lab;
    }
    @Override
    public String toString(){
        String cadena=super.toString();
        cadena=cadena+"\nlaboratorio:"+getLab();
        return cadena;
    }
}
