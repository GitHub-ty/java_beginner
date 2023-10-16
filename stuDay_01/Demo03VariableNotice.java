/*
使用变量的时候有些注意事项
1. 如果创建多个变量，那么变量之间的名称不可以重复
2. 对于float和long来说，字符后缀F和L不要丢掉
3. 如果使用byte或者short类型的变量，右侧的数据值不能超过左侧类型范围
4. 变量一定要先赋值才能使用
5. 变量不能超过作用域的范围
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
//        int num1 = 20;
//        又创建了一个变量，名称num1,不允许
        {
            int num3 = 60;
            System.out.println(num3);
        }

        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 199, y = 200, z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
