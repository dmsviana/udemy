package application;

import classes.Pedido;
import enums.PedidoStatus;

import java.util.Date;
import java.util.Scanner;

public class MainExemploEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o estado do pedido: ");
        String estado = sc.nextLine();
        Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.valueOf(estado));
        System.out.println(pedido);
    }
}
