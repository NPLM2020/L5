
public class Main {

    public static void main(String[] args) {

        int borderAge = 40;

        /* Создать массив из 5 сотрудников. */
        Person[] people = new Person[5];
        people[0] = new Person("Jhon Doe", "CEO", "JhonDoe@gb.com",
                "88005553535", 1200000f, 42);
        people[1] = new Person("Jhon Lennon", "System Architect", "JhonLennon@gb.com",
                "88005556565", 200000f, 31);
        people[2] = new Person("Donald Rump", "Project Manager", "DonaldRump@gb.com",
                "88005559595", 180000f, 50);
        people[3] = new Person("Angelina Dolly", "Business Analyst", "AngelinaDolly@gb.com",
                "88005550505", 120000f, 45);
        people[4] = new Person("Tom Sawyer", "Developer", "TomSawyer@gb.com",
                "88005551515", 140000f, 25);


        /* С помощью цикла вывести информацию только о сотрудниках старше 40 лет. */
        System.out.printf("Employees older than %s:\n", borderAge);
        for (Person person :
                people) {
            if (person.getAge() > borderAge) person.printPersonInfo();
        }

    }

}