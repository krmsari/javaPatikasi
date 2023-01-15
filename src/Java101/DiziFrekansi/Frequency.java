package Java101.DiziFrekansi;

public class Frequency {
    public void finder(){
        int[] arr = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] frequencies = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    // Tekrar eden değerleri elemek için
                    frequencies[j] = visited;
                }
            }
            if (frequencies[i] != visited) {
                frequencies[i] = count;
            }
        }
        // Frekansı göstermek için
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] != visited) {
                System.out.println(arr[i] + " sayisi " + frequencies[i] + " kez tekrar etti. ");
            }
        }

    }
}
