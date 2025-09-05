import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionarray {

    
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        int[] output = new int[result.size()];
        int i = 0;
        for (int num : result) {
            output[i++] = num;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] inter = intersection(arr1, arr2);

        System.out.println("Intersection: " + Arrays.toString(inter));
    }
}
