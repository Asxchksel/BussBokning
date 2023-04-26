package buss_system;
import  java.util.Scanner;
public class Buss_System {
    public static Scanner keyboard = new Scanner(System.in);
    public static byte vuxenplats = 0;
    public static byte barnplats = 0;
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
        meny(menyval);
        
        if(s>=22){
            System.out.println("Sista platsen är tagen!");
        }
     
    }
        
        static void läggtillpassagerare(){
            System.out.println("Skriv in ditt personnummer i formatet, yyyymmdd");
            int personnummer = keyboard.nextInt();
            if(personnummer > 20050101){
                sittplatser[s] = personnummer;
                System.out.println("Du har plats " + s);
                s++;
                barnplats = (byte)(barnplats +1);
            }
            else if(personnummer > 19541231){
                sittplatser[s] = personnummer;
                System.out.println("Du har plats " + s);
                s++;
                vuxenplats = (byte)(vuxenplats +1);
            }
            else{
                sittplatser[s] = personnummer;
                System.out.println("Du har plats " + s);
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
            System.out.println("vad är ditt personnummer?: ");
            int personnummer = keyboard.nextInt();
            
           
            }
        
        
        static void meny(byte menyval){
        var fortsätt = true;
        while(fortsätt){
            switch(menyval){
                case 1->{
                    läggtillpassagerare();
                    fortsätt = false;
                }
                case 2->{
                    ledigaplatser();
                    fortsätt = false;
                    }
                case 3->{
                    räknavinst();
                    double vinst = räknavinst();
                    System.out.println("Din vinst är" + vinst + "kr");
                    }
                case 4->{
                    avbokaplats();
                    System.out.println("Din plats är avbokad!");
                    }
                case 5->{
                    break;
                    }
                default->{ 
                    System.out.println("Välj ett tal mellan 1-5");
                    }
    }
            keyboard.nextLine();
            System.out.println("Vill du göra något mer? ja/nej");
                String val = keyboard.nextLine();
                if(val.equalsIgnoreCase("ja")){
                    fortsätt = true;
                    
                if(val.equalsIgnoreCase("nej")){
                    System.out.println("Okej, Hejdå!");
                   fortsätt = false;
                }    
        }
    }
        }
                
        
}
