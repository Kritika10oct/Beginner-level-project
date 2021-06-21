/*Write a program that reads the positive integer N from the user and display the following?
1
2 2
3 3 3
4 4 4 4

*/

import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
