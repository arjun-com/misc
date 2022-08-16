import java.util.Scanner;

public class ProgramThree {
    public static String[] bubbleSort(String[] arr) {  
        int n = arr.length;  
        String temp = "";  
        
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < (n - i); j++){  
                if((arr[j - 1]).charAt(0) > (arr[j]).charAt(0)){  
                    temp = arr[j - 1];  
                    arr[j - 1] = arr[j];  
                    arr[j] = temp;
                }  
                          
            }
        }
        
        return arr;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        String names[] = new String[10];
        
        for(int i = 0; i < 10; i++) names[i] = sc.nextLine();
        
        String res[] = bubbleSort(names);
        
        for(int i = 10;i > 0; i--) System.out.println(res[i - 1]);
    }
}