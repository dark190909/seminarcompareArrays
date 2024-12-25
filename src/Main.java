public class Main {
    public static void main(String[] args) {
        // Примеры с одинаковыми массивами
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array1, array2)); // true

        // Пример с разными массивами
        String[] array3 = {"Hello", "World"};
        String[] array4 = {"Hello", "Java"};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array3, array4)); // false

        // Пример с массивами разной длины
        Double[] array5 = {1.1, 2.2, 3.3};
        Double[] array6 = {1.1, 2.2};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array5, array6)); // false

        // Пример с массивами, содержащими null
        String[] array7 = {null, "test"};
        String[] array8 = {null, "test"};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array7, array8)); // true
    }
}
