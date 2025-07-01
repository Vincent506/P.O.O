package view;

import java.util.Scanner;

import model.Client;

public class EntradaDados {
    
    public static Client createClient(Scanner input){
        System.out.println("Digite o seu nome");
        String name = input.nextLine();
        System.out.println("Digite o saldo inicial da conta");
        double value = input.nextDouble();
        input.nextLine();
        return new Client(name,value);
    }
}
