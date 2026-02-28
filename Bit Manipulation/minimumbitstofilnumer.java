public class minimumbitstofilnumer {
    public static void main(String[] args) {
        System.out.println(minBitsFlip(10, 7));
        
    }
      public static int minBitsFlip(int start, int goal) {

        int ans=start^goal;
        int cunt=0;
        while(ans!=0){
            cunt=cunt+(ans&1);
            ans=ans>>1;
        }
        return cunt;
    }
    
}
