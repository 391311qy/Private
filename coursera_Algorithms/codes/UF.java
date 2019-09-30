public class UF {
    /* functions needed to write
    UF(int N)
    void union(int p, int q)
    boolean connected(int p, int q)
    int find(int p)
    int count()
    */
    public static void main(Strings[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }

}