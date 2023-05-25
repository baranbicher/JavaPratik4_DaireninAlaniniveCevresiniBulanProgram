import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14, r, alan, cevre ;

        Scanner yCap = new Scanner(System.in);

        System.out.print("Yarıçapı Girin: ");
        r = yCap.nextDouble();

        //Alan Formülü : π * r * r;
        alan = pi * r * r;
        System.out.println("Dairenin Alanı: " + alan);

        //Çevre Formülü : 2 * π * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi: " + cevre);

        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        double alfa, dilimD;
        System.out.print("Açı değerini girin: ");
        alfa = yCap.nextDouble();

        dilimD = (pi * (r * r) * alfa) / 360;
        System.out.println("Yarım Daire Alanı: " + dilimD);

    }
}