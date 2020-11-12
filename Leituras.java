import java.util.Scanner; // declaro a importacao da biblioteca

/*
    Exemplo de leitra de dados via teclado
    Detalhe: 0 Scanner utiliza como idioma padrão, o idioma da máquina
*/

public class Leituras{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double valorDouble;
        int valorInteiro;
        float valorReal;
        System.out.println("Por favro, digite um numero inteiro:");
        valorInteiro = teclado.nextInt();
        System.out.println("O valor inteiro: "+ valorInteiro + " foi digitado");
        System.out.println("Por favro, digite um numero real:");
        valorReal = teclado.nextFloat();
        System.out.println("O valor real: "+ valorReal + " foi digitado");
        valorDouble = teclado.nextDouble();
        System.out.println("O valor double: "+ valorReal + " foi digitado");
    }
}