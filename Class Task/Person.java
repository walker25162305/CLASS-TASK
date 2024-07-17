//The following programe displays the person information by use of contrast and methods//
//We start by declaring the class//
  public class Person{
	//Fields to store the persons age, name and address (variables)

	private String name;
	private int age;
	private String address;

	//constructor to initialize the fields//
	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//Method to display the persons details//
	public void displayDetails(){
		System.out.println("Name:"+name);
		System.out.println("Age:" +age);
		System.out.println("Adress:"+address);
	}
	//Method thst calls person details and display methods//
	public void displayPersonDetails(Person person){
		person.displayDetails();
	}
	//Method to pass the current instance of the person object//
	public void printCurrentInstance(){
		displayPersonDetails(this);
	}
	//Method to create an object and call the printCurrentInstance method//
	public static void main(String[]args){
		//the person object//
		Person person = new Person("Brian Ochieng",30,"Kenya");

		person.printCurrentInstance();
	}
}