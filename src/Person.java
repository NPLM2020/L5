/**
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 */
public class Person {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    /* Конструктор класса должен заполнять эти поля при создании объекта. */
    public Person(String fullName, String position, String email, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        if (salary >= 0) {
            this.salary = salary;
        } else this.salary = 0;
        if (age >= 0) {
            this.age = age;
        } else this.age = 0;
    }

    public int getAge() {
        return age;
    }

    /* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль. */
    public void printPersonInfo() {
        System.out.printf("\n--------------------\nPersonal information:\nFull name: %s\nPosition: %s\n" +
                        "Age: %s\nEmail: %s\nPhone number: %s\nSalary: %s\n",
                fullName, position, age, email, phoneNumber, salary);
    }

}
