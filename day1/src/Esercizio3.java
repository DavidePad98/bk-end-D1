import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args){
        double perimentroRettangolo = perimetro(20.20, 40.40);
        System.out.println("Il perimetro del rettangolo è: " +  perimentroRettangolo);
        int numberPari = pariDispari(55);
        System.out.println(numberPari);
       // double Erone = formulaDiErone(20.45, 45.10, 25.67);
        //System.out.println("Questo è il risultato del calcolo del perimetro del triangolo secondo la formula di Erone: " + Math.sqrt(Erone) % 4);


    }
    public static double perimetro(double num1, double num2) {
        return num1 * 2 + num2 * 2;
    }
    public static int pariDispari(int num3) {
        return num3 % 2 == 0 ? 0 : 1;
    }
    public static void formulaDiErone(double[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Lato1:");
        String num4 = scanner.nextLine();
        System.out.println("lato2:");
        String num5 = scanner.nextLine();
        System.out.println("Lato3:");
        String num6 = scanner.nextLine();
        System.out.println(Math.sqrt( (num4 + num5 + num6) * ((num4 + num5 + num6) -  num4) * ((num4 + num5 + num6) - num5 ) * ( (num4 + num5 + num6) - num6 )) % 4);
        scanner.close();
    }

}
