import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int i=1;i<=numero;i++){
            if (i%2 == 0){
                System.out.printf("%d^2 = %d\n",i,i*i);
            }
        }
    }
}