public class mahasiswaPrestasi20 {
    mahasiswa20 listMhs[] = new mahasiswa20[5];
    int idx;

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
}
