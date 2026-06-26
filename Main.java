void main() {


    Scanner sc= new Scanner (system.in)

    System.out.println(CALCULADORA);
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("0 -Potencia)


            opcão= scanner.nextint
            public stack double calcularSoma
            return n1+n2


    //Entrada de dados


    // FUNÇÃO: Tem retorno (double). Recebe os dados, calcula e devolve o resultado.
    public static double fazCalculo(double v1, double v2, int op) {
        double = 0;


            // Tratamento básico para não quebrar na divisão por zero
            if (v2 != 0) {
                res = v1 / v2;
            } else {
                System.out.println("[ERRO] Não dá para dividir por zero!");
            }
        }
        return res; // Retorna o valor calculado
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        // Laço de repetição para deixar a calculadora interativa
        do {
            mostraMenu(); // Chamando o procedimento
            opcao = leitor.nextInt();

            // Condição para encerrar o programa
            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Validação para aceitar apenas as opções do menu
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida, tente de novo.");
                continue;
            }

            // Pedindo os números para o usuário
            System.out.print("Digite o primeiro valor: ");
            double valor1 = leitor.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double valor2 = leitor.nextDouble();

            // Chamando a função e guardando o retorno dela na variável
            return resultadoObtido; // Entrega o valor calculado para quem chamou a função
        }
            // Mostrando o resultado na tela
            System.out.println("O resultado é: " + resultadoFinal);

    }
}