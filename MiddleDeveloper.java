package Lesson3.Developers;

/**
 * Created by Sasha on 03.09.2016.
 */
/*
Написать своего наследника Developer. Добавить его в
существующий проект.
 */

public class MiddleDeveloper extends Developer{

    public MiddleDeveloper (String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (super.getBasicSalary()*1.5) + (super.getExperience() > 0 ? super.getBasicSalary() * super.getExperience() * 0.1 : 0);
    }
}
