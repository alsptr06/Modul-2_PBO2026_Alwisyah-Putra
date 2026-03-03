//Soal 2: Konversi Suhu Presisi

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=================================");
        System.out.println("MESIN KONVERSI SUHU PRESISI");
        System.out.println("=================================");
        Scanner input = new Scanner(System.in);

        double celsius;
        System.out.print("masukan suhu celsius : ");
        celsius = input.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("Suhu fahrenheit adalah %.2f", fahrenheit);
        input.close();
    }
}
