package by.class3;

public class StringMain {
    public static void main(String[] args){
        StringClass str1 = new StringClass();
        System.out.println(str1.stroka("I like Java"));

        String str2 = "строкa";
        char a = str2.charAt(str2.length()-1);
        System.out.println(a);

        String str3 = "I like Java";
        String b = str3.substring(7,11);
        System.out.println(b);

    }
}
