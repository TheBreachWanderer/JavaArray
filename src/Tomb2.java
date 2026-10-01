void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem az elemszámot:");
    int elemCount = sc.nextInt();
    double[] doubleArray = new double[elemCount];
    int db = 0;
    while (db < elemCount) {
        System.out.println("Kérem az elemet (double)");
        double elem = sc.nextDouble();
        doubleArray[db] = elem;
        db++;
    }

    for (int i = 0; i < elemCount; i++) {
        System.out.println(doubleArray[i]);
    }
}