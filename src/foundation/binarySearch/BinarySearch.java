package foundation.binarySearch;

public class BinarySearch {
    /**
     * 二分查找基础版本
     *
     * @param a      - 待查找的升序数组
     * @param target -待查找的目标值
     * @return 找到则返回索引
     * 找不到返回 -1
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) { // 范围内还要
            int m = (i + j) / 2;
            if (target < a[m]) { // 目标在左边
                j = m - 1;
            } else if (target > a[m]) { // 目标在右边
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
