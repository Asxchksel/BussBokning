package buss_system;
import  java.util.Scanner;
public class Buss_System {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vad vill du göra?:");
        System.out.println("1. Lägg till passagerare");
        System.out.println("2. Kolla lediga platser");
        System.out.println("3. Beräkna vinst");
        System.out.println("4. Avsluta programmet");
        try{
        byte menyval = keyboard.nextByte();
        }
        catch(Exception e){
            System.out.println("Du får bara skriva ett nummer 1-4");
        }
        if(menyval == 1){
         
        }
    }
    
}
