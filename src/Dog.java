public class Dog extends Animals{
    String name;
    static int countDod = 0;

    Dog(String name){
        countDod++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println("Собака не может бежать больше, чем 500 метров.");
        } else {
            System.out.println(name+ " пробежал " + range + " метров.");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не может плыть больше, чем 10 метров.");
        } else {
            System.out.println(name + " проплыл " + range + " метров.");
        }
    }

    static int getCountDod (){
        return countDod;
    }
}
