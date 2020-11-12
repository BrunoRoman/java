import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        int numero = 0,total;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        total = numero+11;
        for (int i=numero;i<=total;i++){
            if (i%2 == 1){
                System.out.println(i);
            }
        }
    }
}