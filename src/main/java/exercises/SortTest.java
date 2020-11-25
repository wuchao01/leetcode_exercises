package exercises;

public class SortTest {
    public static String sortString(String s){
        int[] back = new int[26];
        char[] charArray = s.toCharArray();
        //把传递过来的字符串转为char下标值0,1,2,3并循环读取
        //a的下标为97，c的第一位是97,相减为0，第二位是b，98，减完为1
        for (char c:charArray){
            back[c-'a']++;
        }

        char[] res = new char[s.length()];
        int index =0;
        while (index < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (back[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    back[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (back[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    back[i]--;
                }
            }
        }

        String str = new String(res);
        System.out.println(str);
        return str;
    }

    public static void main(String args[]){
        sortString("abccbaabccba");
    }
}
