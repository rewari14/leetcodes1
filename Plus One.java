public class Solution {
    public int[] plusOne(int[] digits) {
        
        int[] digit = new int[digits.length+1];
        int l = digits.length;
        int a=l-1;
        digits[digits.length-1] +=1;
        int c = 0;
        while(a>-1)
        {
            digits[a] += c;
            c=0;
            if(digits[a]>9)
            {
                c = digits[a]/10;
                digits[a] = digits[a]%10;
            }
            a--;
        }
        a=l-1;
        if(c>0)
        {
            while(a>0)  //transfer array to this...
            {
                digit[a+1] = digits[a];
                a--;
            }
            digit[a] = c;
            return digit;
        }
        else 
            return digits;
            
    }
}
