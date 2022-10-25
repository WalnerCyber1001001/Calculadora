import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("    CALCULADORA    ");
        System.out.println("===================");

        System.out.println("Digite um numero");
        System.out.print("Primeiro numero: ");
        Scanner numerosDoUsuario = new Scanner(System.in);  // Create a Scanner object
        long numeroUm = numerosDoUsuario.nextLong(); // Read user input

        System.out.print("Digite outro numero: ");
        long numeroDois = numerosDoUsuario.nextLong();

        System.out.println("Você quer somar, subtrair, dividir, ou multiplicar?");

        Scanner usuario = new Scanner(System.in);
        String ssdm = usuario.nextLine();

        // SOMA
        if(ssdm.equals("somar")) {
            System.out.println("A soma entre " + numeroUm + " e " + numeroDois + " é: " + (numeroUm + numeroDois));
        }

        // SUBTRAIR
        else if(ssdm.equals("subtrair")) {
            System.out.println(numeroDois + " subtraido de " + numeroUm + " é: " + (numeroUm - numeroDois));
        }

        // DIVIDIR
        else if(ssdm.equals("dividir")) {
            System.out.println("A divisão de " + numeroUm + " por " + numeroDois + " é: " + (numeroUm / numeroDois));
        }

        // MULTIPLICAR
        else if(ssdm.equals("multiplicar")) {
            System.out.println(numeroUm + " multiplicado por " + numeroDois + " é: " + (numeroUm * numeroDois));
        }

        // ERRO
        else {
            System.out.println("Fim do aplicativo");
        }
    }
}