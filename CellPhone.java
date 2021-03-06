public class CellPhone


{


  //Instance data
  private String name;
  private String brand;
  private int yearModel;
  private double battery;
  private int appCount;


 
  //Constructor -- Has Variables
  public CellPhone(String n, String c, int m, double b, int a)
  //Paramaters for my Constructor
  {
    setName(n);
    setBrand(c);
    setYearModel(m);
    setBattery(b);
    setAppCount(a);
  }



//Creating a Default Constructor 
public CellPhone()
{
  this("The Phone Name was not Provided","The Brand Name Was not Provided",2021,100.0, 0);
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
 public double getBattery()
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
  public void setBattery(double e)
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

//Guess Price of Phone
    public String price(int x) {
        String answer = "";
        setYearModel(x);
        if (yearModel < 2010) {
            answer = "Worthless";
        } else if (yearModel < 2013 && yearModel >= 2010) {
            answer = "About $100";
        } else if (yearModel < 2016 && yearModel >= 2013) {
            answer = "About $200";
        } else if (yearModel < 2019 && yearModel >= 2016) {
            answer = "About $400";
        } else if (yearModel < 2022 && yearModel >= 2019) {
            answer = "About $600";
        }
        return answer;

    }

    public int additionalApps(int extraApps) {
        int totalApps = appCount += extraApps;
        return totalApps;
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


