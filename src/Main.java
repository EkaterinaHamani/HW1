import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
System.out.println("Задание 1");
String[] words = {"pizza", "spaghetti", "soup", "cake", "sandwich", "porridge", "omelette", "desert", "yogurt", "steak", "cake","cake","desert","desert","desert",};
    Set<String> uniqueWords = WordConditions.findUniqueWords(words);
    System.out.println("Уникальные слова:"+uniqueWords);

        Map<String,Integer> wordCases = WordConditions.countWordCases(words);
        System.out.println("Повторение слов:"+wordCases);

System.out.println("Задание 2");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", "123");
        phoneBook.add("Петров", "456");
        phoneBook.add("Иванов", "789");
        phoneBook.add("Сидоров", "000");

        System.out.println(phoneBook.get("Петров"));
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Сидоров"));

    }}
