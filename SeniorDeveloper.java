package Lesson3.Developers;

public class SeniorDeveloper extends Developer {

	public SeniorDeveloper(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (super.getBasicSalary() * 2) + (super.getExperience() > 0 ? super.getBasicSalary() * super.getExperience() * 0.1 : 0);
	}
}
