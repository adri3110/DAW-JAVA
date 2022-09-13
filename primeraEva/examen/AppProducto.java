
package primeraEva.examen;

import java.util.ArrayList;

public class AppProducto {
    public static void main(String[] args) {
        double precioFinal=0,total=0;
        
        ArrayList al=new ArrayList();
        colonias c1=new colonias(10,15,"chanel");
        colonias c2=new colonias(20,50,"lavanda");
        cremas cr1=new cremas(30,25,"nivea");
        cremas cr2=new cremas(40,45,"crema2");
        colonias col=null;
        cremas cre=null;
        al.add(c1);
        al.add(c2);
        al.add(cr1);
        al.add(cr2);
        
        for(Object a:al){
            System.out.println(a.toString());
            System.out.println("");
        }
        for(Object a:al){
            if(a instanceof colonias){
                col=(colonias)a;
                precioFinal=col.getPrecio()*1.21;
                total=total+precioFinal;
            }
            else if(a instanceof cremas){
                cre=(cremas)a;
                precioFinal=cre.getPrecio()*1.18;
                total=total+precioFinal;
            }
        }
        System.out.println("El total recaudado es: "+total);
    }
}