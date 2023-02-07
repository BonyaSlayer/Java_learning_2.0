public class Program {

  public static void main(String[] args) {
    
    int[] num = new int [] {1, 9, 9, 0, 2, 8, 0, 9};
    int count = 0;

    for (int i = 0; i < num.length; i++) {
      
      if (num[i] == 9 ) {
        
        count += 1;
        
      }  
      }
      System.out.println("Число 9 встречается в массиве  " + count + " раза");
    }
    
    
    
  }

