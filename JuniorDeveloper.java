package Lesson3.Developers;

public class JuniorDeveloper extends Developer {

	public JuniorDeveloper(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return super.getBasicSalary() + (super.getExperience() > 0 ? super.getBasicSalary() * super.getExperience() * 0.1 : 0);
	}
}
