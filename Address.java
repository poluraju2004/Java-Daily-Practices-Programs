/*Composition and Aggregation: Create a class Address with attributes street, city, and state. Then create a class Person with attributes name and an Address object. 
Demonstrate how to use com Write a Java class representing a Student. Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers.
Provide getter and setter methods to access and modify these attributes position to model the relationship between a person and their address*/

class Address{
	String street;
	String city;
	String country;

	public setAddress(String s,String cty,String c){
		street = s;
		city = cty;
		country = c;
	}

	public String getAddress(){
		return street + city + country;
}
}

class Person extend Address{
	String name;

	public setPerson(String n){
		name = n;
	}

	public getPerson(){
		return name;
		}
	}

class Student{
	String name;
	int age;
	double
}




