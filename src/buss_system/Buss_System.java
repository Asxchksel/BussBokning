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
        meny();
        
        if(s>=22){
            System.out.println("Sista platsen är tagen!");
            räknavinst();
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
            for (int i = 1; i < sittplatser.length; i++) {
                if(sittplatser[i] == 0){
                    System.out.println(i + ": inte upptagen");
                }
                else if(sittplatser[i] != 0){
                    System.out.println(i + ": upptagen");
            }
            }
        }
        
        static double räknavinst(){
            double vinst = (barnplats*149.99) + (vuxenplats*299.99) + (pensionärplats*199.99);
            return vinst;
        }
        
        static void avbokaplats(){
            System.out.println("vad är ditt personnummer?: ");
            int personnummer = keyboard.nextInt();
            
            for (int i = 0; i < sittplatser.length; i++) {
                if(sittplatser[i] == personnummer){
                    System.out.println("Plats " + i + " avbokad");
                    sittplatser[i] = 0;
                }
            }
           
            }
        
        
        static void meny(){
        var fortsätt = true;
        
        while(fortsätt){
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
            switch(menyval){
                case 1->{
                    läggtillpassagerare();
                }
                case 2->{
                    ledigaplatser();
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
                    fortsätt = false;
                    break;
                    }
                default->{ 
                    System.out.println("Välj ett tal mellan 1-5");
                    }
    }    
        }
    }
        }
