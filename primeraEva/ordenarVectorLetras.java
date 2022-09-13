package primeraEva;

public class ordenarVectorLetras {
    public static void main(String[] args) {
        //declaracion
        char n[]=new char[20];
        int nValores=0;
        char aux='\0';
    //entrada-->nada
        
    //calculos
        //rellenar aleatoriamente el vector:
        for(int i=0;i<n.length;i++)//n[i]
        {
            nValores='z'-'a'+1;
            n[i]=(char)((int)(Math.random()*(nValores)+'a'));
        }
        //escritura
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            
            System.out.print(n[i]);
            
        }
        //Ordenar el vector(burbuja):
        for(int j=0;j<n.length;j++)
            for(int i=0;i<n.length-1;i++)
                if(n[i]<n[i+1])//con < se ordena descendentemente; y con > ascendentemente
                {
                    aux=n[i];
                    n[i]=n[i+1];
                    n[i+1]=aux;
                }
        
        System.out.println();
         //escritura final con vector ordenado:
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            System.out.print(n[i]);
            
        }
        System.out.println();   
    }
}


