package src.com.practice.simple.basic;

public class ReverseString {

    //https://javaconceptoftheday.com/java-program-to-reverse-a-string/
    public static void main(String[] args) {
        String str = "pravin";

        //1. Using StringBuffer or StringBuilder Class.
//        StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("1. Using reverse method of StringBuffer class: " + sb.reverse());


        // 2. Using iterative method.
        char[] charArray = str.toCharArray();
        System.out.print("2. Using iterative method: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();


        // 3. Using recursive method.
        System.out.println("3. Using recursive method " + recursiveMethod(str));
    }

    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
