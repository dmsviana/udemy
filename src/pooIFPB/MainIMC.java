package pooIFPB;

import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        double imc = peso / (Math.pow(altura, 2));

        if(imc < 20){
            System.out.println("Abaixo do peso.");
        } else if (imc > 20 && imc <= 25){
            System.out.println("Peso normal");
        } else if (imc > 25 && imc <= 30 ){
            System.out.println("Sobre peso");
        } else if (imc > 30 && imc <= 40){
            System.out.println("Obeso");
        } else
            System.out.println("Obeso mórbido");


    }
}
