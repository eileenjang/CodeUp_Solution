import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // Total length
        int[] sortArr = new int[n];
        
        Map<String, String> map = new HashMap<>(); // Store values and indices through HashMap

        String s = br.readLine();
        String[] tmp = s.split(" ");
        
        for (int i=0; i<n; i++) {
            sortArr[i] = Integer.valueOf(tmp[i]); // Store temp values
            map.put(tmp[i], "");
        }
        Arrays.sort(sortArr);
        
        for (int i=0; i<n; i++) {
            map.put(String.valueOf(sortArr[i]), String.valueOf(i)); // Store sortArr values and indices to map
        }
        
        for (String i: tmp) {
            System.out.print(map.get(i) + " ");
        }
        
        br.close();
    }
}
