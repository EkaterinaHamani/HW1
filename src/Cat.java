public class Cat extends Animals{
    String name;
    static int countCat = 0;
    private int appetite;
    private int satiety;
    public boolean isHungry;


    static int getCountCat(){
        return countCat;
    }
    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite) {
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
        this.isHungry = false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    void eat(Bowl b) {
        b.decreaseFood(appetite);
        isHungry = true;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println("Кот не может бежать больше, чем 200 метров.");
        } else {
            System.out.println(name + " пробежал " + range + " метров.");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Коты не умеют плавать.");
    }

}
