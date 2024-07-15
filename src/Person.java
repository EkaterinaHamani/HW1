public class Person {
    public String name;
    public String position;
    public String email;
    public String phone_number;
    public int salary;
    public int age;

public Person(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;}

    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone_number+ "\n-"
                +salary+ "\n-"
                +age);}

    public static void createArray() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Master", "petr@mailbox.com", "892312313", 35000, 35);
        persArray[2] = new Person("Smirnov Victor", "Worker", "victor@mailbox.com", "892312314", 20000, 20);
        persArray[3] = new Person("Fedorov Vasiliy", "Manager", "vasiliy@mailbox.com", "892312315", 40000, 40);
        persArray[4] = new Person("Levakova Sofiya", "Owner", "sofiya@mailbox.com", "892312316", 100000, 50);
            for (Person person : persArray)
                System.out.println(person);
        }}