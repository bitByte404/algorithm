package foundation.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static foundation.binarySearch.BinarySearch.binarySearchBasic;

public class TestBinarySearch {
    @Test
    @DisplayName("测试 binarySearchBasic")
    public void test1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        Assertions.assertEquals(0, binarySearchBasic(a, 7));
        Assertions.assertEquals(1, binarySearchBasic(a, 13));
        Assertions.assertEquals(2, binarySearchBasic(a, 21));
        Assertions.assertEquals(3, binarySearchBasic(a, 30));
        Assertions.assertEquals(4, binarySearchBasic(a, 38));
        Assertions.assertEquals(5, binarySearchBasic(a, 44));
        Assertions.assertEquals(6, binarySearchBasic(a, 52));
        Assertions.assertEquals(7, binarySearchBasic(a, 53));

        Assertions.assertEquals(-1, binarySearchBasic(a, 0));
        Assertions.assertEquals(-1, binarySearchBasic(a, 15));
        Assertions.assertEquals(-1, binarySearchBasic(a, 60));
    }
}
