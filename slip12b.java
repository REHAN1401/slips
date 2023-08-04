public class slip12b {
    public static void main(String[] args) {
        String[] stringArray = { "hello", "rehan" };
        System.out.println("orignal array");
        displayStringArray(stringArray);

        System.out.println("REVERSED array");
        reverseDisplayStringArray(stringArray);

    }

    private static void displayStringArray(String[] array) {
        for (String str : array) {
            System.out.println(str + " ");
        }
    }

    private static void reverseDisplayStringArray(String[] array)
    {
        for(String str: array)
        {
            String reverseStr = reverseString(str);
             System.out.println(reverseStr + " ");
        }
    }





























    

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1 ; i >= 0; i--){ 
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}