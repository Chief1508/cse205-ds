class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
       int missingCount = 0;
    int num = 1;

    while (true) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

        if (!found) {
            missingCount++;
            if (missingCount == k) {
                return num;
            }
        }

        num++;
    }

    }
}