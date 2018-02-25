
public class Person {
	private String name;
	private String superpower;

	String getName() {
		return name;
	}

	String getSuperpower() {
		return superpower;
	}

	void setName(String newName) {
		name = newName;
	}

	void setSuperpower(String newSuperpower) {
		superpower = newSuperpower;
		
	}
	 public String toString() {
		 return name + " Has Mad " + superpower + " skills";
	 }
}
