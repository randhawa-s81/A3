/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: A3 inheritance
 *
 * Description: chequing account derived class of bankAccount 
 ***********************************************************************/

// import libraries as needed here

public class chequingAccount extends bankAccount{
    //*** Class Variables ***

    //*** Instance Variables ***

    private final double fee = 1.5; 

    //*** Constructors ***

    public chequingAccount (){

    }// end no arg 
    
    public chequingAccount(String fn, String ln, double cb){
        super(fn, ln, cb); 
    }//full arg 

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
    
    //cash cheque method 
    public double cashCheque(double cc){
        if(cc > this.currentBalance){
            currentBalance -= cc - fee - 15; 
            System.out.println("You are in overdraft"); 
        }// end if
        else{
            currentBalance -= cc - fee; 
        }// end else 
        return this.currentBalance; 
    
    }// end cash cheque 
    

} // end of public class
