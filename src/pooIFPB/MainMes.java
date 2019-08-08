package pooIFPB;

import java.util.Scanner;

public class MainMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um mes por extenso: ");
        String mes = sc.nextLine();

        switch (mes){
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println(mes+ " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println(mes+ " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println(mes+ " tem 28 ou 29 dias.");
                break;
        }
    }
}
