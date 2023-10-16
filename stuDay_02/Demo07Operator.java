/*
自增运算符 ++
自减运算符 --
基本含义：让一个变量涨一个数字1，或者让一个变量降一个数字1
使用格式：写在变量名称之前，或者写在变量名称之后。例如：++num, num++
使用方式：
    1. 单独使用：不和其他任何操作混合，自己独立成为一个步骤
    2. 混合使用：和其他操作混合，例如与赋值混合，或者yu打印操作混合等
使用区别：
    1. 在单独使用的时候 前++和后++没有任何区别。也就是++num、num++ 是完全一样的
    2. 再混合使用的时候有【重大区别】
        A. 如果使用前++,那么变量立刻马上加1,然后拿着结果使用     【先加后用】
        B. 如果使用后++,那么首先使用变量前的数值，然后再让变量加1 【先用后加】
注意事项：
    只有变量才能使用自增、自减运算符号。常量不可发生改变，所以不能用
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 10
        System.out.println(num++); // 10
        System.out.println(++num); // 12

//        与赋值混合操作
        int num2 = 40;
        int num3 = --num2;
        System.out.println(num3); // 39
        System.out.println(num2); // 39


//        与赋值混合操作
        int num4 = 40;
        int num5 = num4--;
        System.out.println(num5); // 40
        System.out.println(num2); // 39

        int x = 10;
        int y = 20;

        int result1 = ++x + y--; // 不推荐，代码需要简洁易懂
        System.out.println(result1); // 31
        System.out.println(x); // 11
        System.out.println(y); // 19

        30++; // 错误写法，常量不可以使用++或者--

    }
}
