package primeraEva;

import clases.libreria;

public class enteroValido {
    public static void main(String[] args)
    {
        //declaracion
        int num=0;
        while(true)
        {
            num=libreria.validarEntero("Escribe un n entre 0-10: ","Nº con formato incorrecto o desbordado!!!");
            if(0<=num && num<=10)break;
            else
                System.out.println("Numero fuera del rango");
        }
        //salida
        System.out.println("El nº introducido es: "+num);
    }
}
