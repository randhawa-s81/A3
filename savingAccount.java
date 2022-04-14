/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: A3 inheritance savings derivded class
 *
 * Description: savings derived bank account class  
 ***********************************************************************/

// import libraries as needed here

public class savingAccount extends bankAccount {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
        private final double Interest = 0.02; 
    
    //*** Constructors ***
    
    public savingAccount(){
         
    }// end no-arg constructor 
    
    public savingAccount(String fn, String ln, double cb){
        super(fn, ln, cb); 
    }//end full-arg cinstructor 
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    
    //*** Setters ***
    
    //*** other methods *** 
    
    //withdraw method 
    public double withdraw(double w){
        if(this.currentBalance < w){
            System.out.println("insufficent balance, cannot proceed with transaction");
        }// end if 
        else{
        this.currentBalance -= w; 
    }// end else
    return this.currentBalance; 
    }// end withdraw method
    
    //apply interest method 
    public void applyInterest(){
        double a;
        a = this.currentBalance * Interest; 
        currentBalance += a; 
    }// end apply interest method 
    
    
    // void applyInterest1(double a){
    //    this.currentBalance = a * Interest;   
    //}// end apply interest method 
        
} // end of public class
