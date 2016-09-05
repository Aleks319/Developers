package Lesson3.Developers;

/*
Создать список разработчиков и заполнить его случайным
образом. Вывести на экран только Senior developer-ов с
зарплатой больше 1500 у.е.
 */
public class TestList {
    public static void main(String[] args) {
        Developer[] list = new Developer[40];
        double baseSalary = 600;
        int j = 1;
        int numb = 1;

        for (int i = 0; i < list.length; i++) {
            switch (j) {
                case (1):
                    list[i] = new JuniorDeveloper("JDev " + numb, baseSalary, (numb - 1));
                    break;
                case (2):
                    list[i] = new MiddleDeveloper("MDev " + numb, baseSalary, (numb - 1));
                    break;
                case (3):
                    list[i] = new SeniorDeveloper("SDev " + numb, baseSalary, (numb - 1));
                    break;
                case (4):
                    list[i] = new TeamLeadDeveloper("TLDev " + numb, baseSalary, (numb - 1));
                    break;
            }
            if (j == 4) {
                j = 1;
                numb++;
            } else {
                j++;
            }
        }

        //Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.

        for (Developer d: list) {
            if(d instanceof SeniorDeveloper && d.getSalary() > 1500) {
                System.out.println("Developer " + d.getName() + ": " + d.getSalary());
            }
        }
        System.out.println("\n" + "***********************************************" + "\n");

        /*
        Написать код, который разделит список объектов Developer
        на 3 отдельных списка для Juniors, Seniors и Team Leads.
        Вывести списки на экран.
         */

        JuniorDeveloper[] listJun = new JuniorDeveloper[list.length];
        MiddleDeveloper[] listMid = new MiddleDeveloper[list.length];
        SeniorDeveloper[] listSen = new SeniorDeveloper[list.length];
        TeamLeadDeveloper[] listTL = new TeamLeadDeveloper[list.length];
        int lJ = 0;
        int lM = 0;
        int lS = 0;
        int lTL = 0;

        for (Developer d: list) {
            if(d instanceof JuniorDeveloper) {
                listJun[lJ] = (JuniorDeveloper)d;
                lJ++;
            } else if (d instanceof MiddleDeveloper) {
                listMid[lM] = (MiddleDeveloper)d;
                lM++;
            } else if (d instanceof SeniorDeveloper) {
                listSen[lS] = (SeniorDeveloper)d;
                lS++;
            } else if (d instanceof TeamLeadDeveloper) {
                listTL[lTL] = (TeamLeadDeveloper)d;
                lTL++;
            }
        }

        //JuniorDevelopers
        System.out.println("List of Junior Developers: ");
        for (int i = 0; i< lJ; i++)
            System.out.println(listJun[i].getName() + ": salary: " + listJun[i].getSalary() + "; experience: " + listJun[i].getExperience());


        //MiddleDevelopers
        System.out.println("\n" + "List of Middle Developers: ");
        for (int i = 0; i< lJ; i++)
            System.out.println(listMid[i].getName() + ": salary: " + listMid[i].getSalary() + "; experience: " + listMid[i].getExperience());


        //SeniorDevelopers
        System.out.println("\n" + "List of Senior Developers: ");
        for (int i = 0; i< lJ; i++)
            System.out.println(listSen[i].getName() + ": salary: " + listSen[i].getSalary() + "; experience: " + listSen[i].getExperience());


        //TeamLeadDevelopers
        System.out.println("\n" + "List of Team Lead Developers: ");
        for (int i = 0; i< lJ; i++)
            System.out.println(listTL[i].getName() + ": salary: " + listTL[i].getSalary() + "; experience: " + listTL[i].getExperience());
    }
}