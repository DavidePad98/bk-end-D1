import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        int risultato = somma(5,5);
        System.out.println("La somma della moltiplicazione è: " + risultato);
        System.out.println(concat(5, "Oggi siamo in:"));
        System.out.println(Arrays.toString(arrayDiStringhe("uno", "due", "tre", "quattro", "cinque")));
    }
    public static int somma(int num1, int num2){
        return num1 * num2;
    }
    public static String concat(int num3, String str){
        return str + " " + num3;
    }
    public static String[] arrayDiStringhe(String str1,String str2,String str3,String str4,String str5){
        return new String[]{str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5};
    }
}
