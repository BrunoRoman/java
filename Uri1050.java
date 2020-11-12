import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opc = teclado.nextInt();
        if (opc == 61){
            System.out.println("Brasilia");
        } else if (opc == 71){
            System.out.println("Salvador");
        } else if (opc == 11){
            System.out.println("Sao Paulo");
        } else if (opc == 21){
            System.out.println("Rio de Janeiro");
        } else if (opc == 32){
            System.out.println("Juiz de Fora");
        } else if (opc == 19){
            System.out.println("Campinas");
        } else if (opc == 27){
            System.out.println("Vitoria");
        } else if (opc == 31){
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}