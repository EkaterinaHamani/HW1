import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        makeNewEmployee();
        System.out.println("Задание 2 ");
        Person.createArray();
        startPark ();

    }
    //1
       public static void makeNewEmployee()  {
           System.out.println("Задание 1 ");
           Employee Petya = new Employee("Petya", "simple worker","mymail@mail.ru", "+79807666565", 2500, 35);
           Petya.showInfo();
    }
    //3
        public static void startPark() {
            System.out.println("Задание 3 ");
            Park park = new Park();
            Park.Attractions attractionFirst = new Park.Attractions("Аттракцион первый","9:00", 600);
            Park.Attractions attractionSecond = new Park.Attractions("Аттракцион второй","12:00", 1000);
            System.out.println("Название: " + attractionFirst.getName());
            System.out.println("Часы работы: " + attractionFirst.getTime());
            System.out.println("Стоимость: " + attractionFirst.getCost());
        }
    }






