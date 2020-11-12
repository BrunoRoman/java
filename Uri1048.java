import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario = teclado.nextDouble();
        double novoSalario = 0.0;
        double reajuste = 0.0;
        int percentual = 0;
        if (salario >= 0 && salario <= 400.00){
            reajuste = salario*0.15;
            novoSalario = salario+reajuste;
            percentual = 15;
        } else if (salario > 400.00 && salario <= 800.00){
            reajuste = salario*0.12;
            novoSalario = salario+reajuste;
            percentual = 12;
        } else if (salario >= 800.01 && salario <= 1200.00){
            reajuste = salario*0.1;
            novoSalario = salario+reajuste;
            percentual = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00){
            reajuste = salario*0.07;
            novoSalario = salario+reajuste;
            percentual = 7;
        } else if (salario > 2000.00){
            reajuste = salario*0.04;
            novoSalario = salario+reajuste;
            percentual = 4;
        }
        System.out.printf("Novo salario: %.2f\n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        System.out.printf("Em percentual: %d %%\n",percentual);
    }
}