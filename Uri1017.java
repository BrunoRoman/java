import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horas,vel;
        float gasto,distancia;
        horas =  teclado.nextInt();
        vel = teclado.nextInt();
        distancia = horas*vel;
        gasto = distancia/12.0f;
        System.out.printf("%.3f\n",gasto);
    }
}