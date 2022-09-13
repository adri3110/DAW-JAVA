package primeraEva;

public class carreraCaballos {

    public static void main(String[] args)throws InterruptedException
    {
        final int MAX_GANADAS=10;
        int cab1=0,cab2=0,cab3=0,cab4=0,cab5=0,cab6=0,cab7=0,cab8=0,cab9=0;
        int n=0,carreras=0;
        
        
        while(true){
            for(int j=0;j<100;j++)
                System.out.println();
            carreras=(int)(Math.random()*9+1);
        
            switch(carreras){
                case 1:cab1++;break;
                case 2:cab2++;break;
                case 3:cab3++;break;
                case 4:cab4++;break;
                case 5:cab5++;break;
                case 6:cab6++;break;
                case 7:cab7++;break;
                case 8:cab8++;break;
                case 9:cab9++;break;
            }
            
            System.out.printf("%02d: ",1);
            for(int j=0;j<cab1;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",2);
            for(int j=0;j<cab2;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",3);
            for(int j=0;j<cab3;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",4);
            for(int j=0;j<cab4;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",5);
            for(int j=0;j<cab5;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",6);
            for(int j=0;j<cab6;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",7);
            for(int j=0;j<cab7;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",8);
            for(int j=0;j<cab8;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",9);
            for(int j=0;j<cab9;j++)
                System.out.print("* ");
            System.out.println();
            if(cab1==MAX_GANADAS||cab2==MAX_GANADAS||cab3==MAX_GANADAS||cab4==MAX_GANADAS||cab5==MAX_GANADAS||cab6==MAX_GANADAS||cab7==MAX_GANADAS||cab8==MAX_GANADAS||cab9==MAX_GANADAS)break;
            /*System.out.println("Los resultados de las carreras son:\n caballo 1: "+cab1+"\n caballo 2: "
                    +cab2+"\n caballo 3: "+cab3+"\n caballo 4: "+cab4+"\n caballo 5: "+cab5+"\n caballo 6: "
                    +cab6+"\n caballo 7: "+cab7+"\n caballo 8: "+cab8);*/
            Thread.sleep(500);
        }
    }
}