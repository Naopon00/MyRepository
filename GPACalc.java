import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double gpa = (s * 4.00 + a * 3.00 + b * 2.00 + c) / all;
        System.out.println("全単位数：" + all + "\nSの単位数：" + s + "\nAの単位数：" + a + "\nBの単位数：" + b + "\nCの単位数：" + c + "\nGPA：" + gpa);
    }
}
