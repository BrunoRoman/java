import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inicio,fim,horaini,horafim,horas,minIni, minFim,minutos;
        horaini = teclado.nextInt();
        minIni = teclado.nextInt();
        horafim = teclado.nextInt();
        minFim = teclado.nextInt();
        minutos = 0;
        horas = 0;
        inicio = horaini*60 + minIni;
        fim = horafim*60 +minFim;
        if (inicio==fim){
            horas = 24;
            minutos = 0;
        } else {
            minutos = fim-inicio;
            if (minutos < 0){
                minutos+= 24*60;
            }
            horas = minutos/60;
            minutos = minutos%60;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horas,minutos);
    }
}