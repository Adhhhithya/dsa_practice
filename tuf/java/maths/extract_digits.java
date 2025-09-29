public class extract_digits {
    public static void main(String[] args) {
        int n =7789;
        while(n>0){
            int last=n%10;
            System.out.println("Digit:"+last);
            n=n/10;
        }

    }
}