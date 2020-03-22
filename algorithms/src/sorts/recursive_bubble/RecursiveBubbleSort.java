package sorts.recursive_bubble;

import sorts.Sort;

public class RecursiveBubbleSort implements Sort {
  public static void perform(int[] array, int position) {
    if (position == 1) {
      return;
    }

    for (int i = 0; i < position - 1; i++) {
      if (array[i] > array[i + 1]) {
        int swap_temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = swap_temp;
      }
    }

    perform(array, position - 1);
  }
}
