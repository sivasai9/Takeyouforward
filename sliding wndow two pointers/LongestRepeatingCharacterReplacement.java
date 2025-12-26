public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

       String s="AABAABBBAAA";
       int k=2;
       System.out.println(characterReplacement(s, k));

        
    }
    public static int characterReplacement(String s, int k) {
        // optimal

        int l=0;
        int r=0;
        int ans=0;
        int maxf=0;
        int n=s.length();
        int []hash=new int[26];

        while(r<n){
            hash[s.charAt(r)-'A']++;

            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);

            if((r-l+1)-maxf>k){

                hash[s.charAt(l)-'A']--;

                l++;

            }

            ans=Math.max(ans,r-l+1);

            r++;


        }

        return ans;

        //your code goes here
        // brute force
        // int ans=0;
        // int n=s.length();
        // int maxf=0;
        // for(int i=0;i<n;i++){
        //     int arr[]=new int[26];
            
        //     for(int j=i;j<n;j++){
        //         arr[s.charAt(j)-'A']++;

        //         maxf=Math.max(maxf,arr[s.charAt(j)-'A']);
        //         int changes=(j-i+1)-maxf;

        //         if(changes<=k){
        //             ans=Math.max(ans,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return ans;

        
        


    }
    
}
