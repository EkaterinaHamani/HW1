public class ArrayConditions {
    public static int sumAllArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4*4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4*4");
            }
                }
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                try{
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверный формат обнаружен на позиции: ("+i+"," + j+")");}
                }
            }
            return sum;
        }
    }
