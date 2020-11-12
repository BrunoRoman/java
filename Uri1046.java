import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inicio,fim,horas;
        inicio = teclado.nextInt();
        fim = teclado.nextInt();
        if (inicio==fim ){
            horas = 24;
        }
        else if (inicio>fim){
            horas = (24+fim)-inicio;
        } else {
            horas = fim - inicio;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",horas);
    }
}