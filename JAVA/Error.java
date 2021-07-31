{
    public static void main(String[] args) {
        //SYANTAX ERROR DEMO..
        //int a=0; Error: no semicolon
       // b=8; Error :b is not declared

        //LOGICAL ERROR DEMO..
        //write a program to print all prime number between 1 to 10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }
        //Runtime Error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Number divided by 1000 is:"+1000/k);
    }
}
