package exercises;

import org.junit.jupiter.api.Test;

public class String2int {
    public int string2int(String s){
        int sum = 0;
        char preNum = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char curNum = s.charAt(i);
            System.out.println(getValue(preNum, curNum));
            sum += getValue(preNum,curNum);
            preNum = curNum;
        }
        sum += getValue(preNum,' ');
        System.out.println(sum);
        return sum;
    }

    public int getValue(char pre,char cur){
        switch(pre) {
            case 'I':
                return (cur == 'V' || cur == 'X' ? -1:1);
            case 'V':
                return 5;
            case 'X':
                return (cur == 'L' || cur == 'C' ? -10:10);
            case 'L':
                return 50;
            case 'C':
                return (cur == 'D' || cur == 'M' ? -100:100);
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return 0; 
        }
    }

    @Test
    public void test1(){
        string2int("MCMXCIV");
    }
}
