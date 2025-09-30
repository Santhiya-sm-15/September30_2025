# September30_2025
The problem that I solved today

Given an integer n. You need to generate all the binary strings of n characters representing bits.

Note: Return the strings in  ascending order.

Code:
class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> res=new ArrayList<>();
        int pow=(int)Math.pow(2,n);
        for(int i=0;i<pow;i++)
        {
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            while(sb.length()<n)
                sb.insert(0,"0");
            res.add(sb.toString());
        }
        return res;
    }
}
