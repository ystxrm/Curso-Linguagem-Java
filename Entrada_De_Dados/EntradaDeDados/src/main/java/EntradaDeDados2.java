import java.util.Scanner;
void main () {
/* Para ler um texto ATÉ A QUEBRA DE LINHA*/
    Scanner sc = new Scanner (System.in);

    String s1,s2,s3;

    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("Dados Digitados: ");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();

    /*ATEÇÃO: quebra de linha pendente*/

    int x;
    String s4,s5,s6;
    x =  sc.nextInt();
    s4 = sc.nextLine();
    s5 = sc.nextLine();
    s6 = sc.nextLine();

    System.out.println("DADOS DIGITADOS: ");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    /*Quando usamos um comando de leitura diferenten do nextLine() e dá  alguma quebra de linha,
    * essa quebra de linha fica "pendente" na entrada padrão.
    * Solução:
    * Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.*/
}