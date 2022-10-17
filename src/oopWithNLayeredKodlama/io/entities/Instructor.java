package oopWithNLayeredKodlama.io.entities;

public class Instructor extends Base {
	private String lastName;

	public Instructor() {
	}

	public Instructor(int id, String name, String lastName) {
		super(id, name);
		this.lastName = lastName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
