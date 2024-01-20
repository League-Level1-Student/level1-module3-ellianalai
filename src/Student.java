
public class Student{

	static int nextId=1000;

	static String School="Carmel Valley ";

	int id;

	String name;

	int currentLevel;

	Student (String name, int currentLevel	){
		
		id = Student.nextId;
		
		nextId+=1;

		this.name = name;
		this.currentLevel = currentLevel; }

	public static void main(String[] args){
		
		//create 2 students.
		Student bob = new Student("bob", 9);
		Student jess = new Student("jess", 11);
		Student billy = new Student("billy", 10);
		//print their names, ids and school. }}
		System.out.println(bob.name);
	
		System.out.println(bob.id);
		System.out.println(bob.School);
		
		System.out.println(jess.name);
		System.out.println(jess.id);
		System.out.println(bob.School);
		
		System.out.println(billy.name);
		System.out.println(billy.id);
		System.out.println(bob.School);
		//*Note: static variables belong to the class and other variables belong to instance.
	}
}