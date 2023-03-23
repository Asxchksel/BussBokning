package buss_system;
import  java.util.Scanner;
public class Buss_System {
    public static Scanner keyboard = new Scanner(System.in);
    public static byte vuxenplats = 0;
    public static byte barnplats = 0;
    public static byte pensionärplats = 0;
            
    public static void main(String[] args) {
        System.out.println("Vad vill du göra?:");
        System.out.println("1. Lägg till passagerare");
        System.out.println("2. Kolla lediga platser");
        System.out.println("3. Beräkna vinst");
        System.out.println("4. Avsluta programmet");
        
        String[] fält = new String[5];
            fält[1] = "1. Lägg till passagerare";
            fält[2] = "2. Kolla lediga platser";
            fält[3] = "3. Beräkna vinst";
            fält[4] = "4. Avsluta programmet";
        
        byte menyval = keyboard.nextByte();
        
        while(menyval = 1->4){
            switch(menyval){
                case 1:
                    läggtillpassagerare();
                case 2:
                    ledigaplatser();
                case 3:
                    räknavinst();
                case 4:
                    System.out.println("Okej, Hejdå!");
                    break;
                default:  
                    System.out.println("Välj ett tal mellan 1-4");
    }}
    }
        
        static void läggtillpassagerare(){
            System.out.println("Skriv in ditt personnummer i formatet, yyyymmdd");
            int personnnummer = keyboard.nextInt();
            
        }
    
        static void ledigaplatser(){
            
        }
        
        static int räknavinst(){
            int vinst = barnplats + vuxenplats + pensionärplats;
            return vinst;
        }
        
}
