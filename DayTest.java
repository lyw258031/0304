import java.util.Scanner;
class DayTest
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入2014年的月份(month)：");
        int month=s.nextInt();
        System.out.println("请输入2014年"+month+"月的天数(day)：");
        int day=s.nextInt();

        int sum=0;//计算总天数
        switch(month){
            case 12:
                sum+=30;//第11月份的天数
            case 11:
                sum+=31;
            case 10:
                sum+=30;
            case 9:
                sum+=31;
            case 8:
                sum+=31;
            case 7:
                sum+=30;
            case 6:
                sum+=31;
            case 5:
                sum+=30;
            case 4:
                sum+=31;
            case 3:
                //sum+=28;//判断是否是闰年
                if(2014%4==0&&2014%400==0&&2014%100!=0){
                    sum+=29;
                }else{
                    sum+=28;}
            case 2:
                sum+=31;//一月份的天数
            case 1:
                sum+=day;
                break;}
        System.out.println("输入日期为2014年的第"+sum+"天");
    }
}

