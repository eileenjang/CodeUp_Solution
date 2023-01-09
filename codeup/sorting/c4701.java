import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        int gap = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = 0;

        int temp = 0;
        int sum = 0;
        while (i < j) { // Create a loop that satisfies the while statement until i becomes greater than j.

            sum = arr[i] + arr[j];
            temp = Math.abs(sum); // stores the absolute value of the length between two elements

            if (temp < gap) { // Compare whether it is greater or less than the absolute value calculated previously.

                gap = temp;
                ans1 = arr[i];
                ans2 = arr[j];
            }

            if (sum > 0) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(ans1 + " " + ans2);
        br.close();
    }
}
