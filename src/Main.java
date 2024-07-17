public class Main {
    public static void main(String[] args) {

        Cat vasiliy = new Cat("Василий", 10);
        Dog karat = new Dog("Карат");
        Cat murka = new Cat("Мурка", 20);
        Dog almaz = new Dog("Алмаз");
        vasiliy.run(150);
        murka.run(201);
        vasiliy.swim(1);

        karat.run(500);
        karat.run(501);
        almaz.swim(9);
        karat.swim(15);
        System.out.println("Всего животных: " + Animals.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDod());

        System.out.println("Задание про кормление котиков.");
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Соломон", 20);
        cats[1] = new Cat("Мурзик", 40);
        cats[2] = new Cat("Ася", 20);

        Bowl bowl = new Bowl(70);
        for (Cat i : cats) {
            if (i.getSatiety() == 0) {
                if (!bowl.checkFood(i.getAppetite())) {
                    System.out.println("Коту " + i.getName() + " не хватило еды и его сытость: " + i.isHungry() +" .");
                } else {
                    i.eat(bowl);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и его сытость: " + i.isHungry()+ " .");
                }
                System.out.println("В миске осталось " + bowl.getFood() + " граммов корма.");
            }
        }
        bowl.increaseFood();
        System.out.println("В миске осталось " + bowl.getFood() + " граммов корма.");
    }
}