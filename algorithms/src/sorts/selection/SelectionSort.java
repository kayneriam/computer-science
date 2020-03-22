package sorts.selection;

import sorts.Sort;

public class SelectionSort implements Sort {
  public static void perform(int[] array) {
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
  }
}
