/*
��������� ++
�Լ������ --
�������壺��һ��������һ������1��������һ��������һ������1
ʹ�ø�ʽ��д�ڱ�������֮ǰ������д�ڱ�������֮�����磺++num, num++
ʹ�÷�ʽ��
    1. ����ʹ�ã����������κβ�����ϣ��Լ�������Ϊһ������
    2. ���ʹ�ã�������������ϣ������븳ֵ��ϣ�����yu��ӡ������ϵ�
ʹ������
    1. �ڵ���ʹ�õ�ʱ�� ǰ++�ͺ�++û���κ�����Ҳ����++num��num++ ����ȫһ����
    2. �ٻ��ʹ�õ�ʱ���С��ش�����
        A. ���ʹ��ǰ++,��ô�����������ϼ�1,Ȼ�����Ž��ʹ��     ���ȼӺ��á�
        B. ���ʹ�ú�++,��ô����ʹ�ñ���ǰ����ֵ��Ȼ�����ñ�����1 �����ú�ӡ�
ע�����
    ֻ�б�������ʹ���������Լ�������š��������ɷ����ı䣬���Բ�����
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 10
        System.out.println(num++); // 10
        System.out.println(++num); // 12

//        �븳ֵ��ϲ���
        int num2 = 40;
        int num3 = --num2;
        System.out.println(num3); // 39
        System.out.println(num2); // 39


//        �븳ֵ��ϲ���
        int num4 = 40;
        int num5 = num4--;
        System.out.println(num5); // 40
        System.out.println(num2); // 39

        int x = 10;
        int y = 20;

        int result1 = ++x + y--; // ���Ƽ���������Ҫ����׶�
        System.out.println(result1); // 31
        System.out.println(x); // 11
        System.out.println(y); // 19

        30++; // ����д��������������ʹ��++����--

    }
}
