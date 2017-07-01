/*Assignment 4_2*/

package Session4_2;

public class Testshirt {

	public static void main(String[] args) {

		// Initializing three shirt objects

		Shirt s1 = new Shirt(); // it will call default constructor of Shirt
								// class
		Shirt s2 = new Shirt(14, 38); // it will call parameterized constructor
										// of shirt class
		Shirt s3 = new Shirt(44, 21); // it will call parameterized constructor
										// of shirt class

		// Calling static method displayResult

		Testshirt.dislayResult(s1);
		Testshirt.dislayResult(s2);
		Testshirt.dislayResult(s3);
	}

	public static void dislayResult(Shirt obj) {

		// Printing the values of each private members of the Shirt class.

		System.out.println("The shirt collor size for this object is " + obj.getshirtCollarSize()
				+ " \n The shirt sleeve length for this object is " + obj.getShirtSleeveLength()
				+ " \n The shirt material for this object is " + obj.getShirtMaterial() + "\n");

	}

}
