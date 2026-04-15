
public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int result = firstUniqChar(s);
        System.out.println("Index of first unique character: " + result);
    }
    public static int firstUniqChar(String s) {
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}