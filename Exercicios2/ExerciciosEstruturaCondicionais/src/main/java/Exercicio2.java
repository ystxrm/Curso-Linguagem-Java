import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero inteiro: ");
    int numero = sc.nextInt();

    if (numero  % 2==0){
        System.out.println("Numero par");
    }

    else{
        System.out.println("Numero impar");
    }


}