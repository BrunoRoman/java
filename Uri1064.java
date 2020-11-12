import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double numero,soma=0;
        int positivo = 0;

        for (int i=0;i<6;i++){
            numero = teclado.nextDouble();
            if (numero > 0){
                positivo+=1;
                soma+=numero;
            }
        }
        System.out.printf("%d valores positivos\n",positivo);
        System.out.printf("%.1f\n",soma/positivo);
    }
}