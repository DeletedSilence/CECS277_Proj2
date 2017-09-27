//import java.util.Scanner;
public class Person {
	/**
	 * Person class attributes
	 */
	private String name;
	private String address;
	private double weight;
	private String height;
	private String eyeColor;
	private String gender;
	private String dateofbirth;
	private int age;
	
	
	/**
	 * default constructor for the person class
	 */
	public Person(){
		name = "Default Name";
		address = "xxxx";
		weight = 0.0;
		height = "x'x";
		eyeColor = "xxxx";
		gender = "X";
		dateofbirth = "xx/xx/xxxx";
		age = 0;
		
	}
	
	/**
	 * 
	 Overloaded constructor for teacher class
	 * @param n  pass by value the name
	 * @param add  pass by value the address
	 * @param w  pass by value the weight
	 * @param h  pass by value the height
	 * @param color  pass by value the eye color
	 * @param gen  pass by value the gender
	 * @param date pass by value the date
	 * @param old  pass by value the age
	 */
	public Person(String n, String add, double w,String h,String color,String gen, String date, int old){
		name = n;
		address = add;
		weight = w;
		height = h;
		eyeColor = color;
		gender = gen;
		dateofbirth = date;
		age = old;
	}
	
	//getters and setters
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public String getHeight(){
		return height;
	}
	
	public String getEye(){
		return eyeColor;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getDOB(){
		return dateofbirth;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setAddress(String a){
		address = a;
	}
	
	public void setWeight(double w){
		weight = w;
	}
	
	public void setHeight(String h){
		height = h;
	}
	
	public void setColor(String c){
		eyeColor = c;
	}
	
	public void setGender(String g){
		gender = g;
	}
	
	public void setDOB(String d){
		dateofbirth = d;
	}
	
	public void setAge(int a){
		age= a;
	}
	
	/**
	 * toString method to display contents of object
	 * returns string
	 */
	public String toString(){
		return "Name: "+name+"\n"+"Address: "+address+"\n"+"Weight: "+weight+"\n"+"Height: "+height+"\n"+"EyeColor: "+eyeColor+"\n"+"Gender: "+gender+"\n"+"Date of Birth: "+dateofbirth+"\n"+"Age: "+age+"\n";
	}
	

}
