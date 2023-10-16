/*
UniCode码表：万国码 也是数字和符号的对照表，开头0~127部分和ASCII完全一样，但是从127开始包含有更多字符
48——>0
65——>'A'
97——>'A'
 */
public class Demo04DataType {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0); // 49 字符’1‘的ASCII编码为49

        char zifu2 = 'A'; // 65
        System.out.println(zifu2 + 0); // 65


//        左侧是int类型，右边是char类型
//        char——>int 确实是从小达到， 发生数据类型转换
        char zifu3 = 'c';
        int num = zifu3;
        System.out.println(num); // 99

        char yang = '杨';
        char qing = '青';
        char mei = '梅';
        char tian = '田';
        char ye = '野';
        char ai = '爱';
        System.out.println(yang + qing + mei);
        System.out.println(tian + ye + ai + yang + qing + mei);
    }
}
