import java.util.Scanner;
void main(){

    Scanner sc = new Scanner(System.in);

    int x,y;
    System.out.println("Digite dois numero inteiro: ");
    x = sc.nextInt();
    y = sc.nextInt();

    if (x % y == 0 || y % x == 0){
        System.out.println("São multiplos!");
    }
    else{
        System.out.println("não sao multiplos!");
    }
    System.out.println("teste");
}