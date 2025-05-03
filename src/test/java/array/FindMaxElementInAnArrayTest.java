package array;

import array.easy.FindMaxElementInAnArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxElementInAnArrayTest {

    FindMaxElementInAnArray findMaxElementInAnArray;

    @BeforeEach
    void setUp() {
        findMaxElementInAnArray = new FindMaxElementInAnArray();
    }

    @Test
    void testNormalArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, findMaxElementInAnArray.findMax_remove_extra_comparison(arr));
    }

    @Test
    void testNegativeValues() {
        int[] arr = {-10, -5, -2, -30};
        assertEquals(-2, findMaxElementInAnArray.findMax_remove_extra_comparison(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        assertEquals(42, findMaxElementInAnArray.findMax_remove_extra_comparison(arr));
    }

    @Test
    void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            findMaxElementInAnArray.findMax_remove_extra_comparison(null);
        });
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            findMaxElementInAnArray.findMax_remove_extra_comparison(new int[0]);
        });
    }
}
