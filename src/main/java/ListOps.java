import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class ListOps {

    static <T> List<T> append(List<T> list1, List<T> list2) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static <T> List<T> concat(List<List<T>> listOfLists) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element: list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    static <T> int size(List<T> list) {
        int size = 0;
        for (T element: list) {
            size++;
        }
        return size;
    }

    static <T, U> List<U> map(List<T> list, Function<T, U> transform) {
        List<U> result = new ArrayList<>();
        for (T element: list) {
            U transformed = transform.apply(element);
            result.add(transformed);
        }
        return result;
    }

    static <T> List<T> reverse(List<T> list) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static <T, U> U foldLeft(List<T> list, U initial, BiFunction<U, T, U> f) {
        U result = initial;
        for (T element: list) {
            result = f.apply(result, element);
        }
        return result;
    }

    static <T, U> U foldRight(List<T> list, U initial, BiFunction<T, U, U> f) {
        U result = initial;
        for (int i = size(list) - 1; i >= 0; i--) {
            T element = list.get(i);
            result = f.apply(element, result);
        }
        return result;
    }

    private ListOps() {
        // No instances.
    }

}
