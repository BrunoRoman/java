import java.util.Scanner;
public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A,B,C,media;
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        media = (2f*A+3f*B+5*C)/10;
        System.out.printf("MEDIA = %.1f\n",media);
    }
}