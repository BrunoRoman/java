import java.util.Scanner;
import java.lang.Math;
public class Uri1021{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int notas,moeda,resto;
        double N;
        double valorNota[] = {100.00,50.00,20.00,10.00,5.00,2.00};
        double valorMoeda[] = {1.00,0.50,0.25,0.10,0.05,0.01};
        N = teclado.nextDouble();
        notas = (int) N;
        moeda = (int)((N%1)*100);
        System.out.printf("NOTAS:\n");
        resto = notas;
        for (int i=0;i<6;i++){
            notas = resto/(int)valorNota[i];
            resto = resto%(int)valorNota[i];
            System.out.printf("%d nota(s) de R$ %.2f\n",notas,valorNota[i]);
        }
        moeda+=resto*100;
        resto = moeda;
        System.out.printf("MOEDAS:\n");
        for (int i=0;i<6;i++){
            moeda = resto/(int)(100*valorMoeda[i]);
            resto = resto%(int)(100*valorMoeda[i]);
            System.out.printf("%d moeda(s) de R$ %.2f\n",moeda,valorMoeda[i]);
        }
    }
}


