import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double numero;
        int positivo = 0;

        for (int i=0;i<6;i++){
            numero = teclado.nextDouble();
            if (numero > 0){
                positivo+=1;
            }
        }
        System.out.printf("%d valores positivos\n",positivo);
    }
}