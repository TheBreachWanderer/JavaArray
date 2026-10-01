void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem az elemszámot:");
    int elemCount = sc.nextInt();
    String[] stringArray = new String[elemCount];
    int db = 0;
    while (db < elemCount) {
        System.out.println("Kérem az elemet (string)");
        String elem = sc.next();
        stringArray[db] = elem;
        db++;
    }

    for (int i = 0; i < elemCount; i++) {
        System.out.println(stringArray[i]);
    }
}