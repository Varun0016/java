package practice;

public class HeartPattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            for(int s=4;s>=i;s--){
                System.out.print("  ");
            }
            for(int m=1;m<=i;m++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for(int x=1;x<=10;x++) {
            for(int y=1;y<=x;y++){
                System.out.print(" ");
            }
            for(int z=10;z>=x;z--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
