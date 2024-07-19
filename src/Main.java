public class Main{
    public static void main(String[] args){
        makeNewEmployee();
        System.out.println("\n Задание 2 ");
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Master", "petr@mailbox.com", "892312313", 35000, 35);
        employeeArray[2] = new Employee("Smirnov Victor", "Worker", "victor@mailbox.com", "892312314", 20000, 20);
        employeeArray[3] = new Employee("Fedorov Vasiliy", "Manager", "vasiliy@mailbox.com", "892312315", 40000, 40);
        employeeArray[4] = new Employee("Levakova Sofiya", "Owner", "sofiya@mailbox.com", "892312316", 100000, 50);
        for (Employee employee : employeeArray)
            System.out.println(employee);
        startPark ();
    }
    //1
       public static void makeNewEmployee()  {
           System.out.println("\n Задание 1 ");
           Employee petya = new Employee("Petya", "simple worker","mymail@mail.ru", "+79807666565", 2500, 35);
           System.out.println(petya);
    }
    //3
        public static void startPark() {
            System.out.println("\n Задание 3 ");
            Park park = new Park();
            Park.Attractions attractionFirst = new Park.Attractions("Аттракцион первый","9:00", 600);
            Park.Attractions attractionSecond = new Park.Attractions("Аттракцион второй","12:00", 1000);
            System.out.println(attractionFirst);
            System.out.println(attractionSecond);
        }}



