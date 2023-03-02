import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        pattern31(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }


    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1 ; col <= n-row +1 ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1 ; col <= row  ; col++) {
                System.out.print(col);

            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        for (int row = 0; row <= 2*n ; row++) {
            int totalColsRow= row >n ? 2*n -row :row;
            for (int col = 0 ; col <= totalColsRow ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }


    static void pattern28(int n){
        for (int row = 0; row <= 2*n ; row++) {
            int totalColsRow= row > n ? 2*n -row :row;
            int NOfSpaces=n -totalColsRow;
            for (int i = 0; i <NOfSpaces ; i++) {
                System.out.print(" ");
                
            }
            for (int col = 0 ; col < totalColsRow ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }


    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n-row ; space++) {
                System.out.print(" ");
                
            }
            for (int col = row; col>=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col<=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }


    static void pattern17(int n){
        for (int row = 1; row <=2*n ; row++) {
            int c = row >n ? 2*n -row :row;
            for (int space = 0; space < n-c ; space++) {
                System.out.print(" ");

            }
            for (int col = c; col>=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col<=c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }



    static void pattern31(int n){
        int originalN = n;

        int a = 2*n -1;
        for (int row = 0; row <= a ; row++) {
            for (int col = 0; col <= a; col++) {
                int atEveryIndex = originalN -Math.min(Math.min(row,col),Math.min(a-row,a-col));
                System.out.print(atEveryIndex + " ");


            }
            System.out.println();

        }
    }






}
