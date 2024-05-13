import java.io.IOException;
import java.util.Scanner;

public class PrincipalConversor {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        BuscaMoeda moeda = new BuscaMoeda();
        Mensagem mensagem = new Mensagem();
        Moeda novaMoeda;
        var escolha = 0;
        double valor = 0;

        while (escolha != 7) {

            System.out.println("|*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*|\n");
            System.out.println(" - Seja bem vindo ao meu conversor de moedas - \n");
            System.out.println(
                    """
                        1 - Real(BRL) para Dolar(USD).
                        2 - Dolar(USD) para Real(BRL).
                        7 - Fechar o programa.\s
                   \s""");
            System.out.print("Escolha uma opção: ");
            escolha = leitura.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("|*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*|\n");
                    System.out.print(" Digite o valor que quer converter: ");
                    valor = leitura.nextDouble();
                    novaMoeda = moeda.BuscaMoeda("BRL","USD",valor);
                    mensagem.convertida("brl","usd",valor,novaMoeda);
                    break;
                case 2:
                    System.out.println("|*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*|\n");
                    System.out.print(" Digite o valor que quer converter: ");
                    valor = leitura.nextDouble();
                    novaMoeda = moeda.BuscaMoeda("usd","brl",valor);
                    mensagem.convertida("usd","brl",valor,novaMoeda);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Programa fechando...");
                    break;
                default:
                    System.out.println("Opção errada, tente novamente");
            }
        }

    }
}
