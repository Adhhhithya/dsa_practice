import java.util.*;
public class assign_cookies {
    public static int max_students_assigned_with_cookies(int students[],int cookies[]){
        int n = students.length;
        int m = cookies.length;
        int l=0,r=0;
        Arrays.sort(students);
        Arrays.sort(cookies);

        while(l<m && r<n){
            if(students[r]<=cookies[l]){
                r++;
            }
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int n = sc.nextInt();
        int students[] = new int[n];
        System.out.println("Enter the greed factor of each student :");
        for(int i=0;i<n;i++){
            students[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cookies :");
        int m = sc.nextInt();
        int cookies[] = new int[m];
        System.out.println("Enter the size of each cookie :");
        for(int i=0;i<m;i++){
            cookies[i] = sc.nextInt();
        }
        System.out.println("The maximum number of students that can be assigned with cookies is :");
        System.out.println(max_students_assigned_with_cookies(students,cookies));
        sc.close();
    }
}
