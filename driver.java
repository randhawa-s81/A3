import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList; 

/** ***************************************************
 *  Name:           Samarjeet Randhawa 
 *  Class:          CS30S
 * 
 *  Assignment:     Assignment 3 inheritance
 * 
 *  Description:    driver code for assignment 3 inheritance 
 * 
 *************************************************************/

public class driver {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        ArrayList <bankAccount> bank = new ArrayList<>(); 
        
        ProgrammingInfo PI = new ProgrammingInfo("A3 Inheritance"); 
        System.out.println(PI.getBanner()); 
        
        // ***** print banners *****
        
        // ***** Get Input *****

        // ***** Main Processing *****

        bankAccount ba = new bankAccount("Lewis", "Hamilton", 110000); 
        System.out.println(ba); 
        savingAccount sa = new savingAccount("Michael", "Schumacher", 123000); 
        System.out.println(sa); 
        chequingAccount ca = new chequingAccount("Aryton", "Senna", 80000); 
        System.out.println(ca);
        
        System.out.println("-----------------------"); 
    
        //adding objects to arrayList 
        bank.add(ba); 
        bank.add(sa); 
        bank.add(ca);
        
        //envoking some derived class method withdraw 
        savingAccount saving = (savingAccount)bank.get(1); 
        //withdrawing $20,000 
        saving.withdraw(20000); 
        //printing new info 
        System.out.println(sa);
        
        //apply interest method
        for(bankAccount b: bank){
            
            if( b instanceof savingAccount){
                System.out.println("Interest is: " + sa.applyInterest()); 
                System.out.println(sa); 
            }// end if 
        }// end for each 
        
        //envoking derevied class method cash cheque 
        chequingAccount cashQ = (chequingAccount)bank.get(2); 
        cashQ.cashCheque(90000); 
        
        System.out.println(ca); 
        
        //envoking some derived class method deposit
        bankAccount account = (bankAccount)bank.get(0); 
        account.deposit(20000); 
        
        //printing info 
        System.out.println(ba); 
        
        
        
        
        
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate