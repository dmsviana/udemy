package application;

import java.util.Locale;
import java.util.Scanner;

public class MainExemploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        double vetor[] = new double[n];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(sc.nextLine());

        }
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++ ){
            soma += vetor[i];

        }
        double media = soma/n;
        System.out.printf("Media: %.2f%n", media);



        sc.close();
    }
}
