import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int par = 0;

        for (int i=0;i<5;i++){
            numero = teclado.nextInt();
            if (numero%2 == 0){
                par+=1;
            }
        }
        System.out.printf("%d valores pares\n",par);
    }
}