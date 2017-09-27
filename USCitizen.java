//import java.util.Scanner;
import java.util.Random;
public class USCitizen extends Person{
	/**
	 * USCitizen class attributes
	 */
	private boolean SSN;
	private int social;
	private String visa;
	
	/**
	 * Default constructor for the USCitizen class
	 */
	public USCitizen(){
		super();
		SSN = false;
		social = 99999999;
		visa = "m1 visa";
	}
	
	/**
	 * 
	 * Overloaded constructor for teacher class
	 * @param n  pass by value the name
	 * @param add  pass by value the address
	 * @param w  pass by value the weight
	 * @param h  pass by value the height
	 * @param color  pass by value the eye color
	 * @param gen  pass by value the gender
	 * @param date pass by value the date
	 * @param old  pass by value the age
	 * @param citizen  pass by value the whether the user is a citizen
	 * @param visa pass by value the visa
	 */
	public USCitizen(String n, String add, double w,String h,String color,String gen, String date, int old,boolean citizen,String visa){
		super(n,add,w,h,color,gen,date,old);
		SSN = citizen;
		this.visa=visa;
		if(citizen){//if user is a citizen randomly generate a social security number
			Random rn = new Random();
			social = rn.nextInt(99999999-10000000+1)+10000000;
		}
		else{
			social=99999999;//if user is not a US citizen
		}
		
	}
	
	//getters and setters
	public boolean  getCitizen(){
		return SSN;
	}
	public int getSSN(){
		return social;
	}
	
	public String getVisa(){
		return visa;
	}
	
	public void setSSN(int s){
		social = s;
	}
	
	public void setCitizen(boolean n){
		SSN = n;
	}
	
	public void setVisa(String v){
		visa =v;
	}
	
	//Display whether the user is able to work in the US	
	public String DisplayWorkStatus(){
		if(SSN){//if user is a citizen
			return "Work Status: Able to work"+"\n";
		}
		else{
			if(visa.equalsIgnoreCase("f1")||visa.equalsIgnoreCase("f1 visa")){//if user has f1 visa
				return "Work Status: Able to work (less than 20 hours per week)"+"\n";
			}
			else if(visa.equalsIgnoreCase("m1")||visa.equalsIgnoreCase("m1 visa")){//if user has a m1 visa
				return "Work Status: Able to work (with permission from sponsor)"+"\n";
			}
			else{//anything else not able to work
				return "Work Status: Not able to work"+"\n";
			}
		}
	}
	
	/**
	 * Overrides the toString() in Person class
	 * returns string
	 */
	@Override
	public String toString(){
		return super.toString()+"Social Security Number: "+social+"\n"+"Visa: "+visa+"\n"+DisplayWorkStatus();
	}
	
	
	
	

}
