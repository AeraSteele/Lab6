/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 11 "umple.ump"
public class Account extends Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int acctnum;
  private double balance;
  private double deposit;
  private double withdraw;
  private double getbalance;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(int aAge, String aAddress, account aAccount, order aOrder, String aFirstName, String aLastName, int aAcctnum, double aBalance, double aDeposit, double aWithdraw, double aGetbalance)
  {
    super(aAge, aAddress, aAccount, aOrder, aFirstName, aLastName);
    acctnum = aAcctnum;
    balance = aBalance;
    deposit = aDeposit;
    withdraw = aWithdraw;
    getbalance = aGetbalance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAcctnum(int aAcctnum)
  {
    boolean wasSet = false;
    acctnum = aAcctnum;
    wasSet = true;
    return wasSet;
  }

  public boolean setBalance(double aBalance)
  {
    boolean wasSet = false;
    balance = aBalance;
    wasSet = true;
    return wasSet;
  }

  public boolean setDeposit(double aDeposit)
  {
    boolean wasSet = false;
    deposit = aDeposit;
    wasSet = true;
    return wasSet;
  }

  public boolean setWithdraw(double aWithdraw)
  {
    boolean wasSet = false;
    withdraw = aWithdraw;
    wasSet = true;
    return wasSet;
  }

  public boolean setGetbalance(double aGetbalance)
  {
    boolean wasSet = false;
    getbalance = aGetbalance;
    wasSet = true;
    return wasSet;
  }

  public int getAcctnum()
  {
    return acctnum;
  }

  public double getBalance()
  {
    return balance;
  }

  public double getDeposit()
  {
    return deposit;
  }

  public double getWithdraw()
  {
    return withdraw;
  }

  public double getGetbalance()
  {
    return getbalance;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "acctnum" + ":" + getAcctnum()+ "," +
            "balance" + ":" + getBalance()+ "," +
            "deposit" + ":" + getDeposit()+ "," +
            "withdraw" + ":" + getWithdraw()+ "," +
            "getbalance" + ":" + getGetbalance()+ "]";
  }
}