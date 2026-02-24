void main () {

    int a, b;

    double resutado;

    a= 5;

    b= 2;

    resutado = a / b;

    System.out.println(resutado);

    /* Essa parte do codigo da errado,pois as variaveis são do tipo inteiro.
    * quando escrevemos a expressão como a de cima A dividido por B, o copilador do Java
    * vai entender que esta querendo dividir o número inteiro por outro número inteiro*/




    resutado = (double) a / b;

    System.out.println(resutado);

    /* Apenas colocando o "double" apos o igual que ira dar certo*/

}