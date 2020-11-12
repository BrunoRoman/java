import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A,B,media;
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        media = (3.5f*A+7.5f*B)/11;
        System.out.printf("MEDIA = %.5f",media);
    }
}