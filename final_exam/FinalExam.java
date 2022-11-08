public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'X', 'X', 'R', 'T', 'E', 'S', 'C', 'E', 'B', 'F', 'I', 'O', 'O', 'S', 'U' },
                { 'L', 'I', 'J', 'G', 'I', 'A', 'Z', 'F', 'R', 'T', 'F', 'H', 'F', 'W', 'W' },
                { 'L', 'L', 'N', 'F', 'U', 'H', 'M', 'I', 'O', 'E', 'N', 'R', 'H', 'D', 'E' },
                { 'U', 'W', 'O', 'S', 'Q', 'B', 'D', 'W', 'S', 'P', 'Q', 'Y', 'R', 'D', 'P' },
                { 'Z', 'U', 'R', 'Q', 'T', 'A', 'V', 'K', 'N', 'Y', 'F', 'L', 'C', 'O', 'S' },
                { 'A', 'J', 'B', 'C', 'Y', 'A', 'H', 'V', 'O', 'H', 'R', 'P', 'T', 'S', 'T' },
                { 'P', 'L', 'L', 'Z', 'P', 'J', 'G', 'B', 'F', 'Q', 'F', 'L', 'V', 'P', 'A' },
                { 'F', 'I', 'I', 'A', 'P', 'U', 'J', 'R', 'L', 'V', 'L', 'L', 'P', 'H', 'R' },
                { 'V', 'T', 'Z', 'N', 'I', 'K', 'U', 'C', 'A', 'I', 'B', 'Q', 'Q', 'Q', 'B' },
                { 'U', 'U', 'Q', 'Z', 'A', 'J', 'M', 'J', 'H', 'M', 'U', 'J', 'M', 'J', 'U' },
                { 'N', 'E', 'L', 'H', 'A', 'M', 'W', 'C', 'F', 'C', 'W', 'U', 'W', 'Z', 'C' },
                { 'G', 'S', 'N', 'P', 'D', 'I', 'M', 'Q', 'X', 'J', 'D', 'A', 'P', 'Z', 'K' },
                { 'C', 'D', 'S', 'K', 'C', 'U', 'Y', 'C', 'O', 'L', 'A', 'P', 'M', 'A', 'S' },
                { 'M', 'A', 'P', 'U', 'L', 'U', 'T', 'A', 'N', 'H', 'X', 'H', 'S', 'W', 'Z' },
                { 'Z', 'Y', 'N', 'E', 'D', 'I', 'N', 'J', 'P', 'U', 'Z', 'G', 'K', 'Q', 'K' },
        };

        // =============================================================
        // ALFONSO - (10 points)
        System.out.println(" ");
        System.out.println("1. ALFONSO ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (colums != 8 ||rows == 0 || rows == 1 || rows == 9 || rows == 10 || rows == 11 || rows == 12 || rows == 13 ||rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // INSTAGRAM - (10 points)
        System.out.println(" ");
        System.out.println("2. INSTAGRAM ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (rows == 1 && (colums != 1) || rows == 2 && (colums != 2) || rows == 3 && (colums != 3 ) || rows == 4 && (colums != 4) 
                || rows == 5 && (colums != 5) || rows == 6 && (colums != 6) || rows == 7 && (colums != 7) || rows == 8 && (colums != 8) 
                || rows == 9 && (colums != 9) || rows == 0 || rows == 10 || rows == 11 || rows == 12 || rows == 13 || rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // PULUTAN - (10 points)
        System.out.println(" ");
        System.out.println("3. PULUTAN ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (rows != 13 || colums == 0 || colums == 1 || colums == 9 || colums == 10 || colums == 11 
                || colums == 12 || colums == 13 || colums == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // TUESDAY - (10 points)
        System.out.println(" ");
        System.out.println("4. TUESDAY ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (colums != 8 ||rows == 0 || rows == 1 || rows == 9 || rows == 10 || rows == 11 || rows == 12 || rows == 13 ||rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }


        // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("5. CHILLTOP ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){
                
                if (rows == 10 && (colums != 7) || rows == 9 && (colums != 8) || rows == 8 && (colums != 9 ) || rows == 7 && (colums != 10) 
                || rows == 6 && (colums != 11) || rows == 5 && (colums != 12) || rows == 4 && (colums != 13) || rows == 3 && (colums != 14) 
                || rows == 0 || rows == 1 || rows == 2 || rows == 11 || rows == 12 || rows == 13 || rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // MANILA - (10 points)
        System.out.println(" ");
        System.out.println("6. MANILA ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (rows == 10 && (colums != 5) || rows == 9 && (colums != 4) || rows == 8 && (colums != 3 ) || rows == 7 && (colums != 2) 
                || rows == 6 && (colums != 1) || rows == 5 && (colums != 0) || rows == 0 || rows == 1 || rows == 2 || rows == 3 
                || rows == 4 || rows == 11 || rows == 12 || rows == 13 || rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // SAMPALOC - (10 points)
        System.out.println(" ");
        System.out.println("7. SAMPALOC ");

        for (int rows = 0; rows < 15; rows++){
            System.out.println(" ");


            for (int colums = 0; colums < 15; colums++){

                if (rows != 12 || colums == 0 || colums == 1 || colums == 2 || colums == 3 || colums == 4 ||
                colums == 5 || colums == 6 ){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // FRIDAY - (10 points)
        System.out.println(" ");
        System.out.println("8. FRIDAY ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (rows == 0 && (colums != 9) || rows == 1 && (colums != 8) || rows == 2 && (colums != 7) || rows == 3 && (colums != 6) 
                || rows == 4 && (colums != 5) || rows == 5 && (colums != 4) || rows == 6 || rows == 7 || rows == 8 || rows == 9 
                || rows == 10 || rows == 11 || rows == 12 || rows == 13 || rows == 14){

                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }

        // =============================================================
        // PIZZA - (10 points)
        System.out.println(" ");
        System.out.println("9. PIZZA ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");
            
            for (int colums = 0; colums < 15; colums++){

                if (rows == 6 && (colums != 0) || rows == 7 && (colums != 1) || rows == 8 && (colums != 2) || rows == 9 && (colums != 3) 
                || rows == 10 && (colums != 4) || rows == 0 || rows == 1 || rows == 2 || rows == 3 || rows == 4 || rows == 5 || rows == 11 
                || rows == 12 || rows == 13 || rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);

                }
            }
        }
        
        // =============================================================
        // STARBUCKS - (10 points)
        System.out.println(" ");
        System.out.println("10. STARBUCKS ");

        for (int rows = 0; rows < 15; rows++){

            System.out.println(" ");

            for (int colums = 0; colums < 15; colums++){

                if (colums != 14 || rows == 0 || rows == 1 || rows == 2 || rows == 3 || rows == 13  || rows == 14){
                    System.out.print(" ");

                }
                else{
                    System.out.print(array[rows][colums]);
        
                }
            }
        }


        // =============================================================

        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("11. EVERYBODY HAS A PRICE! ");

        // Let s be a string of lowercase Latin letters. Its price is the sum of the
        // indices of letters (an integer between 1 and 26) that are included in it. For
        // example, the price of the string abca is 1 + 2 + 3 + 1 = 7.

        // The string w and the integer p are given. Remove the minimal number of
        // letters from w so that its price becomes less than or equal to p and print
        // the resulting string. Note that the resulting string may be empty. You can
        // delete arbitrary letters, they do not have to go in a row. If the price of a
        // given string w is less than or equal to p, then nothing needs to be deleted
        // and w must be output.

        // Note that when you delete a letter from w, the order of the remaining letters
        // is preserved. For example, if you delete the letter e from the string test,
        // you get tst.

        // Input:
        // Each case consists of two lines.

        // The first of them is the string w, it is non-empty and consists of lowercase
        // Latin letters.

        // The second line contains an integer p (1 ≤ p ≤ 5200000).

        // Output:
        // Output exactly t rows, the i-th of them should contain the answer to the i-th
        // set of input data. Print the longest string that is obtained from w by
        // deleting letters such that its price is less or equal to p. If there are
        // several answers, then output any of them.

        // Note that the empty string — is one of the possible answers. In this case,
        // just output an empty string.

        // ================================================================================

        // Example 1
        // Input:
        // abca
        // 2

        // Output:
        // aa

        // Example 2
        // Input:
        // abca
        // 6

        // Output:
        // abc
        
        // Example 3
        // Input:
        // elizer
        // 50

        // Output:
        // elier

        
    }
}
