import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] sorted = new int[n];
        boolean loop = false; // boolean for checking status value

        int cnt = 0;
        for (int i=0; i<n; i++) {
            sorted[i] = Integer.parseInt(s.split(" ")[i]);
        }
        for (int i=0; i<n; i++) { // basic bubble sort
            for (int j=0; j<n-i-1; j++) {
                if (sorted[j] > sorted[j+1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                    loop = true; // change boolean from false to true after sorting
                }
            }
            if (loop == true) { // check the cnt of sort
                cnt++;
                loop = false;
            } else {
                break;
            }
        }
        System.out.print(cnt);
    }
}
