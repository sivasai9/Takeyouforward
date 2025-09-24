public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char ch[]={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(ch, target));

    }
     public static char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;

        while (low<=high) {
            int mid=(low+high)/2;
            if(letters[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return letters[low];
        
    }
    
}
