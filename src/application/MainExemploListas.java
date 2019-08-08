package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainExemploListas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Diogo");
        list.add("Dener");
        list.add("Djaci");
        list.add("Marinalva");
        list.add(1, "Marcelo");



        for (String lista : list){
            System.out.println(lista);
        }

        System.out.println("---------------------");
        //list.removeIf(lista -> lista.charAt(0) == 'D');
        for (String lista : list){
            System.out.println(lista);
        }
        System.out.println("---------------------");
        System.out.println("Index of Marcelo: "+ list.indexOf("Marcelo"));
        System.out.println("Index of Matheus: "+ list.indexOf("Matheus"));
        System.out.println("---------------------");

        List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'D').collect(Collectors.toList());
        for (String lista : result){
            System.out.println(lista);
        }
        System.out.println("---------------------");
        String nome = list.stream().filter(lista -> lista.charAt(0) == 'E').findFirst().orElse(null);
        System.out.println(nome);



    }
}
