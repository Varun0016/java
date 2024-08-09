package practice;

public class HollowStar {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            for(int j=10;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                if (k == 1 || k == i ) {
                    System.out.print("* ");
                } else {
                System.out.print("  ");
            }
            
        }
        System.out.println();
        }
        for(int p=1;p<=10;p++) {
            for(int q=1;q<=p;q++) {
                System.out.print(" ");
            }
            for(int r=9;r>=p;r--) {
                if(r == 9 || r == p){
                    System.out.print(" *");
                    
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}