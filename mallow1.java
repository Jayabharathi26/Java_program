import java.util.Arrays;
import java.util.Scanner;

public class TripletCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if (sum <= t) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(count);
        
        obj.close();
    }
}
