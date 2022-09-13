
package primeraEva.examen;
import primeraEva.examen.monedero;
public class pruebaMonedero {
    public static void main (String [] arg)
	{
            double calderilla;
            monedero miMonedero=new monedero(100);
            System.out.println ("En mi monedero tengo: " + miMonedero.getDinero());
            System.out.println ("Saco 75,873 Euros");
            calderilla=miMonedero.sacar(75.873);
            System.out.println ("He sacado " + calderilla + "Euros");
            System.out.println ("En mi monedero queda: " + miMonedero.getDinero());
    }
}