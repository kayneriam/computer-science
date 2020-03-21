package sorts.selection;

// O(n^2)
public class SelectionSort {
  public static int[] perform(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      int minimum = i;
      for(int j = i+1; j < array.length; j++) {
        if (array[j] < array[minimum]) {
          minimum = j;
        }
      }

      int swap_temp = array[minimum];
      array[minimum] = array[i];
      array[i] = swap_temp;
    }

    return array;
  }
}