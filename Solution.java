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
