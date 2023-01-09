import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Student[] arr = new Student[n]; // Make student class array

        for (int i=0; i<n; i++) { // Fill array with values in for loop
            Student student = new Student();
            student.id = i + 1;
            student.math = scan.nextInt();
            student.science = scan.nextInt();
            arr[i] = student;
        }

        for (int i=arr.length-1; i>0; i++) { // Use bubble sort
            for (int j=0; j<i; j++) { // First standard is math score
                if (arr[j].math < arr[j+1].math) {
                    Student student = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = student;
                } else if (arr[j].math == arr[j+1].math) { // Second standard is science score
                    if (arr[j].science < arr[j+1].science) {
                        Student student = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = student;
                    } else if (arr[j].science == arr[j+1].science) { // Third standard is id
                        if (arr[j].id < arr[j + 1].id) {
                            Student student = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = student;
                        }
                    }
                }
            }
        }
        for (int i=0; i<n; i++) {
            System.out.printf("%d %d %d\n", arr[i].id, arr[i].math, arr[i].science);
        }

        br.close();
    }
}
