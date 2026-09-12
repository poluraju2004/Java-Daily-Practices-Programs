class Person{
	private String name;
	private int age;
	private String country;


	// Parameterized Constructor
	public Person(String n, int a, String c){
		name = n;
		age = a;
		country = c;
	}


	//Default Constructor
	public Person(){
		System.out.println("Default Constructor");
	}

	// Copy Constructor
	public Person(Person p1){
		name = p1.name;
		age = p1.age;
		country = p1.country;
	}

	public String toString(){
		return (name + " " + age + " " + country );
	}

	public static void main(String[] args) {
		Person p1 = new Person("Abc", 22, "India");
		System.out.println("Parameterized Constructor = " +  p1);
		Person p2 = new Person();
		Person p3 = new Person(p1);
		System.out.println("Copy Constructor = " + p3);

	}
	
}