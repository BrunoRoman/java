import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double renda,imposto;
        renda = teclado.nextDouble();
        imposto = 0;
        if (renda>=0 && renda<=2000){
            System.out.printf("Isento\n");
        } else if (renda>2000 && renda<=3000){
            renda-= 2000;
            imposto = renda*0.08;
            System.out.printf("R$ %.2f\n",imposto);
        } else if (renda>3000 && renda<=4500){
            renda-= 2000;
            imposto = 1000*0.08;
            renda-=1000;
            imposto += renda*0.18;
            System.out.printf("R$ %.2f\n",imposto);
        } else if (renda>4500){
            renda-= 2000;
            imposto = 1000*0.08;
            renda-=1000;
            imposto += 1500*0.18;
            renda-=1500;
            imposto += renda*0.28;
            System.out.printf("R$ %.2f\n",imposto);
        }
    }
}