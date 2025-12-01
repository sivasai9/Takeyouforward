public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String  S = "abcddabac";
        System.out.println(longestNonRepeatingSubstring(S));
        
    }
     public static int longestNonRepeatingSubstring(String s) {
        //your code goes here
        int n=s.length();
        int mxLen=0;

        for(int i=0;i<n;i++){

          int arr[]=new int[26];
           
          for(int j=i;j<n;j++){
            if(arr[s.charAt(j)-'a']==1) break;

            arr[s.charAt(j)-'a']=1;

            int len=j-i+1;

            mxLen=Math.max(mxLen,len);

          }

        }
        return mxLen;
    }
    
}
