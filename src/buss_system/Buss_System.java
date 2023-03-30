package buss_system;
import  java.util.Scanner;
public class Buss_System {
    public static Scanner keyboard = new Scanner(System.in);
    public static byte vuxenplats = 2;
    public static byte barnplats = 3;
    public static byte pensionärplats = 0;
    public static int[] sittplatser= new int[22];
    public static byte s = 1;
    public static void main(String[] args) {
        System.out.println("Vad vill du göra?:");
 
        String[] fält = new String[6];
            fält[1] = "1. Lägg till passagerare";
            fält[2] = "2. Kolla lediga platser";
            fält[3] = "3. Beräkna vinst";
            fält[4] = "4. Avboka Plats";
            fält[5] = "5. Avsluta programmet";
            
        for (int i = 1; i < 6; i++) {
            System.out.println(fält[i]);
        }
        byte menyval = keyboard.nextByte();
        while(menyval != 4){
        boolean menyboolean = true;
        while(menyboolean == true){
            switch(menyval){
                case 1->{
                    menyboolean = false;
                    läggtillpassagerare();
                }
                case 2->{
                    menyboolean = false;
                    ledigaplatser();
                    }
                case 3->{
                    menyboolean = false;
                    räknavinst();
                    double vinst = räknavinst();
                    System.out.println("Din vinst är" + vinst + "kr");
                    }
                case 4->{
                    menyboolean = false;
                    avbokaplats();
                    }
                case 5->{
                    System.out.println("Hejdå!");
                    break;
                    }
                default->{ 
                    System.out.println("Välj ett tal mellan 1-5");
                    }
    }}}
    }
        
        static void läggtillpassagerare(){
            System.out.println("Skriv in ditt personnummer i formatet, yyyymmdd");
            int personnummer = keyboard.nextInt();
            if(personnummer > 20050101){
                sittplatser[s] = personnummer;
                s++;
                barnplats = (byte)(barnplats +1);
            }
            if(personnummer > 19541231){
                sittplatser[s] = personnummer;
                s++;
                vuxenplats = (byte)(vuxenplats +1);
            }
            else{
                sittplatser[s] = personnummer;
                s++;
                pensionärplats =(byte)(pensionärplats +1);
            }

        }
    
        static void ledigaplatser(){
            System.out.println("hej");
        }
        
        static double räknavinst(){
            double vinst = (barnplats*149.99) + (vuxenplats*299.99) + (pensionärplats*199.99);
            return vinst;
        }
        
        static void avbokaplats(){
            System.out.println("nej");
        }
        
}
