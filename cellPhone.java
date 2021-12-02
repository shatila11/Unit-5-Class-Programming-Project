public class cellPhone


{


  //Instance data
  private String name;
  private String brand;
  private int yearModel;
  private int battery;
  private int appCount;

 
  //Constructor -- Has Variables
  public cellPhone(String n, String c, int m, int b, int a)
  //Paramaters for my Constructor
  {
    setName(n);
    setBrand(c);
    setYearModel(m);
    setBattery(b);
    setAppCount(a);
  }




//Creating a Default Constructor 
public cellPhone()
{
  this("The Phone Name was not Provided","The Brand Name Was not Provided",2021,100, 0);
}

 //Accesor Methods
 public String getName()
 {
   return name;
 }
 public String getBrand()
 {
   return brand;
 }
 public int getYearModel()
 {
   return yearModel;
 }
 public int getBattery()
 {
   return battery;
 }
  public int getAppCount()
 {
   return appCount;
 }
 //Mutator Methods
 public void setName(String s)
 {
name=s;
 }
  public void setBrand(String u)
 {
brand=u;
 }
  public void setYearModel(int q)
 {
yearModel=q;
 }
  public void setBattery(int e)
 {
battery=e;
 }
  public void setAppCount(int w)
 {
appCount=w;
 }


 //Other Methods

 //Checking if the two phones are the same brand
public boolean equals(cellPhone u)
{
  if (this.getBrand().equals(u.getBrand()))
  {
return true;
  }
  else
  {
    return false;
  }
}





//My Return
  public String toString()
  {
    String str = "";
    str = "Phone Name: " + name + " \nBrand: " + brand + "\nModel Year: " + yearModel;
    str = str + "\nBattery Percentage: " + battery  + "%" + "\nAmount of Apps: " + appCount;
    return str; //need to return a String
  }
}
