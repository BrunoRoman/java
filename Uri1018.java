import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int not,resto,N;
        N = teclado.nextInt();
        System.out.printf("%d\n",N);
        not =  N/100;
        resto = N%100;
        System.out.printf("%d nota(s) de R$ 100,00\n",not);
        not =  resto/50;
        resto = resto%50;
        System.out.printf("%d nota(s) de R$ 50,00\n",not) ;       
        not =  resto/20;
        resto = resto%20;
        System.out.printf("%d nota(s) de R$ 20,00\n",not)  ;      
        not =  resto/10;
        resto = resto%10;
        System.out.printf("%d nota(s) de R$ 10,00\n",not);
        not =  resto/5;
        resto = resto%5;
        System.out.printf("%d nota(s) de R$ 5,00\n",not);
        not =  resto/2;
        resto = resto%2;
        System.out.printf("%d nota(s) de R$ 2,00\n",not); 
        System.out.printf("%d nota(s) de R$ 1,00\n",resto); 
    }
}