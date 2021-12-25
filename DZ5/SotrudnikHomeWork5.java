/**
* Java 1. Homework #5
*
* @author Andrey Chuprin
* @version 25.12.2021
*/
class SotrudnikHomeWork5 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Petrov Petr", "Engineer",
                "petrov@mail.com", "2333555", 30000, 25),
            new Employee("Kirillov Kirill", "Lead Engineer",
                "kirillov@mail.com", "1234569", 40000, 30),
            new Employee("Denisov Denis", "Manager",
                "denisov@mail.com", "5658745", 50000, 32),
            new Employee("Egorov Egor", "Assistant",
                "egorov@mail.com", "1233585", 280000, 37),
            new Employee("Ivanov Ivan", "Director",
                "ivanov@mail.com", "2833775", 85000, 55)
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone,
             int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
        "\n| Position: " + position +
        "\n| Email: " + email +
        "\n| Phone: " + phone +
        "\n| Salary: " + salary +
        "\n| Age: " + age);
    }
}