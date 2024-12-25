import java.util.Objects;

public class ArrayUtils {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверяем, имеют ли массивы одинаковую длину
        if (array1.length != array2.length) {
            return false;
        }

        // Сравниваем элементы по индексам
        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }

        return true;
    }
}

