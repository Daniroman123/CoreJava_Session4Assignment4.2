/*Assignment 4_2*/

package Session4_2;

public class Shirt {

	// Declaring Instance variables as private so that they can be access only
	// by getters and setters outside of the class

	private int shirtCollarSize;
	private int shirtSleeveLength;
	private String shirtMaterial;

	// getters and setters

	public int getshirtCollarSize() {
		return shirtCollarSize;
	}

	public void setshirtCollarSize(int shirtCollarSize) {
		this.shirtCollarSize = shirtCollarSize;
	}

	public int getShirtSleeveLength() {
		return shirtSleeveLength;
	}

	public void setShirtSleeveLength(int shirtSleeveLength) {
		this.shirtSleeveLength = shirtSleeveLength;
	}

	public String getShirtMaterial() {
		return shirtMaterial;
	}

	public void setShirtMaterial(String shirtMaterial) {
		this.shirtMaterial = shirtMaterial;
	}

	public Shirt(int shirtCollarSize, int shirtSleeveLength) {
		super();
		this.shirtCollarSize = shirtCollarSize;
		this.shirtSleeveLength = shirtSleeveLength;

		// Shirt material is set to cotton

		shirtMaterial = "Cotton";
	}

	// Default constructor
	public Shirt() {
		super();
		shirtCollarSize = 40;
		shirtSleeveLength = 20;
		shirtMaterial = "Cotton";
	}

}
