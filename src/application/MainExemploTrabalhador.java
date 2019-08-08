package application;

import classes.Departamento;
import classes.TempoContrato;
import classes.Trabalhador;
import enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainExemploTrabalhador {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do departamento: ");
        String nomeDoDepartamento = sc.nextLine();
        Departamento departamento = new Departamento(nomeDoDepartamento);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = sc.nextLine();
        System.out.print("Nivel do trabalhador: ");
        String nivel = sc.nextLine();
        NivelTrabalhador nivelTrabalhador = NivelTrabalhador.valueOf(nivel); //CONVERTE UMA STRING PARA UM ENUM, PARA QUE ASSIM SEJA POSSIVEL INSTANCIAR UM TRABALHADOR COM O NIVEL DESEJADO.
        System.out.print("Salário base: ");
        double salarioBase = Double.parseDouble(sc.nextLine());
        Trabalhador trabalhador = new Trabalhador(nomeDoTrabalhador, nivelTrabalhador, salarioBase, departamento);

        System.out.print("Quantos contratos esse trabalhador possui: ");
        int quantidadeDeContratos = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= quantidadeDeContratos; i++){
            System.out.println("Dados do contrato #"+i+": ");
            System.out.println("Data (dd/MM/yyyy): ");
            Date dataDeContrato = sdf.parse(sc.nextLine()); //FORMATA A DATA INSERIDA ANTERIORMENTE.
            System.out.print("Valor por hora: ");
            double valorPorHora = Double.parseDouble(sc.nextLine());
            System.out.print("Duração (horas): ");
            int horas = Integer.parseInt(sc.nextLine());
            TempoContrato contrato = new TempoContrato(dataDeContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato); //EXECUTA A AÇÃO DE ADICIONAR UM CONTRATO AO TRABALHADOR NO ARRAYLIST DESCRITO NA CLASSE TRABALHADOR.
        }
        System.out.println();
        System.out.print("Entre com o mês e o ano para calcular o salário (MM/yyyy): ");
        String mesAndAno = sc.nextLine();
        int mes = Integer.parseInt(mesAndAno.substring(0,2)); //CONVERSÃO MANUAL DO MES INSERIDO.
        int ano = Integer.parseInt(mesAndAno.substring(3)); //CONVERSÃO MANUAL DO ANO INSERIDO.
        System.out.println("Nome: "+trabalhador.getNome());
        System.out.println("Departamento: "+ trabalhador.getDepartamento().getNome());
        System.out.printf("Renda durante o tempo "+mesAndAno + ": "+ String.format("%.2f", trabalhador.renda(mes, ano)));

        sc.close();
    }
}
