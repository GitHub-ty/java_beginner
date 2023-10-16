/*
数据类型转换 注意事项
    1. 强制类型转换不推荐使用 因为可能发生精度损失、数据溢出
    2. byte,short,char这三种类型都可以发生数学运算，例如加法’+‘
    2. byte,short,char这三种类型在发生数学运算的时候都会被提升为int类型，然后在计算
    4. boolean类型不能发生数据类型转换
 */
public class Demo03DataType {
    public static void main(String[] args) {
//        int num = 6000000000; // 错误: 过大的整数: 6000000000
//        System.out.println(num);

//        long强制换位为int类型 数据损失
        int num = (int) 6000000000L; // 错误: 过大的整数: 6000000000
        System.out.println(num); // 1705032704  数据溢出

//        double变成int类型
        int num1 = (int) 3.99;
        System.out.println(num1); // 3 精度损失

        char zifu1 = 'A'; //这是一个字符型变量，里面是'A'
        System.out.println(zifu1 + 1);// 66 ASCII编码
//        计算机的底层会用一个数字（二进制）来代表字符A 就是65
//        一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成为一个数字

        byte num2 = 40;
        byte num3 = 50;
//        byte num4 = num2 + num3;
//        System.out.println(num4); // 从int转换到byte可能会有损失

//        byte + byte ——> int + int = int
        int num4 = num2 + num3;
        System.out.println(num4); // 90

        short num5 = 60;
        int num6 = num5 + num2;
//        System.out.println(num6); // 100

//        short num7 = num5 + num2; //  从int转换到short可能会有损失
//        int强制转换为short
        short num8 = (short) (num5 + num3);
        System.out.println(num8); // 110
    }
}
