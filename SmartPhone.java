class SmartPhone{

  //instance variables declared

  private String provider;
  private String phoneNum;
  private String ipAdd;
  private int cost;
  private String list;
  private int callNum;

  //default constructor no parameter
  public SmartPhone(){
    provider = "";
    phoneNum = "";
    ipAdd = "";
    cost = 0;
    list = "";
    callNum=0;
  }

  //constructor with paramters 

  public SmartPhone(String phoneNum, String ipAdd){

    this.phoneNum = phoneNum;
    this.ipAdd = ipAdd;
    provider = "ABCD";
    cost = 0;
    list = "";
    callNum=0;
  }
  //call function, mutator, adds to the phone number list called, prints the list, adds 10 to the cost, adds 1 to the number of calls, and finally returns the total price of the phone calls
  public int call(){
    list = list+"\n"+phoneNum;
    System.out.println(list);
    cost = cost+10;
    callNum = callNum+1;
    return cost;
  }

  //accessor method, returns all values in a string and sends it back to main
  public String info(){
    String info ="";
    info = "Phone: "+phoneNum+"\t\t Provider: "+provider+"\n\n Calls Made:\t"+list+"\n\n Total Calls: "+callNum+"\nTotal Cost: "+cost+"IP Address: "+ipAdd;
    return info;
  }
  

  
}