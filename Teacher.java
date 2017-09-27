import java.util.Random;
public class Teacher extends USCitizen{
	/**
	 * Teacher class attributes
	 */
	private int ID;
	private int NumCourses;
	private String [] courses;
	
	/**
	 * Default Constructor
	 * set variables to default values when new object is called
	 */
	public Teacher(){
		super(); //calls the default constructor from the super class
		//adds more default values to the default constructor
		Random rn = new Random();
		ID = rn.nextInt(29999999-20000000+1)+20000000;// Random ID every time an object is instantiated
		NumCourses = 1;
		courses = new String[NumCourses];
		courses[0] = "None";
		
	}
	
	/**
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
	 * @param num pass by value the number of courses
	 */
	public Teacher(String n, String add, double w,String h,String color,String gen, String date, int old,boolean citizen,String visa, int num){
		super(n, add,w,h,color,gen,date,old,citizen,visa);
		Random rn = new Random();
		ID = rn.nextInt(29999999-20000000+1)+20000000; //get a random ID
		NumCourses = num;
		courses = new String[NumCourses];
		setCourses(NumCourses);
	}
	
	//setters and getters
	public int getID(){
		return ID;
	}
	
	public int getNumCourses(){
		return NumCourses;
	}
	
	public String getCourses(){
		String clas = "";
		for(int i = 0;i<NumCourses;i++){
			clas+=courses[i]+", ";
		}
		return clas;
	}
	
	public void setNumCourse(int n){
		NumCourses = n;
	}
	
	public void setCourses(int n){
		courses = new String[n];
		String [] clas = {"History","Art","Biology","Geometry","English","Physical Education","Physics","Anthropology","Computer Science","Computer Engineering"};
		for(int i=0;i<n;i++){
			courses[i]=clas[i];
		}
	}
	
	/**
	 * Overrides the toString() in USCitizen class
	 * returns string
	 */
	@Override
	public String toString(){
		return super.toString() + "Teacher ID: "+ID+"\n"+"Number of Courses Instructing: "+NumCourses+"\n"+"Courses: "+getCourses()+"\n";
	}

}
