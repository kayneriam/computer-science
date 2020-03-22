package sorts.bubble;

import sorts.Sort;

public class BubbleSort implements Sort {
  public static void perform(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j+1]) {
          int swap_temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = swap_temp;
        }
      }
    }
  }
}
