package Lesson3.Developers;

public class TeamLeadDeveloper extends Developer {

	public TeamLeadDeveloper(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (super.getBasicSalary() * 4) + (super.getExperience() > 0 ? super.getBasicSalary() * super.getExperience() * 0.1 : 0);
	}
}
