package lk.ijse.restcontroller.dto;

public class CustomerDTO {

    private String id;
    private String name;
    private String address;
    private double salary;



    public CustomerDTO(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public CustomerDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
