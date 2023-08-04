public class slip3b {
    public static boolean isArmstrong(int number)
    {
        int orignalnumber=number;
        int digits=String.valueOf(number).length();
        int sum=0;
        while(number>0)
        {
            int digit=number%10;
            sum+=Math.pow(digit,digits);
            number/=10;
        }
        return sum==orignalnumber;
    }
    public static void main(String[]args)
    {
        int number=153;
        if(isArmstrong(number))
        {
            System.out.println(number+"is armstrong");
        }
        else
        {
             System.out.println(number+"is not a armstrong");
        }
    }

}
