package application;


import classes.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class MainEstudante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Estudante estudantes[] = new Estudante[10];
        System.out.println("How many rooms will be rented (1 - 10): ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = Integer.parseInt(sc.nextLine());
            estudantes[room] = new Estudante(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] != null){
                System.out.println(i + ": "+ estudantes[i]);
            }
        }

    }




}
