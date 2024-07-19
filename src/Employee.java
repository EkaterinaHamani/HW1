public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public String getName(){
        return name;}

    public String getPosition(){
        return position;}

    public String getEmail(){
            return email;}

    public String getPhoneNumber(){
        return phoneNumber;}

    public int getSalary(){
        return salary;}

    public int getAge(){
        return age;}

    public void showInfo(){
        System.out.println("name: "+name+" ,position: "+position+" ,email: "+email+" ,phone_number: "+phoneNumber+ " ,salary: "+salary+" ,age: "+ age);
    }

    @Override
    public String toString(){
        return("\n-name: "+name+ "\n-"
        +"position: "+position+ "\n-"
        +"email: "+email+ "\n-"
        +"phoneNumber: "+phoneNumber+ "\n-"
        +"salary: "+salary+ "\n-"
        +"age: "+age);
}}
