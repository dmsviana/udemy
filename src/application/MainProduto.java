package application;

import classes.Produto;

import java.util.Locale;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(sc.nextLine());
        Produto produtos[] = new Produto[n];

        for (int i = 0; i < produtos.length; i++){
            String name = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            produtos[i] = new Produto(name, price);
        }
         double soma = 0.0;
        for (int i = 0; i < produtos.length; i++){
            soma += produtos[i].getPreco();
        }
        double media = soma/produtos.length;
        System.out.printf("Media de preço: %.2f%n", media);
        sc.close();


    }
}
