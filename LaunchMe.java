import java.util.Scanner;
import java.lang.Math;

public class LaunchMe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer n, la taille de la collection d'entiers: ");
        int n = sc.nextInt();

        System.out.println("Entrer m, la valeur du plus grand entier de la collection: ");
        int m = sc.nextInt();

        System.out.println("Entrer epsilon, la valeur du paramètre de confidentialité: ");
        float epsilon = sc.nextFloat();
        System.out.println(Math.log(1));
        int integers[] = new int[n];
        for(int i = 0; i < n; i++) {
            float rd = (float) Math.random() * m;
            integers[i] = Math.round(rd);
        }
        for(int i = 0; i < integers.length; i++) {
            System.out.println("integers[" + i + "] = " + integers[i]);
        }

    }    
}