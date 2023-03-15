package week.pkg2;

public class Selection_Sort_Performance_Test {

    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        int selection[] = dizi_olustur();

        System.out.println("Siralanmamis Dizi :");
        print_array(selection);
        System.out.println();

        // int comb[] = dizi_olustur();
        // int insertion[] = dizi_olustur();
        for (int i = 0; i < selection.length - 1; i++) {

            for (int j = i + 1; j < selection.length; j++) {

                if (selection[i] > selection[j]) {

                    int temp = selection[i];
                    selection[i] = selection[j];
                    selection[j] = temp;
                }
            }
        }
        
        System.out.println("Siralanmis Dizi :");
        print_array(selection);

        long elapsedTimeMillis = System.currentTimeMillis() - start;

        System.out.println();
        System.out.println("Selection Sort Toplam " + elapsedTimeMillis + " Ms Surmustur.");
    }

    public static int[] dizi_olustur() {

        int array[] = new int[1000];

        for (int i = 0; i < 1000; i++) {

            array[i] = (int) (Math.random() * (50000 - 1) + 1);
        }

        return array;
    }

    public static void print_array(int array[]) {

        for (int i = 0; i < array.length; i++) {

            if ((i % 10 == 0) && i != 0) {

                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }
}
