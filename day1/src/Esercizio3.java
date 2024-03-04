import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args){
        double perimentroRettangolo = perimetro(20.20, 40.40);
        System.out.println("Il perimetro del rettangolo è: " +  perimentroRettangolo);
        int numberPari = pariDispari(55);
        System.out.println(numberPari);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lato1:");
        double num4 = Double.parseDouble(scanner.nextLine());
        System.out.println("lato2:");
        double num5 = Double.parseDouble(scanner.nextLine());
        System.out.println("Lato3:");
        double num6 = Double.parseDouble(scanner.nextLine());
        System.out.println("Il risultato è: " +  (Math.sqrt( (num4 + num5 + num6) * (-num4 + num5 + num6) * (num4 - num5 + num6) * (num4 + num5 - num6)) / 4));
        scanner.close();
    }
    public static double perimetro(double num1, double num2) {
        return num1 * 2 + num2 * 2;
    }
    public static int pariDispari(int num3) {
        return num3 / 2 == 0 ? 0 : 1;
    }
}
