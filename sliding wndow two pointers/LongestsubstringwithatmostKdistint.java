import java.util.HashMap;

public class LongestsubstringwithatmostKdistint {
    public static void main(String[] args) {

        String str="aababbcaacc" ;
        int k=3;

        System.out.println(kDistinctChar(str, k));

        
    }
    public static int kDistinctChar(String s, int k) {
        //your code goes here
        int l=0;
        int r=0;
        int ans=0;
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        while (r<n) {
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r),0)+1);


            if(mp.size()>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);

                if(mp.get(s.charAt(l))==0){
                    mp.remove(s.charAt(l));

                }
                l++;
            }
            
            if(mp.size()<=k){
                ans=Math.max(ans,r-l+1);
            }
            r++;
        }

        return ans;

    }

    
}
