/*
+ - * / %
注意事项：
    1.  一旦运算当中有不同类型的数据，那么结果将会是数据范围中大的那种
 */
public class Demo05Operator {
    public static void main(String[] args) {
        System.out.println(20 + 30); // 50
        System.out.println(20 - 30); // -10

        int a = 2;
        System.out.println(a * 2); // 4

        int x = 10;
        int y = 3;
        System.out.println(x / y); // 3
        System.out.println(x * y); // 30
        System.out.println(x % y); // 1

//        int + double --> double

        double double1 = x % y + 2.5;
        System.out.println(double1); // 3.5
    }
}
