/*
UniCode�������� Ҳ�����ֺͷ��ŵĶ��ձ���ͷ0~127���ֺ�ASCII��ȫһ�������Ǵ�127��ʼ�����и����ַ�
48����>0
65����>'A'
97����>'A'
 */
public class Demo04DataType {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0); // 49 �ַ���1����ASCII����Ϊ49

        char zifu2 = 'A'; // 65
        System.out.println(zifu2 + 0); // 65


//        �����int���ͣ��ұ���char����
//        char����>int ȷʵ�Ǵ�С�ﵽ�� ������������ת��
        char zifu3 = 'c';
        int num = zifu3;
        System.out.println(num); // 99

        char yang = '��';
        char qing = '��';
        char mei = '÷';
        char tian = '��';
        char ye = 'Ұ';
        char ai = '��';
        System.out.println(yang + qing + mei);
        System.out.println(tian + ye + ai + yang + qing + mei);
    }
}
