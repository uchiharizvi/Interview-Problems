package TCS;

public class Solution_Q1 {
    public static void main(String[] args) {
        int arr[] = {9, 6, 3, 8, 5};
        int res[] = new int[2];
        int len = arr.length;
        res[0] = arr[0];
        res[1] = arr[1];
        for (int i = 2; i < len; i++) {
            if (res[0] > arr[i]) {
                if (res[1] != 0 && res[1] > arr[i]) {
                    res[0] = res[1];
                    res[1] = arr[i];
                } else {
                    res[0] = arr[i];
                }
            }
        }
        System.out.println("Lowest Value : " + res[1]);
        System.out.println("2nd Lowest Value : " + res[0]);
    }
}
