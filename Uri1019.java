import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N,h,m,s;
        N = teclado.nextInt();
        h = N/3600;
        m = (N%3600)/60;
        s = (N%3600)%60;
        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}