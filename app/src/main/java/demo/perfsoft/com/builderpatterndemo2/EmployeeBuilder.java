package demo.perfsoft.com.builderpatterndemo2;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class EmployeeBuilder {
    private int id;
    private String name = "";
    private int age;
    private String address = "";
    private String phone = "";
    private float salary;

    public EmployeeBuilder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee builder(){
        return new Employee(id, name, age, address, phone, salary);
    }
}
