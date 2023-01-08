import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Save time with BufferedReader instead of Scanner
 
        int n = Integer.parseInt(br.readLine());
        int[] m = new int[n];
        for (int i=0; i<n; i++) {
            m[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(m); // sort ascending; desc? Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            System.out.println(m[i]);
        }
    }
}
