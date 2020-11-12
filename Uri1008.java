import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero,horas;
        double valor,salary;
        numero = teclado.nextInt();
        horas = teclado.nextInt();
        valor = teclado.nextFloat();
        salary = horas*valor;
        
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}