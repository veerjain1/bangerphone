class BangerPhone{


  //instance variables declared
  private String provider;
  private String phoneNum;
  private String list;
  private int cost;
  private int callNum;

  //default constructor
  public BangerPhone(){
    provider="";
    phoneNum ="";
    list = "";
    cost =0;
    callNum=0;
  }
  //constructor with parameter
  public BangerPhone(String phoneNum){
    provider="ROAM";
    this.phoneNum =phoneNum;
    list = "";
    cost = 0;
    callNum=0;
  }

  //call function which adds the number to the list, adds 10 to the cost, and increases number of calls by 1
  public int call(){
    list = list+"\n"+phoneNum;
  System.out.println(list);
    cost = cost+10;
    callNum = callNum+1;
    return cost;
  }
//accessor method which tells user all the info in a string
  public String info(){
    String info ="";

    info = "Phone: "+phoneNum+"\t\t Provider: "+provider+"\n\n Calls Made:\t"+list+"\n\n Total Calls: "+callNum+"\nTotal Cost: "+cost;
    return info;
    
  }

  
}