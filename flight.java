 
import java.util.Scanner;
class trip{
    String agree;
    String country;
    String numAcount;
    String password;
    String name;
    String numPass;
    String kindPass;
    String kindTicket;
}

public class flight{ 
static trip f=new trip();
  public static Scanner in = new Scanner ( System.in);
  public static void welcomes(){
      int i=1;
    do{
        System.out.println("welcome in Osama company to Flight trips ~~ ");
        System.out.println(" Are you want to get ticket ?"+"\n"+"(  yes   or   no )?");
       f.agree=in.nextLine();
        if (f.agree.trim().equals("yes")){
            chooseCountry();
            break;}
        else if (f.agree.trim().equals("no")) {
                 System.out.println("sorry ,we can't help you\n\n");
              try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          System.out.print("\033[H\033[2J");
      }
         else{
           System.out.println("sorry , we do not understand your order ?\n\n");
          try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
           System.out.print("\033[H\033[2J"); }
       i++;  
       }while(i>0);
  }
    public static void chooseCountry(){
        System.out.println("Choose Country of next chiklist ..!");
        String []countries={"saudi arabia", "qatar       ", "amircan         ", 
                            "netherlands ", "spain       ", "france      ",
                            "belgium     ", "bahrain     ", "china       ", 
                            "india       ", "egypt       "};
        
        String []times={"Five minutes", "three hours", "fifty minutes",
                        "two weeks", "seven hours", "two days", 
                        "six days", "two weeks", "three days", 
                        "a quarter of an hour", "one day"};
        for(int i=0;i<times.length;i++){
            System.out.println("_____________________________________");
            System.out.println("|"+countries[i]+"|"+" the trip after :"+times[i]);
            System.out.println("_____________________________________");}
      
        
     
        boolean sure;
        do{
            sure=false;
          f.  country=in.nextLine();
       for(int i=0;i<countries.length;i++)
         if(f.country.trim().equals(countries[i].trim())){
             sure=true;
           break;}
            if(!sure){System.out.println("sorry , we haven't any trip to this conuntry choose again");
                try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
       
        }while(sure==false);
        System.out.println("enter the number of your account : ");
        f. numAcount=in.nextLine();
        System.out.println("enter the password of your account : ");
        f. password=in.nextLine();
        
       System.out.println("ok ,enter your data !") ;
           dataPerson(countries,times,f.country);
    }
    
    
  public static void dataPerson(String []countries,String []times,String country){
      System.out.println("enter your name : ");
      f. name =in.nextLine();
      System.out.println("enter number of your pasport");
      f. numPass=in.nextLine();
      System.out.println("enter the kind of passport");
      f. kindPass=in.nextLine();
      System.out.println("enter the kind of the ticket which you want");
      f. kindTicket=in.nextLine();
      String []countryC=countries;
      String []timeC=times;
      String conC=country;
     printData(f.name,f.numPass,f.kindPass,f.kindTicket,countryC,timeC,conC);
  } 
    
    public static void printData(String name , String numPass , String kindpass , String kindTicket,String []countries,String []times,String conC) {
        System.out.print(" you will get on your ticket sucssfully ....✓");
           try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       System.out.println("-------------------------------------");
        System.out.println("the name : "+name+"\n"+"number of passport : "+numPass+"\n"+"the kind of passport : "+kindpass+"\n"+" the kind of ticket : "+kindTicket+"\n");
        for(int i=0;i<countries.length;i++)
       { if(conC.trim().equals(countries[i].trim()))
           
            System.out.println("your trip to "+conC +" after "+times[i]+"\nYou can sit in seat 33 on the left ");}
        System.out.println("------------------------------------");}   
    
  public static void main ( String [] arges){
      welcomes();
  }  
}
