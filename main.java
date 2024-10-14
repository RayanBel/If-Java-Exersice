import java.util.Scanner; 

public class Main{
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int descuento[]={25,50};
        float importeInicial, importeDescontado, importeFinal;
        int numPiezas;

        System.out.print("Introduzca el importe inicial: ");
        importeInicial=scanner.nextFloat();

        System.out.print("Introduzca el número de piezas: ");
        numPiezas=scanner.nextInt();

        importeDescontado=importeInicial*descuento[numPiezas<=3?0:1]/100;
        importeFinal=importeInicial-importeDescontado;
        System.out.println("Coste final: "+importeFinal);
    }
}
