package oopWithNLayeredKodlama.io.entities;

public class Course extends Base {
	private String categoryName;
	private double price;
	private String description;
	private int completion;
	private String instructorName;

	public Course() {

	}

	public Course(int id, String name, String categoryName, double price, String description, int completion, String instructorName) {
		super(id, name);
		this.categoryName = categoryName;
		this.price = price;
		this.description = description;
		this.completion = completion;
		this.instructorName = instructorName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCompletion() {
		return completion;
	}

	public void setCompletion(int completion) {
		this.completion = completion;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
