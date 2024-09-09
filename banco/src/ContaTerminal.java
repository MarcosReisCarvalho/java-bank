import java.util.Scanner;

public class ContaTerminal {

    static int numeroAgencia;
    static String agencia;
    static String nomeCliente;
    static Double saldo;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("------Java Bank-------");
            System.out.println("Bem vindo ao seu banco");
            System.out.println("forneça as informações");
            
            System.out.println("Número da Agência: ");
            numeroAgencia = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Agência: ");
            agencia = sc.nextLine();
            
            System.out.println("Nome Completo: ");
            nomeCliente = sc.nextLine();
            
            System.out.println("Saldo: ");
            saldo = sc.nextDouble();
            
            System.out.println(concatenacaoInformacoes());
        }
    }

    public static String concatenacaoInformacoes() {
        return numeroAgencia + " " + agencia + " " + nomeCliente + " " + saldo;
    }

}