/*
��������ת�� ע������
    1. ǿ������ת�����Ƽ�ʹ�� ��Ϊ���ܷ���������ʧ���������
    2. byte,short,char���������Ͷ����Է�����ѧ���㣬����ӷ���+��
    2. byte,short,char�����������ڷ�����ѧ�����ʱ�򶼻ᱻ����Ϊint���ͣ�Ȼ���ڼ���
    4. boolean���Ͳ��ܷ�����������ת��
 */
public class Demo03DataType {
    public static void main(String[] args) {
//        int num = 6000000000; // ����: ���������: 6000000000
//        System.out.println(num);

//        longǿ�ƻ�λΪint���� ������ʧ
        int num = (int) 6000000000L; // ����: ���������: 6000000000
        System.out.println(num); // 1705032704  �������

//        double���int����
        int num1 = (int) 3.99;
        System.out.println(num1); // 3 ������ʧ

        char zifu1 = 'A'; //����һ���ַ��ͱ�����������'A'
        System.out.println(zifu1 + 1);// 66 ASCII����
//        ������ĵײ����һ�����֣������ƣ��������ַ�A ����65
//        һ��char���ͽ�������ѧ���㣬��ô�ַ��ͻᰴ��һ���Ĺ������Ϊһ������

        byte num2 = 40;
        byte num3 = 50;
//        byte num4 = num2 + num3;
//        System.out.println(num4); // ��intת����byte���ܻ�����ʧ

//        byte + byte ����> int + int = int
        int num4 = num2 + num3;
        System.out.println(num4); // 90

        short num5 = 60;
        int num6 = num5 + num2;
//        System.out.println(num6); // 100

//        short num7 = num5 + num2; //  ��intת����short���ܻ�����ʧ
//        intǿ��ת��Ϊshort
        short num8 = (short) (num5 + num3);
        System.out.println(num8); // 110
    }
}
