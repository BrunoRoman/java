import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        int numero = 0,quant;
        Scanner teclado = new Scanner(System.in);
        quant = teclado.nextInt();
        for (int i=1;i<=quant;i++){
            numero = teclado.nextInt();
            if (numero%2 == 0 && numero>0){
                System.out.println("EVEN POSITIVE");
            } else if (numero%2 == 0 && numero<0){
                System.out.println("EVEN NEGATIVE");
            } else if (numero%2 != 0 && numero>0){
                System.out.println("ODD POSITIVE");
            } else if (numero%2 != 0 && numero<0){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
    }
}