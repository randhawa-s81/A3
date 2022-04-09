import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList; 

/** ***************************************************
 *  Name:           Samarjeet Randhawa 
 *  Class:          CS30S
 * 
 *  Assignment:     Assignment 3 
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

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Samarjeet Randhawa " + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A3 inheritance" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Main Processing *****

        bankAccount ba = new bankAccount("Lewis", "Hamilton", 110000); 
        savingAccount sa = new savingAccount("Michael", "Schumacher", 123000); 
        chequingAccount ca = new chequingAccount("Aryton", "Senna", 80000); 

    
        //adding objects to arrayList 
        bank.add(ba); 
        bank.add(sa); 
        bank.add(ca);

        for(bankAccount p: bank){
            System.out.println(p.toString()); 
        }

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate