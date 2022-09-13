
package primeraEva.examen;

public class monedero {
    private double dinero;
    public monedero(double dineroInicial)
    {
        setDinero(dineroInicial);
    }
    public monedero meter (double cantidad)
    {
        if(cantidad>0)
            setDinero(getDinero()+cantidad);
        return this;
    }
    public double sacar (double cantidad)
    {   
        if(cantidad<0)
            return 0.0;
                    
            
        double dineroSacado=cantidad;
        
        if(getDinero()==0)
        {
            System.out.println ("No tienes dinero");
            dineroSacado=0.0;
        }
        else if (cantidad>getDinero())
        {
            System.out.println ("Pides mas de lo que tienes");
            dineroSacado=getDinero();
        }
        setDinero(getDinero()-dineroSacado);
        return dineroSacado;
    }
    public double getDinero()
    {
        return dinero;
    }
    public monedero setDinero(double dinero)
    {
        if(dinero>=0)
            this.dinero=Math.round(dinero*100)/100.0;
        return this;
    }
    
}