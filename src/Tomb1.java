void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem az elemszámot:");
    int elemCount = sc.nextInt();
    int[] intArray = new int[elemCount];
    int db = 0;
    while (db < elemCount) {
        System.out.println("Kérem az elemet (int)");
        int elem = sc.nextInt();
        intArray[db] = elem;
        db++;
    }

    for (int i = 0; i < elemCount; i++) {
        System.out.println(intArray[i]);
    }
}
