package linear;


public class Array {
    private int[] nums;
    private int currentIndex;

    public Array(int length) {
        nums = new int[length];
    }

    public void insert(int item) {
        if (currentIndex == nums.length) {
            int[] tempArray = new int[currentIndex + 2];
            copyFromOldToNew(nums, tempArray);
            nums = tempArray;
        }

        nums[currentIndex++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= currentIndex)
            throw new IllegalArgumentException("Index out of range");

        for (int i = index; i < currentIndex; ++i) {
            nums[i] = nums[i + 1];
        }

        --currentIndex;
    }

    public int indexOf(int searchItem) {

        for (int i = 0; i < currentIndex; ++i) {
            if (nums[i] == searchItem) return i;
        }

        return -1;
    }

    public int[] toArray() {
        int[] arr = new int[currentIndex];
        for (int i = 0; i < currentIndex; ++i) {
            arr[i] = nums[i];
        }

        return arr;
    }

    public void print() {
        for (int i = 0; i < currentIndex; ++i) {
            System.out.println(nums[i]);
        }
    }

    private void copyFromOldToNew(int[] oldArr, int[] newArr) {

        for (int i = 0; i < currentIndex; ++i) {
            newArr[i] = oldArr[i];
        }
    }
}