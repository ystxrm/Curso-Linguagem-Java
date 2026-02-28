import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int hora;

    System.out.println("Quantas horas? ");
    hora = sc.nextInt();

    if (hora >=6 && hora < 12) {
        System.out.println("Bom dia!");
    }
    else {
        if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        }
         else {
            if (hora >= 18 && hora < 24) {
                System.out.println("Boa noite!");
                }

                else{
    System.out.println("Boa madrugada!");

            }
        }
    }
    sc.close();
}