package pinkodkonzol;

import java.util.Scanner;

public class Pinkodkonzol {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pinkod = pinkod();
        kodMegadasa(pinkod);
    }

    private static int pinkod() {
        System.out.print("kód megadása: ");
        String pinkod;
        pinkod = sc.nextLine();
        while (pinkod.length() < 4 || pinkod.length() > 6) {
            System.out.println("Nem megfelelő formátum, minimum 4");
            System.out.println("maximum 6 számjegy legyen!");
            System.out.print("kód megadása: ");
            pinkod = sc.nextLine();
        }
        int kod = Integer.parseInt(pinkod);
        System.out.println("pin elmentve");

        return kod;
    }

    private static void kodMegadasa(int kod) {
        int index = 1;
        boolean joE = false;
        System.out.print("kérem a belépési kódot(1/3): ");
        int belep = sc.nextInt();
        while(!joE && index < 3)
        {    
            System.out.println("Hibás pinkód!");
            System.out.print("kérem a belépési kódot(1/3): ");
            belep = sc.nextInt();
            if (belep == kod) {
                joE = true;
            }
            
            index++;
        }
        
    }


}
