class Solution {
    public int compress(char[] chars) {
        int write=0;
        for(int i=0;i<=chars.length-1;i++){
            char store=chars[i];
            int count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                i++;
                count++;
            }
            chars[write++] = store;
            if (count > 1) {
            String num = count + "";
            for (int j = 0; j < num.length(); j++) {
            chars[write++] = num.charAt(j);
            }
            }
        }
        return write;
    }
}