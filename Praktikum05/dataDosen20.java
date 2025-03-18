public class dataDosen20 {
    dosen20 datadosen20[] = new dosen20[10];
    int idx = 0;

    void tambah(dosen20 dsn) {
        if (idx < datadosen20.length) {
            datadosen20[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
        } else {
            for (int i = 0; i < idx; i++) {
                datadosen20[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (datadosen20[j].usia > datadosen20[j + 1].usia) {
                    dosen20 temp = datadosen20[j];
                    datadosen20[j] = datadosen20[j + 1];
                    datadosen20[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC (termuda ke tertua).");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (datadosen20[j].usia > datadosen20[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            dosen20 temp = datadosen20[maxIdx];
            datadosen20[maxIdx] = datadosen20[i];
            datadosen20[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC (tertua ke termuda).");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            dosen20 temp = datadosen20[i];
            int j = i;
            while (j > 0 && datadosen20[j - 1].usia < temp.usia) {
                datadosen20[j] = datadosen20[j - 1];
                j--;
            }
            datadosen20[j] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC menggunakan Insertion Sort.");
    }
}
