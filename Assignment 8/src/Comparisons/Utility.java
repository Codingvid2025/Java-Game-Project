package Comparisons;

import java.util.HashSet;

public class Utility {

    // Max method for Comparable type
    public static Comparable max(Comparable[] array) {
        if (array == null || array.length == 0) return null;
        Comparable max = array[0];
        for (Comparable obj : array) {
            if (obj.compareTo(max) > 0) {
                max = obj;
            }
        }
        return max;
    }

    // Min method for Comparable type
    public static Comparable min(Comparable[] array) {
        if (array == null || array.length == 0) return null;
        Comparable min = array[0];
        for (Comparable obj : array) {
            if (obj.compareTo(min) < 0) {
                min = obj;
            }
        }
        return min;
    }

    // Remove repetition method
    public static Comparable[] removeRepetition(Comparable[] array) {
        if (array == null || array.length == 0) return array;
        HashSet<Comparable> set = new HashSet<>();
        for (Comparable obj : array) {
            set.add(obj);
        }
        return set.toArray(new Comparable[0]);
    }

    // Max method for Object type
    public static Object max(Object[] array) {
        if (array == null || array.length == 0) return null;
        Object max = array[0];
        for (Object obj : array) {
            if (obj instanceof Comparable) {
                if (((Comparable) obj).compareTo(max) > 0) {
                    max = obj;
                }
            }
        }
        return max;
    }

    // Min method for Object type
    public static Object min(Object[] array) {
        if (array == null || array.length == 0) return null;
        Object min = array[0];
        for (Object obj : array) {
            if (obj instanceof Comparable) {
                if (((Comparable) obj).compareTo(min) < 0) {
                    min = obj;
                }
            }
        }
        return min;
    }
}

