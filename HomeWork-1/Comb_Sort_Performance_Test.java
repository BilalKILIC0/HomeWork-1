package week.pkg2;

public class Comb_Sort_Performance_Test {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int comb[] = dizi_olustur();

        System.out.println();
        System.out.println("Siralanmamis Dizi :");
        print_array(comb);

        System.out.println();
        System.out.println("Siralanmis Dizi :");
        comb_sort(comb);
        print_array(comb);

        long elapsedTimeMillis = System.currentTimeMillis() - start;

        System.out.println();
        System.out.println("Bubble Sort Toplam " + elapsedTimeMillis + " Ms Surmustur.");

    }
    
    public static int[] comb_sort(int[] dizi) {

        int n = dizi.length;
        int gap = n;
        double kucult = 1.3;
        boolean sorted = false;

        while (!sorted) {
            gap = (int) (gap / kucult);
            if (gap > 1) {
                sorted = false;
            } else {
                gap = 1;
                sorted = true;
            }

            int i = 0;
            while (i + gap < n) {
                if (dizi[i] > dizi[i + gap]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[i + gap];
                    dizi[i + gap] = temp;
                    sorted = false;
                }
                i++;
            }
        }

        return dizi;
    }

    public static int[] dizi_olustur() {

        int array[] = new int[1000];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (50000 - 1) + 1);
        }

        return array;
    }

    public static void print_array(int array[]) {

        for (int i = 0; i < array.length; i++) {

            if ((i != 0) && (i % 10 == 0)) {

                System.out.println(array[i] + " ");
            }

            System.out.print(array[i] + " ");
        }
    }
}
