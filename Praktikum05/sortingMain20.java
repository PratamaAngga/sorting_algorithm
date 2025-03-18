public class sortingMain20 {
    public static void main(String[] args) {
        int a[]={20, 10, 2, 7, 12};
        int b[]={30, 20, 2, 8, 14};
        int c[]={40, 10, 4, 9, 3};

        sorting20 dataurut1 = new sorting20(a, a.length);
        sorting20 dataurut2 = new sorting20(b, b.length);
        sorting20 dataurut3 = new sorting20(c, c.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubble();
        System.out.println("Data sesudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubble();
        System.out.println("Data sesudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubble();
        System.out.println("Data sesudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
