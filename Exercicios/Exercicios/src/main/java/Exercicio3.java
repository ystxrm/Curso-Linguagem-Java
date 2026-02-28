import  java.util.Scanner;

void main(){
    //Exercício 03
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e
mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).*/

    Scanner sc = new Scanner(System.in);

    double A, B, C , D , Diferencia;
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    D = sc.nextDouble();

    Diferencia = A * B - C * D;

    System.out.println("Diferença = " + Diferencia);

}