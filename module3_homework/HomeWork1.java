package module3_homework;
/*
编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打 印出来。
 */
public class HomeWork1 {


    public static void main(String[] args) {
        String input="ABCD123!@#$%ab";
        int bigChar=0;
        int smallChar=0;
        int num=0;
        int elseChar=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)<='Z'&&input.charAt(i)>='A')
            {
                bigChar++;
            }
            else if(input.charAt(i)<='z'&&input.charAt(i)>='a')
            {
                smallChar++;
            }
            else if(input.charAt(i)<='9'&&input.charAt(i)>='0')
            {
                num++;
            }
            else
            {
                elseChar++;
            }

        }
        System.out.println("大写字母个数:"+bigChar);
        System.out.println("小写字母个数:"+smallChar);
        System.out.println("数字字母个数:"+num);
        System.out.println("其他字母个数:"+elseChar);

    }
}
