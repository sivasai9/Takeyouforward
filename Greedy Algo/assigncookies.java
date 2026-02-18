import java.util.Arrays;

public class assigncookies {
    public static void main(String[] args) {
        int []students={1,2,3};
        int []coo={1,1};
        System.out.println(findMaximumCookieStudents(students, coo));
        
    }
    public static int findMaximumCookieStudents(int[] Student, int[] Cookie) {

        int n=Student.length;
        int m=Cookie.length;

        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int l=0;
        int r=0;

        while(l<n && r<m){

            if(Student[l]<=Cookie[r]){
                l++;
            }
            r++;
        }
        return l;
    
}
}
