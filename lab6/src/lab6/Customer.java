/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "umple.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private int age;
  private String address;
  private account Account;
  private order Order;
  private String firstName;
  private String lastName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(int aAge, String aAddress, account aAccount, order aOrder, String aFirstName, String aLastName)
  {
    age = aAge;
    address = aAddress;
    Account = aAccount;
    Order = aOrder;
    firstName = aFirstName;
    lastName = aLastName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccount(account aAccount)
  {
    boolean wasSet = false;
    Account = aAccount;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrder(order aOrder)
  {
    boolean wasSet = false;
    Order = aOrder;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstName(String aFirstName)
  {
    boolean wasSet = false;
    firstName = aFirstName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastName(String aLastName)
  {
    boolean wasSet = false;
    lastName = aLastName;
    wasSet = true;
    return wasSet;
  }

  public int getAge()
  {
    return age;
  }

  public String getAddress()
  {
    return address;
  }

  public account getAccount()
  {
    return Account;
  }

  public order getOrder()
  {
    return Order;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "age" + ":" + getAge()+ "," +
            "address" + ":" + getAddress()+ "," +
            "firstName" + ":" + getFirstName()+ "," +
            "lastName" + ":" + getLastName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "Account" + "=" + (getAccount() != null ? !getAccount().equals(this)  ? getAccount().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "Order" + "=" + (getOrder() != null ? !getOrder().equals(this)  ? getOrder().toString().replaceAll("  ","    ") : "this" : "null");
  }
}