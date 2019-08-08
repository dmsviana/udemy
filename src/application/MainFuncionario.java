package application;

import classes.Funcionario;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionários serão registrados: ");
        int n = Integer.parseInt(sc.nextLine());
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario #"+(i+1));
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = Double.parseDouble(sc.nextLine());
            listaDeFuncionarios.add(new Funcionario(id, nome, salario));

        }

        System.out.print("Digite o id do funcionario que terá incremento no salario: ");
        String novoId = sc.nextLine();
        Funcionario funcionario = listaDeFuncionarios.stream().filter(lista -> lista.getId().equalsIgnoreCase(novoId)).findFirst().orElse(null);
        if (funcionario == null){
            System.out.println("O id não existe!");
        }else{
            System.out.print("Porcentagem: ");
            double por = Double.parseDouble(sc.nextLine());
            funcionario.incrementarPorcentagem(por);
        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (Funcionario funcionarios : listaDeFuncionarios){
            System.out.println(funcionarios);
        }
        sc.close();



    }
}
