package buss_system;

import java.util.Scanner;

public class Buss_System {

    //public värden så att alla metoder kan komma åt infon
    public static Scanner keyboard = new Scanner(System.in);
    public static byte vuxenplats = 0;
    public static byte barnplats = 0;
    public static byte pensionärplats = 0;
    public static int[] sittplatser = new int[22];
    public static byte sittplats = 1;

    public static void main(String[] args) {
        System.out.println("Vad vill du göra?:");// simpel main för att ha allting i seprata metoder
        meny();

    }

    static void läggtillpassagerare() {
        if (sittplats >= 22) {
            System.out.println("Alla platser tagna!");
            meny();
        }//om antalet sittplatser som har getts ut är 21 så kan man inte få nya 
        System.out.println("Skriv in ditt personnummer i formatet, yyyymmdd");
        int personnummer = keyboard.nextInt();
        if (personnummer > 20050101){
            sittplatser[sittplats] = personnummer;
            System.out.println("Du har plats " + sittplats);
            sittplats++;
            barnplats = (byte) (barnplats + 1);
        } else if (personnummer > 19541231) {
            sittplatser[sittplats] = personnummer;
            System.out.println("Du har plats " + sittplats);
            sittplats++;
            vuxenplats = (byte) (vuxenplats + 1);
        } else {
            sittplatser[sittplats] = personnummer;
            System.out.println("Du har plats " + sittplats);
            sittplats++;
            pensionärplats = (byte) (pensionärplats + 1);
        }

    }

    static void ledigaplatser() {
        for (int i = 1; i < sittplatser.length; i++) {
            if (i % 4 == 0 || (i-1) % 4 == 0){
                if (sittplatser[i] == 0) { //skriver ut om vilka platser som är tagna eller inte tagna baserat på om värdet av fältnummret är 0 eller inte, även om det är fönster plats eller inte
                    System.out.println(i + ": inte upptagen, fönsterplats");
                } 
                else if (sittplatser[i] != 0) {
                    System.out.println(i + ": upptagen, fönsterplats");
                }
            }
            else{
                    if (sittplatser[i] == 0) { 
                    System.out.println(i + ": inte upptagen, fönsterplats");
            } else if (sittplatser[i] != 0) {
                    System.out.println(i + ": upptagen, fönsterplats");
            }
            }
    }}

    static double räknavinst() { //då varje gång en plats läggs till så ger den en plats typ också så måste det endast gångra antalet plats typer med värdet
        double vinst = (barnplats * 149.99) + (vuxenplats * 299.99) + (pensionärplats * 199.99);
        return vinst;
    }

    static void avbokaplats() { // här hittar man platsen som perosnen har genom att jämföra personnummer med fältets värden och sen tar bort det personnummret om det är rätt
        System.out.println("vad är ditt personnummer?: ");
        int personnummer = keyboard.nextInt();

        for (int i = 0; i < sittplatser.length; i++) {
            if (sittplatser[i] == personnummer) {
                System.out.println("Plats " + i + " avbokad");
                sittplatser[i] = 0;
            }
        }

    }

    static void hittaplats() { // ganska samma till avboka bara att man endast säger vilken plats personen har
        System.out.println("vad är ditt personnummer?: ");
        int personnummer = keyboard.nextInt();
        for (int i = 0; i < sittplatser.length; i++) {
            if (sittplatser[i] == personnummer) {
                System.out.println("Din plats är plats " + i);
            }
        }
    }

    static void under18() {
         
    }

    static void meny() {
        var fortsätt = true;

        while (fortsätt) { // while loop så man kan köra menyn för alltid, där alla metoder kan köras
            String[] fält = new String[8];
            fält[1] = "1. Lägg till passagerare";
            fält[2] = "2. Kolla lediga platser";
            fält[3] = "3. Beräkna vinst";
            fält[4] = "4. Avboka Plats";
            fält[5] = "5. Hitta bokning";
            fält[6] = "6. Hitta person under 18";
            fält[7] = "7. Avsluta programmet";

            for (int i = 1; i < 8; i++) {
                System.out.println(fält[i]);
            }

            byte menyval = keyboard.nextByte();
            switch (menyval) {
                case 1 -> {
                    läggtillpassagerare();
                }
                case 2 -> {
                    ledigaplatser();
                }
                case 3 -> {
                    räknavinst();
                    double vinst = räknavinst();
                    System.out.println("Din vinst är" + vinst + "kr");
                }
                case 4 -> {
                    avbokaplats();
                    System.out.println("Din plats är avbokad!");
                }
                case 5 -> {
                    hittaplats();
                }
                case 6 -> {
                    under18();
                }
                case 7 -> {
                    fortsätt = false;
                    break;
                }
                default -> {
                    System.out.println("Välj ett tal mellan 1-7");
                }
            }
        }
    }
}