package Lesson3.Developers;

public abstract class Developer {

	private String name;
	private double basicSalary;
	private int experience;
	
	public Developer(String name, double basicSalary, int experience) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double getSalary();

	public int getExperience() {
		return experience;
	}
}
