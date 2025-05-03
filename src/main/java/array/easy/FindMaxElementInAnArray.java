package array.easy;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class FindMaxElementInAnArray {
  public int findMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    // Problem here. Even if array is empty or null it still returns INTEGER.MIN_VALUE which is an
    // un-expected behaviour.
    for (int num : arr) {
      if (num > max) max = num;
    }
    return max;
  }

  public int findMax_handle_null_or_empty_input(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Input array can not be null or empty");
    }
    int max = Integer.MIN_VALUE; // Problem = Redundant initialization leads to surprises
    for (int num : arr) {
      if (num > max) max = num;
    }
    return max;
  }

  public int findMax_handle_unexpected_op(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Input array can not be null or empty");
    }
    int max = arr[0]; // start with first element as max
    for (int num : arr) { // Problem : In earlier statement we are assigning sum to first element.
      // But again the loop starts from first element leading to an extra comparision.
      if (num > max) max = num;
    }
    return max;
  }

  public int findMax_remove_extra_comparison(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Input array can not be null or empty");
    }
    int max = arr[0]; // start with first element as max
    // change to traditional loop and start comparison from 2nd element at index 1 and skip first
    // element
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // When readability > performance -- traditional loops executes faster in case small arrays
  public int findMax_using_streamAPI(int[] arr) {
    return Arrays.stream(arr)
        .max()
        .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
  }

  // Useful for handling huge arrays with multi-core machines
  public int findMax_using_parallelStream(int[] arr) {
    return Arrays.stream(arr)
        .parallel()
        .max()
        .orElseThrow(() -> new IllegalArgumentException("Arrays is empty"));
  }

  // Using ApacheCommons lang
  public int findMax_usingApacheCommonsLang(int[] arr) {
    return NumberUtils.max(arr);
  }
}
