public class BubbleSortExample07 {
    public static void main(String[] args) {
        
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for (int i = 0; i < intData.length; i++){
            for (int j = 1; j < intData.length-i; j++){
                if (intData[j-1] > intData[j]){
                    //Swap Elemen
                    temp = intData[j];
                    intData[j] = intData[j-1];
                    intData[j-1] = temp;
                }
            }
        }
        System.out.println("Hasil Pengurutan :");
        for (int i = 0; i < intData.length; i++){
            System.out.println(intData[i]);
        }

        System.out.println();
        //Modifikasi Dibalik
        for (int i = 0; i < intData.length; i++){
            for (int j = 1; j < intData.length-i; j++){
                if (intData[j-1] < intData[j]){ // Mengganti tanda > menjadi <
                    //Swap Elemen
                    temp = intData[j];
                    intData[j] = intData[j-1];
                    intData[j-1] = temp;
                }
            }   
        }
        System.out.println("Hasil Pengurutan Terbalik :");
        for (int i = 0; i < intData.length; i++){
            System.out.println(intData[i]);
        }
    }
}
