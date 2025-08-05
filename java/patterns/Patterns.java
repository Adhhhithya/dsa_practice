public class Patterns {
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n -(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        pattern7(n);
        pattern8(n);

    }

    public static void pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars =2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for(int i=1;i<=n;i++){
            int start = i % 2;  
            for(int j=1;j<=i;j++){
                System.out.print(start + " ");
                start = 1 - start;  
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    public static void pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+n-i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i))+ " ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int i=0;i<n;i++){
            // Print leading spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("    "); // Added more spaces for proper alignment
            }
            
            // Print characters with proper spacing
            char ch = 'A';
            int breakPoint = (2*i +1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch + "   "); // Added more spaces between characters
                if(j<=breakPoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Pattern 17:");
        pattern17(n);
}
}
