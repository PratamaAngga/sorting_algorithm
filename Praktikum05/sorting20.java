public class sorting20 {
    int data[];
    int jumlah;

    sorting20 (int Data[], int jmlData) {
        jumlah = jmlData;
        data = new int[jmlData];
        for (int i=0; i<jmlData; i++){
            data[i] = Data[i];
        }
    }

    void bubble(){
        int temp = 0;
        for (int i=0; i<jumlah-1; i++){
            for (int j=1; j<jumlah-i; j++){
                if (data[j-1]>data[j]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void selection(){
        for (int i=0; i<jumlah-1; i++){
            int min=i;
            for (int j=i+1; j<jumlah; j++){
                if (data[j]<data[min]) {
                    min=j;
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }

    void insertion(){
        for (int i=1; i<=data.length-1; i++){
            int temp=data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }

    void tampil(){
        for (int i=0; i<jumlah; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
