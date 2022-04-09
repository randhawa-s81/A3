/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: A3 inheritance 
 *
 * Description: 
 ***********************************************************************/

// import libraries as needed here

public class bankAccount {
    //*** Class Variables ***

    //*** Instance Variables ***

    protected int id; 
    protected static int nextId = 100; 
    protected double currentBalance = 0.0; 
    protected String firstName; 
    protected String lastName; 

    //*** Constructors ***

    public bankAccount(){
        id = nextId++;  
        firstName = "unknown";
        lastName = "unknown"; 
        currentBalance = 0.0;
    }//end no-arg constructor 

    public bankAccount(String fn, String ln, double cb){
        id = nextId++;  
        this.firstName = fn; 
        this.lastName = ln;
        this.currentBalance = cb;
    }// end full-arg constructor 

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
    /*****************************************
     * Description: get first Name of account holder 
     * 
     * Interface:
     * 
     * @return       first name 
     * ****************************************/
    public String getFirstName(){
        return firstName; 
    }// end get firstName 

    /*****************************************
     * Description: get last Name of account holder  
     * 
     * Interface:
     * 
     * @return       last name 
     * ****************************************/
    public String getLastName(){
        return lastName; 
    }//end get last name 

    /*****************************************
     * Description: get current balance of bank account 
     * 
     * Interface:
     * 
     * @return       current balance  
     * ****************************************/
    public double getCurrentBalance(){
        return currentBalance; 
    }// end get current balance 

    /*****************************************
     * Description: get ID of object  
     * 
     * Interface:
     * 
     * @return      nextId
     * ****************************************/
    public int getId(){
        return id; 
    }// end getId

    //*** Setters ***

    /*****************************************
     * Description: set first name 
     * 
     * Interface:
     * 
     * @param         String fn
     * ****************************************/
    public void setFirstName(String fn){
        this.firstName = fn;
    }// end set first name 

    /*****************************************
     * Description: set last name 
     * 
     * Interface:
     * 
     * @param         String ln
     * ****************************************/
    public void setLastName(String ln){
        this.lastName = ln;
    }// end set last name 

    /*****************************************
     * Description: set current balance  
     * 
     * Interface:
     * 
     * @param         double b 
     * ****************************************/
    public void setCurrentBalance(double b){
        this.currentBalance = b; 
    }// end set current balance 

    //other methods // 

    @Override 
    public String toString(){
        String st; 

        st = getFirstName() + ", " + getLastName()+ ", " +getId()+", "+ getCurrentBalance();
        return st;
    }// end toString 

    public String getInfo(){
        String st; 
    
        st = getLastName() +" " + getFirstName() + "," + getId() + "balance: " + getCurrentBalance();
        return st; 
    }// end get info

    public double deposit(double d){
        this.currentBalance += d; 
        //double amount = 0.0; 
        //currentBalance += amount; 
        return this.currentBalance;  
    }// end deposit
} // end of public class