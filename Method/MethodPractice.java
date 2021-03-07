
package Method;


public class MethodPractice {
    
    public static void main(String[] args) {
        
        int A[] = {2,4,6,8,10};
        //A[4] = 40;
             
       
        
        for (int x : A) {
            System.out.println(x);
        }
        
    }
    
     static void change(int A[], int index, int value)
    {
   
        A[index] = value;
        
    }
             
}
