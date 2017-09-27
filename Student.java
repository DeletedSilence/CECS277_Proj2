import java.util.Random;
public class Student extends USCitizen{
	/**
	 * Student class attributes
	 */
	private int ID;
	private int NumCourses;
	private String [] courses;
	private int [] grade;
	private double GPA;
	
	/**
	 * Default constructor for the Student class that calls the default constructor for the super class
	 */
	public Student(){
		super();//Default constructor from super class
		Random rn = new Random();
		ID = rn.nextInt(19999999-10000000+1)+10000000;//Random ID
		NumCourses = 4;
		courses = new String[NumCourses];
		courses[0] = "English";
		courses[1] = "History";
		courses[2] = "Algebra";
		courses[3] = "Art";
		grade = new int[NumCourses];
		grade[0]= 4;
		grade[1] = 3;
		grade[2]=2;
		grade[1] = 1;
		GPA = ((double)10)/4;
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
	 * @param num pass by value the number of courses
	 */
	public Student(String n, String add, double w,String h,String color,String gen, String date, int old,boolean citizen, String visa, int num){
		super(n, add,w,h,color,gen,date,old,citizen,visa);
		//ID = id;
		Random rn = new Random();
		ID = rn.nextInt(19999999-10000000+1)+10000000;//random id
		NumCourses = num;
		courses = new String[NumCourses];//Instantiate the string array
		setCourses(NumCourses);//set the courses
		grade = new int[NumCourses];//instantiate the int array of grades
		setGrades(NumCourses);//set the grades
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
	
	public double getGPA(){
		int total=0;
		for(int i = 0; i<NumCourses;i++){
			total+=grade[i];
		}
		GPA = ((double)total)/NumCourses;
		return GPA;
	}
	
	public void setGPA(){
		int total=0;
		for(int i = 0; i<NumCourses;i++){
			total+=grade[i];
		}
		GPA = ((double)total)/NumCourses;
	}
	
	public void setNumCourse(int n){
		NumCourses = n;
	}
	
	public String getGrades(){
		String clas = "";
		for(int i = 0;i<NumCourses;i++){
			clas+=grade[i]+", ";
		}
		return clas;
	}
	
	public void setCourses(int s){
		courses = new String[s];
		String [] clas = {"History","Art","Biology","Geometry","English","Physical Education","Physics","Anthropology","Computer Science","Computer Engineering"};
		for(int i=0;i<s;i++){
			courses[i]=clas[i];
		}
	}
	
	public void setGrades(int s){
		grade = new int[s];
		int [] num = {4,3,2,1,0};
		Random rn = new Random();
		for(int i = 0;i<s;i++){
			int n = rn.nextInt(5);
			grade[i]=num[n];
		}
		
	}
	
	/**
	 * Overrides the toString() in USCitizen class
	 * returns string
	 */
	@Override
	public String toString(){
		return super.toString() + "Student ID: "+ID+"\n"+"Number of Courses: "+NumCourses+"\n"+"Courses: "+getCourses()+"\n"+"Grades: "+getGrades()+"\n"+"GPA: "+GPA;
	}
	
	

}
