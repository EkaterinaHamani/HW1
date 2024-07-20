public class Employee {
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("name: "+name+" ,position: "+position+" ,email: "+email+" ,phone_number: "+phone_number+ " ,salary: "+salary+" ,age: "+ age);
    }
}
