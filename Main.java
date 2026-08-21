

public class Main {

    public static  int getMinIndex(int[] values){
        int minValue=Integer.MAX_VALUE;
        int minIndex=-1;
      
        for(int i=0;i<values.length;i++){
            if(values[i]<minValue){
                minValue=values[i];
                minIndex=i;
    
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
                 System.out.println(“Hi”);
                System.out.println(“Bye”); 
       
    }
}
