public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
    // Input for Try again choice
    char choice;
    do {
        
        // Initialize a 3x3 matrix
        int[][] matrix = new int[3][3];
 
        System.out.println("Input 9 elements:");
        
        // Display the input prompt and read the elements into the matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
 
        System.out.println("\nDisplay Here are the Numbers and the required outputs:\n");
        System.out.println("=======================================================================");
        System.out.println("\n                                                  Row Sum:");

        // Display and calculate the row sums
        for (int r = 0; r < 3; r++) {
 
            int rowSum = 0;
            System.out.print("            ");
            for (int c = 0; c < 3; c++) {
 
                System.out.printf("%10d", matrix[r][c]);
 
                rowSum += matrix[r][c];
            }
 
            System.out.printf("%15d%n", rowSum);
        }
 
        //Calculate and display the column sums
        System.out.println();
        System.out.print("Column sum: ");
  
        for (int c=0; c<matrix[0].length;c++)
        {
            int colsum = 0;
            for (int r = 0; r<matrix.length;r++)
            {
                colsum += matrix[r][c];
            }
            System.out.printf("%10d", colsum);
        }
 
        System.out.println();
        System.out.println("========================================================================");

        // Calculate and display the diagonal sums
        int dia1 = 0;
        int dia2 = 0;
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (r == c) {
                    dia1 += matrix[r][c];
                }
                if (r + c == matrix.length - 1) {
                    dia2 += matrix[r][c];
                }
            }
        }
        System.out.println("Diagonal 1 sum: " + dia1);
        System.out.println("Diagonal 2 sum: " + dia2);

        System.out.print("\n\nTry Again [y/n]: ");
 
        choice = input.next().charAt(0);
 
    } while (choice == 'y');
 
    input.close();
}