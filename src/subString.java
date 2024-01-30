import java.util.Scanner;

public class subString {

public static String sub_String(String str,int si,int en){
    String new_Str="";
    for (int i = si; i < en-1; i++) {
        new_Str+=str.charAt(i);
    }
    return new_Str;
}
    public static void main(String[] args) {
        String str="Hello world";
        Scanner sc=new Scanner(System.in);
        int si=sc.nextInt();
        int en=sc.nextInt();
//        System.out.println(sub_String(str,si,en));
        System.out.println(str.substring(si,en));
    }
}
