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
            for(int j=0;j<n-i-1;j++){
                System.out.print("    "); 
            }
            char ch = 'A';
            int breakPoint = (2*i +1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch + "   "); 
                if(j<=breakPoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        for(int i=0;i<n;i++){
        for(char ch=(char)('E'-i);ch<='E';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        }
    }
    public static void pattern19(int n){
        int spaces = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
        int spaces2 = 2*n -2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces2-=2;
            System.out.println();
        }
    }

    public static void pattern20(int n){
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars =i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -=2;
            else spaces+=2;
        }

    }
    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern22(int n) {
    for(int i=0; i<2*n-1; i++) {
        for(int j=0; j<2*n-1; j++) {
            int top = i;
            int left = j;
            int right = (2*n-2) - j;
            int bottom = (2*n-2) - i;
            int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n=5;
        System.out.println("Pattern 01:");
        pattern1(n);
        System.out.println("Pattern 02:");
        pattern2(n);
        System.out.println("Pattern 03:");
        pattern3(n);
        System.out.println("Pattern 04:");
        pattern4(n);
        System.out.println("Pattern 05:");
        pattern5(n);
        System.out.println("Pattern 06:");
        pattern6(n);
        System.out.println("Pattern 07:");
        pattern7(n);
        System.out.println("Pattern 08:");
        pattern8(n);
        System.out.println("Pattern 09:");
        pattern9(n);
        System.out.println("Pattern 10:");
        pattern10(n);
        System.out.println("Pattern 11:");
        pattern11(n);
        System.out.println("Pattern 12:");
        pattern12(n);
        System.out.println("Pattern 13:");
        pattern13(n);
        System.out.println("Pattern 14:");
        pattern14(n);
        System.out.println("Pattern 15:");
        pattern15(n);
        System.out.println("Pattern 16:");
        pattern16(n);
        System.out.println("Pattern 17:");
        pattern17(n);
        System.out.println("Pattern 18:");
        pattern18(n);
        System.out.println("Pattern 19:");
        pattern19(n);
        System.out.println("Pattern 20:");
        pattern20(n);
        System.out.println("Pattern 21:");
        pattern21(n);
        System.out.println("Pattern 22:");
        pattern22(n);
}
}
