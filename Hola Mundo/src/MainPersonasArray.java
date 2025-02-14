import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonasArray {
    public static void main(String[] args) {
        Personas p=new Personas();
        ArrayList<String> lista=new ArrayList<>();
        Scanner teclado=new Scanner(System.in);
        String frase="";
        System.out.println("Escribe quit para salir");
        while(true){
            System.out.println("Dame una frase");
            frase=teclado.nextLine();
            if (frase.equals("quit"))
                break;
            lista.add(frase);
        }
        //ESTRUCTURA ITERADOR
        for (String s: lista) {


        }

        /*
        String frase="Feliz San Valentine";
        lista.add(frase);

        frase="Proaño<<<<NDS";
        lista.add(frase);

        frase="Arriba Enjambre";
        lista.add(frase);

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if (lista.contains(frase)) {
            System.out.println("Tristemente así será");
        }else{
            System.out.println("Eres afortunado");

         */

        }
    }
}
