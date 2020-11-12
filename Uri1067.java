import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int i=1;i<=numero;i+=2){
            System.out.println(i);
        }
    }
}