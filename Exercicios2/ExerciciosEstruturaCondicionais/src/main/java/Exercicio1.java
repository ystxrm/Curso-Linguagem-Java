import java.util.Scanner;
void main (){
    Scanner sc = new Scanner(System.in);
    int entrada;

    System.out.println("Digite um numero: ");
    entrada = sc.nextInt();

    if (entrada >= 0 ){
        System.out.println("Não negativo!");
    }
    else{
        System.out.println("Negativo!");
    }


}