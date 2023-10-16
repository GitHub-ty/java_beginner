/*
当数据类型不一样时发生数据类型转换
自动类型转换（隐式）
    1. 特点：不需要特殊处理 自动完成
    2. 规则：数据范围从小打到

强制类型转换（显式）
 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024); // int
        System.out.println(3.14); // double

//        int ——> long 符合数据范围从小到大，发生自动类型转换
        long num1 = 100L;
        System.out.println(num1);

//        float——>dounle 符合自动转换
        double num2 = 2.5F;
        System.out.println(num2);

//        dounle——>float 符合自动转换
        float num3 = 30L;
        System.out.println(num3); // 30.0

    }
}
