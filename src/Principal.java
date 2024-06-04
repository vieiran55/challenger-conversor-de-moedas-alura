import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String moeda = "";

        String menu = """
                \nSeja bem-vindo/a ao Conversor de Moeda =]
                                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileiro
                4) Real brasileiro => Dólar 
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Dólar => Libra
                8) Libra => Dólar
                9) Sair
                """;

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        int escolha = 0;

        while (escolha != 9) {
            System.out.println("\n****************************************************");
            System.out.println(menu);
            System.out.print("\nEscolha uma opção válida: ");
            escolha = leitura.nextInt();

            if (escolha != 9) {
                System.out.print("\nDigite o valor que deseja converter (ex: 12,00): ");
                while (!leitura.hasNextDouble()) {
                    System.out.println("Valor inválido. Por favor, digite um número.");
                    leitura.next();
                }
                double valor = leitura.nextDouble();

                Moedas novaMoeda = null;
                switch (escolha) {
                    case 1:
                        moeda = "USD";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.dolarToARS(valor, novaMoeda.getARS()));
                        break;
                    case 2:
                        moeda = "ARS";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.arsToDolar(valor, novaMoeda.getUSD()));
                        break;
                    case 3:
                        moeda = "USD";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.dolarToBRL(valor, novaMoeda.getBRL()));
                        break;
                    case 4:
                        moeda = "BRL";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.brlToDolar(valor, novaMoeda.getUSD()));
                        break;
                    case 5:
                        moeda = "USD";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.dolarToCOP(valor, novaMoeda.getCOP()));
                        break;
                    case 6:
                        moeda = "COP";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.copToDolar(valor, novaMoeda.getUSD()));
                        break;
                    case 7:
                        moeda = "USD";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.dolarToGBP(valor, novaMoeda.getGBP()));
                        break;
                    case 8:
                        moeda = "GBP";
                        novaMoeda = consultaMoeda.buscaMoeda(moeda);
                        System.out.printf("\nO valor convertido é $%.2f%n", novaMoeda.gbpToDolar(valor, novaMoeda.getUSD()));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } else {
                System.out.println("Saindo...");
            }
        }
    }
}
