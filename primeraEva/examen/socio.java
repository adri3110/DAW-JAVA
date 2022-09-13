
package primeraEva.examen;

import java.util.Scanner;

public class socio {
    public static void main(String[] args) {
        int edad=0,cuotaPagar=0;
        double desc=0;
        boolean socio=false;
        final int cuota=400;
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Edad: ");
        edad=tec.nextInt();
        if(edad<18){
            System.out.println("¿Son los padres socios?");
            socio=tec.nextBoolean();
        }
        //calculamos los descuentos:
        if(edad<18){
            if(socio){
                desc=0.35;       
            }
            else{
                desc=0.25;
            }
        }
        else if(edad>65){
            desc=0.5;
        }
        else{
            desc=0.0;
        }
        //calculamos la cuota a pagar
        cuotaPagar=(int)(cuota-cuota*desc);
        System.out.println("La cuota inicial es de: "+cuota);
        System.out.println("Descuento aplicado: "+desc);
        System.out.println("Cuota a pagar: "+cuotaPagar);
    }
}
