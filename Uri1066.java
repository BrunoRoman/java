import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i=0;i<5;i++){
            numero = teclado.nextInt();
            if (numero%2 == 0){
                par+=1;
            }else{
                impar+=1;
            }
            if (numero>0){
                positivo+=1;
            } else if (numero<0){
                negativo+=1;
            }
        }
        System.out.printf("%d valor(es) par(es)\n",par);
        System.out.printf("%d valor(es) impar(es)\n",impar);
        System.out.printf("%d valor(es) positivo(s)\n",positivo);
        System.out.printf("%d valor(es) negativo(s)\n",negativo);
    }
}