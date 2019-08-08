package application;

import classes.Contato;
import classes.Pessoa;

import java.util.Scanner;

public class MainContato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();
        p.setNome("Diogo Marcelo");
        p.setAnoDeNascimento(1998);

        Contato c = new Contato();
        c.setPessoa(p);
        c.setEmail("marcello.razer@gmail.com");
        System.out.println("Nome: "+c.getPessoa().getNome()+"\nAno de nascimento: "+c.getPessoa().getAnoDeNascimento()+"\nEmail: "+c.getEmail());
    }
}
