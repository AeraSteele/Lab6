/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 21 "umple.ump"
public class Order extends Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int ordernum;
  private double price;
  private String shiptime;
  private String date;
  private String getCreationDate;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aAge, String aAddress, account aAccount, order aOrder, String aFirstName, String aLastName, int aOrdernum, double aPrice, String aShiptime, String aDate, String aGetCreationDate)
  {
    super(aAge, aAddress, aAccount, aOrder, aFirstName, aLastName);
    ordernum = aOrdernum;
    price = aPrice;
    shiptime = aShiptime;
    date = aDate;
    getCreationDate = aGetCreationDate;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrdernum(int aOrdernum)
  {
    boolean wasSet = false;
    ordernum = aOrdernum;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setShiptime(String aShiptime)
  {
    boolean wasSet = false;
    shiptime = aShiptime;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(String aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setGetCreationDate(String aGetCreationDate)
  {
    boolean wasSet = false;
    getCreationDate = aGetCreationDate;
    wasSet = true;
    return wasSet;
  }

  public int getOrdernum()
  {
    return ordernum;
  }

  public double getPrice()
  {
    return price;
  }

  public String getShiptime()
  {
    return shiptime;
  }

  public String getDate()
  {
    return date;
  }

  public String getGetCreationDate()
  {
    return getCreationDate;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "ordernum" + ":" + getOrdernum()+ "," +
            "price" + ":" + getPrice()+ "," +
            "shiptime" + ":" + getShiptime()+ "," +
            "date" + ":" + getDate()+ "," +
            "getCreationDate" + ":" + getGetCreationDate()+ "]";
  }
}