import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);
    int Id, HorasTrabalhadas;
    double ValorHora, Salario;

    System.out.println("Informe o Id: ");
    Id = sc.nextInt();

    System.out.println("Informe as Horas Trabalhadas: ");
    HorasTrabalhadas = sc.nextInt();

    System.out.println("Informe o valor da hora: ");
    ValorHora = sc.nextDouble();

    Salario = HorasTrabalhadas * ValorHora;

    System.out.printf("O salario do trabalhador Id: %d é de R$ %.2f%n", Id, Salario);

    sc.close();
}