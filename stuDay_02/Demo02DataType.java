/*
当数据类型不一样时发生数据类型转换
自动类型转换（隐式）
    1. 特点：不需要特殊处理 自动完成
    2. 规则：数据范围从小打到
强制类型转换（显式）
    1. 特点：代码需要进行特殊的格式处理 不能自动完成
    2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本数据大的数据
 */
public class Demo02DataType {
    public static void main(String[] args) {
//        int num = 100L; //  错误: 不兼容的类型: 从long转换到int可能会有损失
//        long —> int 不符合从小到大，不能发生自动类型转换
//        走强制类型转换
//        范围小的类型 范围小的变量名 = (范围小的类型) 原本数据大的数据
//        System.out.println(num);


        int num1 = (int) 100L; //  错误: 不兼容的类型: 从long转换到int可能会有损失
        System.out.println(num1); // 100
    }
}
