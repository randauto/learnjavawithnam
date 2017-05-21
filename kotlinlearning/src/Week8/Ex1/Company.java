package Week8.Ex1;

/**
 * Created by TuanLQ on 5/21/17.
 */
public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "Male", "Programmer","Software development");
        employee1.setEmailAddress("john@company.com");
        employee1.setPhoneNumber("1234567890");

        Employee employee2 = new Employee("Alice Smith", "Female", "Designer","Design development");
        employee2.setEmailAddress("alice@company.com");
        employee2.setPhoneNumber("2468024680");

        Employee employee3 = new Employee("Tim Bucha", "Male", "Team Lead","Projects");
        employee3.setEmailAddress("tim@company.com");
        employee3.setPhoneNumber("1357913579");

        employee1.introduction();
        employee2.introduction();
        employee3.introduction();
    }
}
