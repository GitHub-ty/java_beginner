/*
���������еļӺ�'+',�г���������д����
    1. ������ֵ��˵���Ǽӷ�
    2. �����ַ�char������˵���ڼ���֮ǰchar�ᱻ����Ϊint Ȼ����ȥ����
    char�����ַ� ��int�������� ֮��Ķ��չ�ϵ��ASCII��UniCode
    3. ���������ַ���String(����ĸ��д�������ǹؼ���)��˵���ӺŴ����ַ������Ӳ�����
 */
public class Demo06OPlus {
    public static void main(String[] args) {
//        �ַ������͵ı�������ʹ��
//        �������� �������� = ����ֵ
        String str1 = "Hello";
        System.out.println(str1); // Hello

        System.out.println(str1 + "World"); // HelloWorld

        String str2 = "java";
//        String + int --> String
        System.out.println(str2 + 20); // java20

//        ���ȼ�����
//        String + int + int --> String + int --> String
        System.out.println(str2 + 20 + 30); // java2030
        System.out.println(str2 + (20 + 30)); // java50
    }
}
