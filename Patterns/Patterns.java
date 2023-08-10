import java.util.*;
// Default Input : 5

class Pattern{

    /* ========= STAR PATTERNS ============ */

    // 1. First pattern

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void first(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 2. Second Pattern

    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void second(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 3. Third Pattern

    // * * * * *
    // * * * *
    // * * *
    // * *
    // * 

    public static void third(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=n-i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 4. Fourth Pattern

    //         * 
    //       * *
    //     * * *
    //   * * * *
    // * * * * *

    public static void fourth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 5. Fifth Pattern

    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         * 

    public static void fifth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<n-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 6. Sixth Pattern

    // * * * * *
    //     * * * *
    //         * * *
    //             * * 
    //                 * 

    public static void sixth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<n-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 7. Seventh Pattern

    //                 * 
    //             * * 
    //         * * *
    //     * * * *
    // * * * * *

    public static void seventh(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*(n-i-1);j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // 8. Eighth Pattern
        
    // * * * * * 
    // *       *
    // *       *
    // *       *
    // * * * * *

    public static void eighth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if( (j == 0 || j == n-1) || (i == 0 || i == n-1) ){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 9. Ninth Pattern

    // *       *
    //   *   *
    //     *
    //   *   *
    // *       *

    public static void ninth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j == i || j == n-i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 10. Tenth pattern

    //         *
    //       * * * 
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *

    public static void tenth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("* ");
            }
            for(int p = 0;p<i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 11. Eleventh Pattern

    // * * * * * * * * *
    //   * * * * * * * 
    //     * * * * *
    //       * * *
    //         *

    public static void eleventh(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<n-i;k++){
                System.out.print("* ");
            }
            for(int p = 0;p<n-i-1;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 12. Twelveth Pattern

    //         *
    //       * ! *
    //     * ! * ! *
    //   * ! * ! * ! *
    // * ! * ! * ! * ! *

    public static void twelveth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                if( k%2 == 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
            }
            for(int p = 0;p<i;p++){
                if((i%2 == 0 && p%2 != 0) || (i%2 != 0 && p%2 == 0)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
            }
            System.out.println();
        }
    }

    // 13. Thirteenth Pattern

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    public static void thirteenth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int k = 0;k<n-i-1;k++){
                System.out.print("* ");
            }
            if(i < n-1){
                System.out.println();
            }
        }
    }

    // 14. Fourteenth pattern

    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *

    public static void fourteenth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<n-i-1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }        
    }

    // 15. Fifteenth pattern

    // * * * * *       
    //     * * * *     
    //         * * *   
    //             * * 
    //                 *
    //             * *
    //         * * *
    //     * * * *
    // * * * * *

    public static void fifteenth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<n-i;k++){
                System.out.print("* ");
            }
            if(i == n-1){
                System.out.print("");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*(n-i-1);j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                if(i == 0){
                    break;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }        
    }

    // 16. Sixteenth pattern

    //     *
    //   * * *
    // * * * * *
    //   * * *
    //     *

    public static void sixteenth(int n){
        int val = (n+1)/2;
        for(int i = 0;i<val;i++){
            for(int j = 0;j<val-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("* ");
            }
            for(int p = 0;p<i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1;i<val;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<val-i;k++){
                System.out.print("* ");
            }
            for(int p = 0;p<val-i-1;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 17. Seventeenth pattern - DOUBT

    // * * * * *
    // * *   * *
    // *       *
    // * *   * *
    // * * * * *

    public static void seventeenth(int n){
        int val = (n+1)/2;

        for(int i = 0;i<val;i++){
            for(int j = 0;j<val-i;j++){
                System.out.print("* ");
            }
            for(int k = 0;k<2*i;k++){
                System.out.print("  ");
            }
            for(int p = 0;p<val-i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 18. Eighteenth pattern

    //     *  
    //     *
    // * * * * *
    //     *
    //     *

    public static void eighteenth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int mid = (n)/2;
                if(i == mid || j == mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 19. Nineteeth pattern  - Doubt

    //         *
    //       *   *
    //     *       *
    //   *           *
    //     *       *
    //       *   *
    //         *

    public static void nineteeth(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if( (i == 0 && j == (n-1)/2) || (i == 0 && j == (n-1)/2) ){
                    System.out.print("* ");
                }
                else if( (i%2 != 0 && j%2 == 0 && j != 0 && j != n-1) || (i%2 == 0 && j%2 != 0 && j!=0 && j != n-1) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 20. Twenty pattern

    // *               *
    // * *           * *
    // * * *       * * *
    // * * * *   * * * *
    // * * * * * * * * *
    

    public static void twenty(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                if(i == n-1 && j == i){
                    break;
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k = 0;k<=2*(n-i-2);k++){
                System.out.print("  ");
            }
            for(int q = 0;q<i+1;q++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 21. TwentyOne pattern

    // * * * * * * * * *
    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *

    public static void twentyone(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                if(i == 0 && j == n-1){
                    break;
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k = 0;k<=2*(i-1);k++){
                System.out.print("  ");
            }
            for(int p = 0;p<n-i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /* ========= NUMBER PATTERNS ============ */

    // 1. number1

    // 1 1 1 1 1
    // 2 2 2 2 2
    // 3 3 3 3 3
    // 4 4 4 4 4
    // 5 5 5 5 5

    public static void number1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // 2. number2

    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5

    public static void number2(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 3. number3

    // 1  2  3  4  5
    // 6  7  8  9  10
    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 23 24 25

    public static void number3(int n){
        int val = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(val > 9){
                    System.out.print(val+" ");
                }
                else{
                    System.out.print(val+"  ");
                }
                val++;
            }
            System.out.println();
        }
    }

    // 4. number4

    // 1
    // 2  3
    // 4  5  6 
    // 7  8  9  10
    // 11 12 13 14 15

    public static void number4(int n){
        int val = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(val > 9){
                    System.out.print(val+" ");
                }
                else{
                     System.out.print(val+"  ");
                }
                val++;
            }
            System.out.println();
        }
    }

    // 5. number5

    // 1
    // 2 3
    // 3 4 5 
    // 4 5 6 7
    // 5 6 7 8 9
    

    public static void number5(int n){
        for(int i = 1;i<=n;i++){
            int val = i;
            for(int j = 1;j<=i;j++){
                if(val < 9){
                    System.out.print(val+"  ");
                }
                else{
                    System.out.print(val+" ");
                }

                val++;
            }
            System.out.println();
        }
    }
    
    // 6. number6

    // 1
    // 2 1
    // 3 2 1 
    // 4 3 2 1
    // 5 4 3 2 1

    public static void number6(int n){
        for(int i = 1;i<=n;i++){
            int val = i;
            for(int j = 1;j<=i;j++){
                if(val < 9){
                    System.out.print(val+"  ");
                }
                else{
                    System.out.print(val+" ");
                }

                val--;
            }
            System.out.println();
        }
    }

    // 7. number7

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static int convert(boolean value){
        if(value){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void number7(int n){
        boolean flag = true;
        for(int i = 1;i<=n;i++){
            boolean flag1 = flag;

            for(int j = 1;j<=i;j++){    
                int val = convert(flag1);
                System.out.print(val+" ");
                flag1 = !flag1;
            }

            flag = !flag;
            System.out.println();
        }
    }
    
    // 8. number8

    //         1
    //       1 2 3
    //     1 2 3 4 5   
    //   1 2 3 4 5 6 7
    // 1 2 3 4 5 6 7 8 9

    public static void number8(int n){
        for(int i = 0;i<n;i++){
            int val = 1;
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print(val+" ");
                val++;
            }
            for(int m = 0;m<i;m++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }

    // 9. number9

    //         1       
    //       1 2 1     
    //     1 2 3 2 1   
    //   1 2 3 4 3 2 1 
    // 1 2 3 4 5 4 3 2 1

    public static void number9(int n){
        for(int i = 0;i<n;i++){
            int val = 1;
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print(val+" ");
                val++;
            }
            val = val -2;
            for(int m = 0;m<i;m++){
                System.out.print(val+" ");
                val--;
            }
            System.out.println();
        }
    }

    // 10. number10

    //         1       
    //       2 3 2     
    //     3 4 5 4 3   
    //   4 5 6 7 6 5 4 
    // 5 6 7 8 9 8 7 6 5

    public static void number10(int n){
        for(int i = 0;i<n;i++){
            int val = i+1;
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print(val+" ");
                val++;
            }
            val = val -2;
            for(int m = 0;m<i;m++){
                System.out.print(val+" ");
                val--;
            }
            System.out.println();
        }
    }

    // 11. number11

    //         1       
    //       2 0 2     
    //     3 0 0 0 3   
    //   4 0 0 0 0 0 4 
    // 5 0 0 0 0 0 0 0 5

    public static void number11(int n){
        for(int i = 0;i<n;i++){
            int val = i+1;
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print(val+" ");
                val = 0;
            }
            val = i+1;
            for(int m = 0;m<i;m++){
                if(m == i-1){
                    System.out.print(val+" ");
                    val = 0;
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    // 12. number12

    // 5 4 3 2 1 
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1 
    // 5 4 3 2 1

    private static void number12(int n){
        for(int i = 0;i<n;i++){
            int val = n;
            for(int j = 0;j<n;j++){
                System.out.print(val+" ");
                val--;
            }
            System.out.println();
        }
    }

    // 13. number3

    // 5 4 3 2 * 
    // 5 4 3 * 2
    // 5 4 * 3 2
    // 5 * 4 3 2
    // * 5 4 3 2

    private static void number13(int n){
        for(int i = 1;i<=n;i++){
            int a = i;
            int val = n;
            for(int j = 1;j<=n;j++){
                if(i == a && j == n-a+1){
                    System.out.print("* ");
                    a++;
                }

                else{
                    System.out.print(val+" ");
                    val--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /* ============= Star Patterns =============== */

        // First pattern
        // first(n);

        // Second pattern
        // second(n);

        // Third pattern
        // third(n);

        // Fourth Pattern
        // fourth(n);

        // Fifth Pattern
        // fifth(n);

        // Sixth Pattern
        // sixth(n);

        // Seventh Pattern
        // seventh(n);

        // Eighth pattern
        // eighth(n);

        // Ninth pattern
        // ninth(n);

        // Tenth pattern
        // tenth(n);

        // Eleventh pattern
        // eleventh(n);

        // Twelveth pattern
        // twelveth(n);

        // Thirteenth pattern
        // thirteenth(n);

        // Fourteenth pattern
        // fourteenth(n);

        // Fifteenth pattern
        // fifteenth(n);

        // Sixteenth pattern
        // sixteenth(n);

        // Seventeenth pattern
        // seventeenth(n);

        // Eighteenth pattern
        // eighteenth(n);

        // Nineteeth pattern
        // nineteeth(n);

        // Twenty pattern
        // twenty(n);

        // TwentyOne pattern
        // twentyone(n);

        /* ============= Number Patterns =============== */

        // number1(n);

        // number2(n);

        // number3(n);

        // number4(n);

        // number5(n);

        // number6(n);

        // number7(n);

        // number8(n);

        // number9(n);

        // number10(n);

        // number11(n);

        // number12(n);

        // number13(n);
    }
}
