package acs.boundary;


public class CategoryBoundary {

	private String name;
	private String description;


	public CategoryBoundary() {
		// TODO Auto-generated constructor stub
	}

	public CategoryBoundary(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
