public class mahasiswaPrestasi20 {
    mahasiswa20 listMhs[];
    int idx;

    mahasiswaPrestasi20(int jumlah) {
        listMhs = new mahasiswa20[jumlah];
    }

    void tambah (mahasiswa20 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (mahasiswa20 m:listMhs){
            m.tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubble(){
        for(int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    mahasiswa20 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void selection(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            mahasiswa20 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertion(){
        for (int i=1; i<listMhs.length; i++){
            mahasiswa20 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}
