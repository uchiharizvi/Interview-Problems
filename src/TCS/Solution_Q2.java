package TCS;

public class Solution_Q2 {
    public static void main(String[] args) {
        String a = "Hello World";
        int len = a.length()-1;
        char[] c = a.toCharArray();
        reverse(c,len);

    }
    static void reverse(char[] c, int len){
        if(len ==0) return;
        System.out.print(c[len]);
        len--;
        reverse(c,len);
    }
}
