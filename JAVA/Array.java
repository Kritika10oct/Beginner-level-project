/*Write a program that display the sum ,product,and average of the elements of an integer array?*/
class pratice_String
{
    public static void main(String[] args){
       int[] numbers= {0,2,3,5,7};
       int sum=0;
       int product =1;
       double average;
       for(int i=0;i<numbers.length;i++){
           sum += numbers[i];
           product *= numbers[i];
       }
       average = (double)sum/numbers.length;  
       System.out.print( " Sum = " + sum + " Product = " + product + " Average = " + average );
    }
}
