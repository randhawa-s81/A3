/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: Assignment 3 inheritance 
 *
 * Description: programming info for A3 Inheritance 
 ***********************************************************************/

// import libraries as needed here

public class ProgrammingInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    private String assignment; 
    private String nl = System.lineSeparator();

    //*** Constructors ***
    
     /*****************************************
    * Description: Creating banner 
    * 
    * ****************************************/
    public ProgrammingInfo(String a){
        assignment = a;
    }// end constructor 
    
    //*** Getters ***
    
        /*****************************************
    * Description: get banner
    * 
    *  @return  String;  br
    *  *******************************************/ 
      
    public String getBanner(){
       String st; 
       
        st = "*****************************" + nl;
        st += "Name:        Samarjeet Randhawa" + nl;
        st += "Class:       CS30S" + nl;
        st += "Assignment:  A3 Inheritance" + nl;
        st += "*****************************" + nl + nl;
       
       return st; 
    }// end print banner 
    
    //*** Setters ***
    
    //*** special getters *** 
    
    public String getClosingMessage(){
        String closingMessage = ""; 
        
        closingMessage = "end of processing";
        return closingMessage; 
    }// end print cm
} // end of public class