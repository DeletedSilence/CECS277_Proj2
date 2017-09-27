/**
 * Jose Ramirez
 * CECS 277
 * 9/25/17
 * Project 2: US Citizen
 */
import java.util.Random;
import java.util.Scanner;

public class PersonTester {
	public static void main(String[] args){
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		
		System.out.println("Default Teacher Object");
		System.out.println(t1);
		System.out.println("");
		System.out.println("Default Student Object");
		System.out.println(s1);
		System.out.println("");
	
		boolean redo = true;
		do{
		String name,address,eyeColor,gender, dateofbirth, height, visa = ""; //variables
		double weight;
		int age,social,NumCourses;
		boolean SSN=false;
		Scanner in = new Scanner(System.in); //get scanner
		String n = "";
		System.out.println("Please input your name:");//get name from user
		boolean check = false;
		do//user validation for name
		{
			n = in.nextLine();
			if(n.matches(".*\\d+.*")){
				System.out.println("Error! Please enter a valid name");
			}
			else{
				check = true;
			}
			
		}while(!(check));
		check = false;
		double w;
		name = n;
		System.out.println("Please input your address:");//get address from user
		do //user validation for address
		{
				address = in.nextLine();
				if(address.length()<4){
				System.out.println("Error! Please enter your address");
				}
				else{
					check = true;
				}


		}while(!(check));
		System.out.println("Please input your weight:");//get weight from user
		do //user validation for weight
		{
			while (!(in.hasNextDouble()))

		{
				in.nextLine();
				System.out.println("Error! Please enter your weight");//Display error if not one of the options
				
		}
			w = in.nextDouble();
			check = true;


		}while(!(check));
		weight =w;
		check = false;
		in.nextLine();
		System.out.println("Please input your height(x'x):");//get height from user
		do //user validation for height
		{
				height = in.nextLine();
				if(height.length()>4||height.length()<3){
				System.out.println("Error! Please enter your height");
				}
				else if(height.matches(".*\\d+.*")&& height.contains("'")){
					check = true;
				}


		}while(!(check));
		check = false;
		System.out.println("Please input your eye color:");//get eye color from user
		do //user validation for eye color
		{
			n = in.nextLine();
			if(n.matches(".*\\d+.*")){
				System.out.println("Error! Please enter your eye color");
			}
			else if(n.length()<3){
				System.out.println("Error! Please enter your eye color");
			}
			else{
				check = true;
			}


		}while(!(check));
		
		eyeColor = n;
		check = false;
		System.out.println("Please input your gender:");//get gender from user
		do //user validation for gender
		{
			n = in.nextLine();
			if(n.equalsIgnoreCase("m")||n.equalsIgnoreCase("f")||n.equalsIgnoreCase("male")||n.equalsIgnoreCase("female")){
				check = true;
			}
			else{
				System.out.println("Error! Please enter your gender");
			}


		}while(!(check));
		gender = n;
		check = false;
		int m;
		int d;
		int y;
		System.out.println("Please input your date of birth:");//get date of birth from user
		System.out.println("Input the month:");//get month
		do //user validation for month
		{
			while (!(in.hasNextInt()))

		{
				in.nextLine();
				System.out.println("Error! Please enter the month");
				
		}
			m = in.nextInt();
			if(m>12 || m <= 0){
				System.out.println("Error! Please enter the month");
			}
			else{
				check = true;
			}


		}while(!(check));
		in.nextLine();
		check = false;
		System.out.println("Input the day:");//get day from user
		do //user validation for day
		{
			while (!(in.hasNextInt()))

		{
				in.nextLine();
				System.out.println("Error! Please enter the day");
				
		}
			d = in.nextInt();
			if(d>31 || d <= 0){
				System.out.println("Error! Please enter the day");
				System.out.println("H");
			}
			else if(d==30&&m==2){
				System.out.println("Error! Please enter the day");
				System.out.println("T");
			}
			else if(d==31 && m== 2||m==4||m==6||m==9||m==11){
				System.out.println("Error! Please enter the day");
				System.out.println("D");
			}
			else{
				check = true;
			}


		}while(!(check));
		check = false;
		System.out.println("Input the year:");//get year from user
		do //user validation for year
		{
			while (!(in.hasNextInt()))

		{
				in.nextLine();
				System.out.println("Error! Please enter the year");
				
		}
			y = in.nextInt();
			if(y>2017 || y <= 1000){
				System.out.println("Error! Please enter the year");
			}
			else{
				check = true;
			}


		}while(!(check));
		check = false;
		dateofbirth = Integer.toString(m)+"/"+Integer.toString(d)+"/"+Integer.toString(y);//combine month,day,year into string
		age = 2017 - y; //get the age by subtracting current year and year of age
		
		String str = "";
		in.nextLine();
		//boolean check = false;
		System.out.println("Are you a US Citizen?(y/n):");//get citizenship status from user
		do //user validation for citizenship
		{
				str = in.nextLine();
			if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("yes")){
				SSN = true;
				check=true;
			}
			else if(str.equalsIgnoreCase("n")||str.equalsIgnoreCase("no")){
				SSN = false;
				check = true;
			}
			else{
				System.out.println("Error! Please enter if you are a US Citizen (y/n)");
			}


		}while(!(check));
		check = false;
		if(SSN){//if user is a citizen then visa is not needed
			visa = "Not Needed";
		}
		else if(!SSN){//else enter visa
			social = 99999999;
			System.out.println("Do you have a visa?(y/n)");
			do //user validation for visa
			{
					str = in.nextLine();
				if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("yes")){
					check=true;
				}
				else if(str.equalsIgnoreCase("n")||str.equalsIgnoreCase("no")){
					check = true;
				}
				else{
					System.out.println("Error! Please enter if you have a visa (y/n)");
				}


			}while(!(check));
			
			check = false;
			if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("yes")){//if user has a visa
				System.out.println("Please enter your visa:");//get visa from user
				String result = "";
				do //user validation for visa
				{
						result = in.nextLine();
					if(result.equalsIgnoreCase("f1 visa")||result.equalsIgnoreCase("j1 visa")||result.equalsIgnoreCase("m1 visa")||result.equalsIgnoreCase("f1")||result.equalsIgnoreCase("m1")||result.equalsIgnoreCase("j1")){
						visa = result;
						check=true;
					}
					else{
						System.out.println("Error! Please enter your visa:");
					}


				}while(!(check));
			}
			else if(str.equalsIgnoreCase("n")||str.equalsIgnoreCase("no")){
				visa = "Doesn't have a visa";
			}
		}
		//in.nextLine();
		System.out.println("Please choose the following options: ");
		System.out.println("(1) Student");
		System.out.println("(2) Teacher");
		int input;
		do //Check user input to see if it is one of the options
		{
			while (!(in.hasNextInt()))

		{
				in.nextLine();
				System.out.println("Error! Please select one of the options");//Display error if not one of the options
				
		}
			input = in.nextInt();
			if(input>2 || input <= 0){
				System.out.println("Error! Please select one of the options");
			}
			else{
				check = true;
			}


		}while(!(check));
		
		if(input ==1){//if user is a student 
			Random rn = new Random();
			NumCourses = rn.nextInt(10)+1;
			Student s2 = new Student(name,address,weight,height,eyeColor,gender,dateofbirth,age,SSN,visa,NumCourses);
			s2.setCourses(NumCourses);
			s2.setGrades(NumCourses);
			s2.setGPA();
			System.out.println(s2);
			//GPA = getGPA();
			/*if(SSN){
			rn = new Random();
			social = rn.nextInt(99999999-10000000+1)+10000000;
			}
			else{
				social = 99999999;
			}
			s1.setName(name);
			s1.setAddress(address);
			s1.setWeight(weight);
			s1.setHeight(height);
			s1.setColor(eyeColor);
			s1.setGender(gender);
			s1.setDOB(dateofbirth);
			s1.setAge(age);
			s1.setCitizen(SSN);
			s1.setVisa(visa);
			s1.setNumCourse(NumCourses);
			s1.setCourses(NumCourses);
			s1.setGrades(NumCourses);
			s1.setGPA();
			s1.setSSN(social);
			System.out.println(s1);*/
		}
		else{//if user is a teacher
			Random rn = new Random();
			NumCourses = rn.nextInt(10)+1;
			Teacher t2 = new Teacher(name,address,weight,height,eyeColor,gender,dateofbirth,age,SSN,visa,NumCourses);
			t2.setCourses(NumCourses);
			System.out.println(t2);
			/*courses = new String[NumCourses];
			setCourses();*/
			/*if(SSN){
			rn = new Random();
			social = rn.nextInt(99999999-10000000+1)+10000000;
			}
			else{
				social = 99999999;
			}
			t1.setName(name);
			t1.setAddress(address);
			t1.setWeight(weight);
			t1.setHeight(height);
			t1.setColor(eyeColor);
			t1.setGender(gender);
			t1.setDOB(dateofbirth);
			t1.setAge(age);
			t1.setCitizen(SSN);
			t1.setVisa(visa);
			t1.setNumCourse(NumCourses);
			t1.setCourses(NumCourses);
			t1.setSSN(social);
			System.out.println(t1);*/
			
		}
		check = false;
		in.nextLine();
		System.out.println("Would you like to restart the program?(y/n): ");
		do 
		{
				str = in.nextLine();
			if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("yes")){
				check=true;
			}
			else if(str.equalsIgnoreCase("n")||str.equalsIgnoreCase("no")){
				redo = false;
				check = true;
			}
			else{
				System.out.println("Error! Please enter if you have a visa (y/n)");
			}


		}while(!(check));
	}while(redo);
	}

}
