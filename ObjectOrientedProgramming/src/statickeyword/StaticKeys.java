package statickeyword;

class Student{
	String name;
	static String schoolname;

  	public static void schoolNameChange(){
  		schoolname ="SBOA";
  	}
}
public class StaticKeys {

	public static void main(String[] args) {
		Student.schoolname="GPS";
		Student student = new Student();
		student.name = "Ajay";
		System.out.println(Student.schoolname+" "+student.name);
	}

}
/*
 * Static can be :
 *  Variable (also known as a class variable)
 *  Method (also known as a class method)
 *  Block Nested class
 */
