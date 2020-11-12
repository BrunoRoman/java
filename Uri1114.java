import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        int senha = 0;
        Scanner teclado = new Scanner(System.in);
        senha = teclado.nextInt();
        while (senha!=2002){
            System.out.println("Senha Invalida");
            senha = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}