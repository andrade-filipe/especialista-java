import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    separator();
    inverterNumero();

    separator();
    simuladorEmprestimo();

    separator();
    ticketMedio();

    separator();
    casting();

    separator();
    casting2();

    separator();
    logicalOperators();

    separator();
    imcCalculator();
  }

  public static void separator(){
    System.out.println("---------------------------------------------");
  }

  public static void ticketMedio(){
    int valor1 = 20;
    int valor2 = 30;
    int valor3 = 100;

    System.out.println((valor1 + valor2 + valor3)/3);
  }

  public static void casting(){
    int idade1 = 30;
    int idade2 = 40;
    int idade3 = 60;

    float idadeMedia = (float) (idade1 + idade2 + idade3) / 3;

    System.out.println("Idade média: " + idadeMedia);
  }

  public static void casting2(){
    double pesoCarga1 = 1033.49;
    double pesoCarga2 = 849.88;

    int pesoTotalCargas = (int) (pesoCarga1 + pesoCarga2);

    // O resultado deve ser 1883
    System.out.println("Peso total das cargas: " + pesoTotalCargas);
  }

  public static void logicalOperators(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o ano: ");
    int ano = scanner.nextInt();

    boolean isBissexto = (ano % 400 == 0);
    boolean isAlsoBissexto = (ano % 4 == 0) && (ano % 100 != 0);

    System.out.printf("ano é bissexto?: %b ",isBissexto || isAlsoBissexto);
    System.out.println();
    scanner.close();
  }

  public static void imcCalculator(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu peso em kg: ");
    double peso = scanner.nextDouble();

    System.out.print("Digite sua altura em metros: ");
    double altura = scanner.nextDouble();

    System.out.print("[H] para Homem e [M] para Mulher");
    String genero = scanner.next();

    double imc = peso / (altura * altura);

    switch (genero) {
      case "M" -> {condicaoMulheres(imc);}
      case "H" -> {condicaoHomens(imc);}
      default -> {System.out.println("Opção inválida");}
    }
    scanner.close();
  }

  public static void simuladorEmprestimo(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = scanner.nextInt();

    double taxaJuros = switch (quantidadeParcelas){
      case 1, 2 -> 0.0199;
      case 3 -> 0.0299;
      default -> 0.0399;
    };

    double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0;

    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
    scanner.close();
  }

  public static void inverterNumero(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o numero que vc quer inverter: ");
    String numero = scanner.next();

    int i = 1;
    char[] arr = numero.toCharArray();
    StringBuilder numeroInvertido = new StringBuilder();

    while (i <= arr.length) {
      char lastChar = arr[arr.length - i];
      numeroInvertido.append(lastChar);
      i++;
    }
    System.out.println(numeroInvertido);
  }

  private static boolean isBetween(double min, double max, double number){
    return number >= min && number <= max;
  }

  private static void condicaoHomens(double imc){
    if (imc < 20.7){
      System.out.println("Abaixo do peso");
    } else if (isBetween(20.7, 26.4, imc)) {
      System.out.println("Peso Ideal");
    } else if (isBetween(26.4,27.8, imc)){
      System.out.println("Um pouco acima do peso");
    } else if (isBetween(27.8, 31.1, imc)){
      System.out.println("Acima do peso");
    } else if (imc > 31.1){
      System.out.println("Obeso");
    } else {
      System.out.println("Algo deu errado");
    }
    System.out.println("Imc = " + imc);
  }

  private static void condicaoMulheres(double imc){
    if (imc < 19.1){
      System.out.println("Abaixo do peso");
    } else if (isBetween(19.1, 25.8, imc)) {
      System.out.println("Peso Ideal");
    } else if (isBetween(25.8,27.3, imc)){
      System.out.println("Um pouco acima do peso");
    } else if (isBetween(27.3, 32.3, imc)){
      System.out.println("Acima do peso");
    } else if (imc > 32.3){
      System.out.println("Obeso");
    } else {
      System.out.println("Algo deu errado");
    }
    System.out.println("Imc = " + imc);
  }
}