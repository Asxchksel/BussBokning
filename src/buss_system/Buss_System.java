package buss_system;
import  java.util.Scanner;
public class Buss_System {
    public static Scanner keyboard = new Scanner(System.in);
    public static byte vuxenplats = 0;
    public static byte barnplats = 0;
    public static byte pensionärplats = 0;
            
    public static void main(String[] args) {
        System.out.println("Vad vill du göra?:");
 
        String[] fält = new String[5];
            fält[1] = "1. Lägg till passagerare";
            fält[2] = "2. Kolla lediga platser";
            fält[3] = "3. Beräkna vinst";
            fält[4] = "4. Avsluta programmet";
            
        for (int i = 0; i < 5; i++) {
            System.out.println(fält[i]);
        }
            
        byte menyval = keyboard.nextByte();
        boolean menyboolean = true;
        
        while(menyboolean == true){
            switch(menyval){
                case 1:
                    läggtillpassagerare();
                    menyboolean = false;
                case 2:
                    ledigaplatser();
                    menyboolean = false;
                case 3:
                    räknavinst();
                    menyboolean = false;
                case 4:
                    System.out.println("Okej, Hejdå!");
                    menyboolean = false;
                    break;
                default:  
                    System.out.println("Välj ett tal mellan 1-4");

    }}
    }
        
        static void läggtillpassagerare(){
            System.out.println("Skriv in ditt personnummer i formatet, yyyymmdd");
            int personnummer = keyboard.nextInt();
            if(personnummer > 20050101){
                barnplats = (byte) (barnplats +1);
            }
            if(personnummer > 19541231){
                
            }

        }
    
        static void ledigaplatser(){
            System.out.println("hej");
        }
        
        static int räknavinst(){
            int vinst = barnplats + vuxenplats + pensionärplats;
            return vinst;
        }
        
}
