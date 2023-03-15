package week.pkg2;

public class Insertion_Sort_Performance_Test {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int insertion[] = dizi_olustur();
        System.out.println();
        System.out.println("Siralanmamis Dizi :");
        System.out.println();
        print_array(insertion);
        System.out.println();

        for (int i = 1; i < insertion.length; i++) {
            int var = insertion[i];
            int j = i - 1;
            while (j > -1 && insertion[j] > var) {
                insertion[j + 1] = insertion[j];
                j--;
            }
            insertion[j + 1] = var;
        }

        System.out.println();
        System.out.println("Siralanmis Dizi :");
        System.out.println();
        print_array(insertion);
        System.out.println();

        long elapsedTimeMillis = System.currentTimeMillis() - start;

        System.out.println();
        System.out.println("Bubble Sort Toplam " + elapsedTimeMillis + " Ms Surmustur.");

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

                System.out.println(array[i] + ",");
            }
            System.out.print(array[i] + ",");
        }
    }

}
