class Main {
  public static void main(String[] args) {
    //Build objects
    BangerPhone bng1 = new BangerPhone("119");

    Phone pn = new Phone("Mom","119");

    SmartPhone sp = new SmartPhone("119","47.12.32");

    System.out.println();

    //Use objects to call functions

    System.out.println(bng1.call());
    System.out.println(bng1.call());
    System.out.println(bng1.info());
    

System.out.println("\n\n\n\n\n");//used to seperate output and make each object seperate from the rest
    
    System.out.println(pn.getProvider());
    System.out.println(pn.getNumber());
    pn.call();

System.out.println("\n\n\n\n\n");
    
    System.out.println(sp.call());
    System.out.println(sp.info());
   
    
  }
}