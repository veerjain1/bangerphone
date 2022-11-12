class Phone{
//declare private variables which are reachable to the rest of the class
  private String provider;
  private String phoneNum;
  private String list;


  //default constructor
  public Phone(){
    provider="";
    phoneNum ="";
    list = "";
  }
//parameter constructor for variables
  public Phone(String provider, String phoneNum){
    this.provider=provider;
    this.phoneNum = phoneNum;
    list = "";
  }


  //accessor methods for provider name and phone number
  public String getProvider(){
    return provider;
  }
  public String getNumber(){
    return phoneNum;
  }

  //mutator, changes list to have the new phone number included, prints straight from method, no return

  public void call(){
    list = list+"\n"+phoneNum;
  System.out.println(list);
  }
    
    
  }
  
