void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem a mátrix szélességét:");
    int width = sc.nextInt();
    System.out.println("Kérem a mátrix magasságát:");
    int height = sc.nextInt();
    int[][] matrix = new int[height][width];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.println("Kérem az elemet");
            matrix[i][j] = sc.nextInt();
        }
    }

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " | ");
        }
        System.out.println();
    }
}