import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        double radio, perimetro, area;
        System.out.println("Escribe el radio: ");
        radio = circulo.nextDouble();
        perimetro = 2*Math.PI*radio;
        area = Math.PI * Math.pow(radio,2);
        System.out.println("el area es: " + area + " el perimetro es: " + perimetro);

        circulo.close();


    }
}

/* Escriba un programa que pida al usuario el radio de un circulo (double) como
entrada, luego calcule y obtenga el área y el perímetro del circulo. La formula del
area es πr2 y el perímetro es 2πr, donde r es el radio del circulo.*/