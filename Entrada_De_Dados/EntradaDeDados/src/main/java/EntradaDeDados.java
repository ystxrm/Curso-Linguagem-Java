import java.util.Scanner;

/* Para ler uma palavra (texto sem ex espaço).*/

void main(){
    Scanner sc = new Scanner(System.in);

    String x;

    x=sc.next();

System.out.println("Você digitou: " + x);

    sc.close();

    /*Para ler um número inteiro*/

    int z;

    z = sc.nextInt();

    System.out.println("Sua idade é: " + z);

    sc.close();

    /* Para ler um número com ponto flutuante*/

    double c;

    c = sc.nextDouble();

    System.out.println("O seu peso é: " + c);

    sc.close();

    /*como faz para ler um caractere*/

    char d;

    d = sc.next().charAt(0);

    System.out.println("Você digitou: " + d);

    sc.close();

    /*Como ler vários dados na mesma linha */

    String y;
    int u;
    double p;

    y = sc.next();
    u = sc.nextInt();
    p = sc.nextDouble();

    System.out.println("Dados digitados: ");
    System.out.println(y);
    System.out.println(u);
    System.out.println(p);

    sc.close();

}