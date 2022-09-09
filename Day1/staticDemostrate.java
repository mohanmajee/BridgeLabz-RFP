package Day1;

public class staticDemostrate {
	static int id;
	static String name;
	String street;
	
	// static method
	static void method1()
	{
		System.out.println("Static method belongs to the class.");
	}
	static
	{
		id = 1;
		name = "This is static";
	}
	
	// A class can be made static only if it is a nested class.
	// A static class cannot access non-static members of the Outer class
	static class nestedClass
	{
		void display()
		{
			System.out.println("\n*** Display the static values from Nested Class ***");
			System.out.println("id = " + id);
			System.out.println("name = " + name);
		}
	}

	public static void main(String[] args) {

		// static method can be called without creating an object
		method1();
		
		System.out.println("\n *** Display the static values after setting in Static Block ***");
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		
		staticDemostrate obj1 = new staticDemostrate();
		staticDemostrate obj2 = new staticDemostrate();
		
		obj1.id = 2;
		obj1.name = "name2";
		obj1.street = "street2";
		
		obj2.id = 3;
		obj2.name = "name3";
		obj2.street = "street3";
		
		System.out.println();
		System.out.println("obj1.id = " + obj1.id);
		System.out.println("obj1.name = " + obj1.name);
		System.out.println("obj1.street = " + obj1.street);
		
		System.out.println();
		System.out.println("obj2.id = " + obj2.id); // static variable is overwritten here since it is common to all instances
		System.out.println("obj2.name = " + obj2.name); // static variable is overwritten here since it is common to all instances
		System.out.println("obj2.street = " + obj2.street); // non-static variable is not overwritten since it is specific to individual instances
		
		staticDemostrate.nestedClass objNC = new staticDemostrate.nestedClass();
		objNC.display();
	}


}
