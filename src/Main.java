public class Main {

    public static void main(String[] args) {

String[] [] array = {{"0","0","0","0"},{"1","1","1","1"},{"2","2","2","2"},{"3","3","3","3"}};
try{
    int sum = ArrayConditions.sumAllArray(array);
    System.out.println("Сумма массива равна: "+ sum);
} catch (MyArraySizeException e) {
    System.out.println("Исключение для размера: " + e.getMessage());
} catch (MyArrayDataException e){
    System.out.println("Исключение для формата. " + e.getMessage());
}
}}



