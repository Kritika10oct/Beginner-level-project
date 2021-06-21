/*Write a program which display the reverse of string?*/
class main{
    public static void main(String[] args) {
        String str = "some text";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }
}
