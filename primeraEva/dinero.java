package primeraEva;
import java.util.*;
public class dinero 
{

public static void main(String[] args) 
{

int B500=0, B200=0, B100=0, B50=0, B20=0, B10=0, B5=0, M2=0, M1=0;
int M50=0, M20=0, M10=0, M05=0, M02=0, M01=0;
double importe, pago, Dinero;
int centimos=0;
Scanner tec=new Scanner(System.in);

System.out.println("Importe a pagar?");
importe=tec.nextDouble();

System.out.println("Con cuanto dinero paga?");
pago=tec.nextDouble();

Dinero= pago-importe;
centimos=(int)(Dinero*100);


B500= centimos / 50000;
centimos= centimos % 50000;



B200= centimos / 20000;
centimos= centimos % 20000;


B100= centimos / 10000;
centimos= centimos % 10000;


B50= centimos / 5000;
centimos= centimos % 5000;

B20= centimos / 2000;
centimos= centimos % 2000;

B10= centimos / 1000;
centimos= centimos % 1000;

B5= centimos / 500;
centimos= centimos % 500;

M2= centimos / 200;
centimos= centimos % 200;

M1= centimos / 100;
centimos= centimos % 100;

M50= centimos / 50;
centimos= centimos % 50;

M20= centimos / 20;
centimos= centimos % 20;

M10= centimos / 10;
centimos= centimos % 10;

M05= centimos / 5;
centimos= centimos % 5;

M02= centimos / 2;
centimos= centimos % 2;

M01= centimos / 1;
centimos= centimos % 1;

if(B500>0)System.out.println("Billetes de 500€= "+B500);
if(B200>0)System.out.println("Billetes de 200€= "+B200);
if(B100>0)System.out.println("Billetes de 100€= "+B100);
if(B50>0)System.out.println("Billetes de 50€= "+B50);
if(B20>0)System.out.println("Billetes de 20€= "+B20);
if(B10>0)System.out.println("Billetes de 10€= "+B10);
if(B5>0)System.out.println("Billetes de 5€= "+B5);
if(M2>0)System.out.println("Monedas de 2€= "+M2);
if(M1>0)System.out.println("Monedas de 1€= "+M1);
if(M50>0)System.out.println("Monedas de 50cnt= "+M50);
if(M20>0)System.out.println("Monedas de 20cnt= "+M20);
if(M10>0)System.out.println("Monedas de 10cnt= "+M10);
if(M05>0)System.out.println("Monedas de 5cnt= "+M05);
if(M02>0)System.out.println("Monedas de 5cnt= "+M02);
if(M01>0)System.out.println("Monedas de 1cnt= "+M01);

 }
}