import java.util.Scanner;
public class mahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahmhs = sc.nextInt();
        sc.nextLine();
        mahasiswaPrestasi20 list = new mahasiswaPrestasi20(jumlahmhs);

        for (int i=0; i< jumlahmhs; i++){
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa20 m = new mahasiswa20(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah BUBBLE sorting berdasarkan IPK (DESC) : ");
        list.bubble();
        list.tampil();

        System.out.println("Data mahasiswa setelah SELECTION sorting berdasarkan IPK (ASC) : ");
        list.selection();
        list.tampil();

        System.out.println("Data mahasiswa setelah INSERTION sorting berdasarkan IPK (DESC) : ");
        list.insertion();
        list.tampil();

        sc.close();
    }
}
