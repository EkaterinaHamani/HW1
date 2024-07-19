public class Animals {
    static int countAnimal = 0;
    Animals(){
        countAnimal++;
    }

    void run (int range) {
        System.out.println("Animal have run " + range + " m");
    }

    void swim (int range){
        System.out.println("Animal have swam " + range + " m");
    }

    public static int getCountAnimal(){
        return countAnimal;
    }
}
