package Week8.Ex1;

import java.util.Date;

/**
 * Created by TuanLQ on 5/21/17.
 */
public class Employee {
    private String name;

    private String gender;

    private Date birthDate;

    private  String phoneNumber;

    private String emailAddress;

    private String jobPosition;

    private String department;


    public Employee(String name, String gender, String jobPosition, String department) {
        this.name = name;
        this.gender = gender;
        this.jobPosition = jobPosition;
        this.department = department;
    }


    public Employee(String name, String gender, Date birthDate, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }


    public Employee(String name, String gender, Date birthDate, String phoneNumber, String emailAddress, String jobPosition, String department) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.jobPosition = jobPosition;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void work(String workName) {
        System.out.println("Employee " + name + " working " + workName);
    }

    public void introduction() {
        System.out.println("+ Name: " + name);
        System.out.println("+ Gender: " + gender);
        System.out.println("+ Email: " + emailAddress);
        System.out.println("+ Phone: " + phoneNumber);
        System.out.println("+ Job Position: " + jobPosition);
        System.out.println("+ Department: " + department);
    }
}
