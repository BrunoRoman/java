import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codPec1,numPec1,codPec2,numPec2;
        double valPec1,valPec2,total;
        codPec1 =  teclado.nextInt();
        numPec1 = teclado.nextInt();
        valPec1 = teclado.nextDouble();
        codPec2 =  teclado.nextInt();
        numPec2 = teclado.nextInt();
        valPec2 = teclado.nextDouble();
        total = numPec1*valPec1+numPec2*valPec2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}