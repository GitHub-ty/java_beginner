/*
ʹ�ñ�����ʱ����Щע������
1. ������������������ô����֮������Ʋ������ظ�
2. ����float��long��˵���ַ���׺F��L��Ҫ����
3. ���ʹ��byte����short���͵ı������Ҳ������ֵ���ܳ���������ͷ�Χ
4. ����һ��Ҫ�ȸ�ֵ����ʹ��
5. �������ܳ���������ķ�Χ
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
//        int num1 = 20;
//        �ִ�����һ������������num1,������
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
