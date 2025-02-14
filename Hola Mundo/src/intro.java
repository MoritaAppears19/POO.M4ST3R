import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        /*
        //Variables en Java
        int a;
        double b;
        float c;
        String d;
        boolean e;

        a=3;
        b=20.50;
        d="Esto es una cadena.";
        e=true;

        String n="Morita";

        //Constantes

        final double pi=3.1416;

        Scanner intro=new Scanner(System.in);
        b=intro.nextDouble();
        System.out.println(b);


        //Concicionales
        //Operadores lógicos &&, !
        int valor=20;
        int calif=82;
        if(valor>=20 && calif>80){
            if(valor==20) {
                System.out.println("Es exactamente 20.");
            }else{
                System.out.println("No es exactamente a 20.");
            }
            System.out.println("Es mayor.");
        } else{
            System.out.println("Es menor.");
        }
        System.out.println("FIN DEL PROGRAMA.");

        //Condicionales múltiples "Switch"
        int opc;
        opc=9;

        switch(opc){
            case 1:
                System.out.println("Vale 1.");
                break;
            case 2:
                System.out.println("Vale 2.");
                break;
            case 3:
                System.out.println("Vale 3.");
                break;
            default:
                System.out.println("Valor no permitido.");


        //Ciclos

        for(int h=0;h<=10;h+=2){
            System.out.println(h);
        }


        int m;
        for(int i = 10; m=0; i!=m, i--, m++){
            System.out.println(i);
        }

        Scanner tec=new Scanner(System.in);
                int opc=-1;
        for(;;){
            System.out.println("Escribe 0 para salir.");
            opc=tec.nextInt();
            switch(opc) {
                case 1:
                    System.out.println("Tecleaste 1");
                    break;
                case 2:
                    System.out.println("Tecleaste 2");
                    break;
                case 3:
                    System.out.println("Tecleaste 3");
                default:
                    break;
            }
        }
        if(opc==0)
            break;

        int m=20;
        while( !(m<10)){
            System.out.println(m);
            m=m-1;
        }
        int cent=0;
        while(cent!=0){
            System.out.println(cent);
        }

        int centinela=0;
        do{
            System.out.println("Centinela en Do While");
        }while(centinela!=0);



        System.out.println(sumar(3, 5));
        mult(6, 10);


        //Arreglos
        //int[] edades={18,20,21,25,19,22};
        //String nombres[]={"Leo","Abraham","Rebecca"};

        int edades[]=new int[10];
        edades[6]=10;
        edades[1]=20;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String paises[]=new String[5];
        paises[0]="Alemania";
        paises[3]="Japón";
        paises[2]="Bélgica";
        System.out.println(paises[0]);
        System.out.println(paises[2]);
        System.out.println(paises[3]);

        */
        //Matrices
        int calificaciones[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(calificaciones[0][2]);
        System.out.println(calificaciones.length);
        for(int i=0;i<calificaciones.length;i++){
            for(int j=0;j<calificaciones[0].length;j++){
                System.out.println(calificaciones[i][j]);
            }
        }
        double califpoo[][]=new double[27][6];
        califpoo[7][0]=99;
        System.out.println(califpoo[7][0]);
       //System.out.println(nombres[nombres.length-1]);

        //for(int i=0;i<nombres.length;i++){
            //System.out.println(nombres[i]);
        }
    } //Fin del Main
    /*
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void mult(int c, int d) {
        int res;
        res = c * d;
        System.out.println(res);
    }
    */
