/*
四则运算中的加号'+',有常见的三种写法：
    1. 对于数值来说就是加法
    2. 对于字符char类型来说，在计算之前char会被提升为int 然后再去计算
    char类型字符 和int类型数字 之间的对照关系表：ASCII、UniCode
    3. 引用类型字符串String(首字母大写，并不是关键字)来说，加号代表字符串连接操作。
 */
public class Demo06OPlus {
    public static void main(String[] args) {
//        字符串类型的变量基本使用
//        数据类型 变量名称 = 数据值
        String str1 = "Hello";
        System.out.println(str1); // Hello

        System.out.println(str1 + "World"); // HelloWorld

        String str2 = "java";
//        String + int --> String
        System.out.println(str2 + 20); // java20

//        优先级问题
//        String + int + int --> String + int --> String
        System.out.println(str2 + 20 + 30); // java2030
        System.out.println(str2 + (20 + 30)); // java50
    }
}
