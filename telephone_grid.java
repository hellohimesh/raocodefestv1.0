import java.util.*;   
  
   class main {  
    public static void getPermutations(int[] array){  
        helper(array, 0);  
    }  
  
    private static void helper(int[] array, int pos){  
        if(pos >= array.length - 1){   
            System.out.print("[");  
            for(int i = 0; i < array.length - 1; i++){  
                System.out.print(array[i] + ", ");  
            }  
            if(array.length > 0)   
                System.out.print(array[array.length - 1]);  
            System.out.println("]");  
            return;  
        }  
  
        for(int i = pos; i < array.length; i++){   
          
            int t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
  
            helper(array, pos+1);  
  
            t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
        }  
    }  
    public static void main(String args[]) {  
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers = new int[n];
        int j=1;
        for(int i=0;i<=n-1;i++)
        {
 numbers[i]=j;
 j++;
        }  
        getPermutations(numbers);  
    }  
}