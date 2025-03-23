package atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        int op;

        do {
            System.out.println("\nBem-vindo ao sistema de Pessoas!");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("2 - Editar dados de uma pessoa cadastrada");
            System.out.println("3 - Apresentar dados de uma pessoa");
            System.out.println("4 - Excluir dados de uma pessoa cadastrada");
            System.out.println("5 - Sair");

                op = scanner.nextInt();
                scanner.nextLine();

        
                switch (op) {
                    case 1: 
                        System.out.println("Digite o nome: ");
                        pessoa.setNome(scanner.nextLine());
        
                        System.out.println("Digite o idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        scanner.nextLine();
        
                        System.out.println("Digite o email: ");
                        pessoa.setEmail(scanner.nextLine());
                    
                        break;

                    case 2: 
                        System.out.println("Digite o novo nome: ");
                        pessoa.setNome(scanner.nextLine());
    
                        System.out.println("Digite a nova idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        scanner.nextLine();
    
                        System.out.println("Digite o novo email: ");
                        pessoa.setEmail(scanner.nextLine());
                   
                        break;

                    case 3: 
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("Email: " + pessoa.getEmail());

                        break;

                    case 4: 
                        pessoa = new Pessoa();
                        System.out.println("Cadastro deletado");

                        break;

                    case 5: 
                        System.out.println("Você saiu do Programa");
                        break;

                    default: 
                        System.out.println("Opção inválida");
                        break;

                }
            } while (op != 5);

        scanner.close();
    }
}
