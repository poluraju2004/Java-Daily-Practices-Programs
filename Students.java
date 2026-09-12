/*
9.	Composition and Aggregation: Create a class Address with attributes street, city, and state. 
Then create a class Person with attributes name and an Address object. 
Demonstrate how to use com Write a Java class representing a Student. 
Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers. 
Provide getter and setter methods to access and modify these attributes position to model the relationship between a person and their address*/

class Address{
	private String street;
	private String city;
	private String state;

	public void setAddress(String street, String city, String state){
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public void getAddress(){
		System.out.println("street " + street + " city " + city + " state " + state);
	}
}

class Person extends Address{
	private String name;
	private int age;
	private double grade;
	private  Address address;

	public void setPerson(String name, int age, double grade, Address address){
		this.name = name;
		this.age = age;
		this. grade = grade;
	}

	public void getPerson(){
		address.getAddress();
		System.out.println("Name " + name + " age " + age + " grade " + grade);

	}

}

class Students{
	public static void main(String[] args) {
		Address a = new Address();
		Person p = new Person();
		a.setAddress("Satyam Theater", "Hyd", "Telangana");
		p.setPerson("bob", 50, 12.5, a);
		p.getAddress();
	}
}