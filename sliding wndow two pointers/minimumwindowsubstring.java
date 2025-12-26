public class minimumwindowsubstring {
    public static void main(String[] args) {
         String s = "ADOBECODEBANC";
        String  t = "ABC";
        System.out.println(minWindow(s, t));
        
    }

     public static String minWindow(String s, String t) {
        //your code goes heref


        // Optimal approach

        int n=s.length();
        int m=t.length();
        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        int sind=-1;
        int count=0;

        int []hash=new int[256];
        for(char ch: t.toCharArray()){
            hash[ch]++;
        }



        while (r<n) {
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;

            while (count==m) {
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sind=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r=r+1;
        }


        // Brute force 

        // int n=s.length();
        // int m=t.length();

        // int minLen=Integer.MAX_VALUE;
        // int sIndex=-1;

        // for(int i=0;i<n;i++){
        //     int [] hash=new int[256];

        //     for(int j=0;j<m;j++){
        //         hash[t.charAt(j)]++;
        //     }

        //     int count=0;

        //     for(int j=i;j<n;j++){
        //         if(hash[s.charAt(j)]>0){
        //             count++;
        //         }
        //         hash[s.charAt(j)]--;

        //         if(count==m){
        //             if(j-i+1<minLen){
        //                 minLen=j-i+1;
        //                 sIndex=i;
        //             }
        //             break;
        //         }
        //     }


        // }

         return (sind==-1) ? "": s.substring(sind, sind+minlen);

          
    }
}
