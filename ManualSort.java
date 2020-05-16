package manualsort;

/**
 *
 * @author Jonathan
 */
public class ManualSort {

    public static void main(String[] args) {
        //Numbers to sort
        double list[] = {9.2, 2.5, 4.2, 3.1, 6.7, 2.3, 1.7, 8.9, 6.2, 4.7, 3.1, 7.85, 7.8501, 5.2, 9.12, 4.56, 7.4, 8.0};
        double tmp;
        for (int x = 0; x < list.length; ++x) {
            for (int i = 0; i < list.length; ++i) {
                try {
                    if (list[i] > list[i + 1]) {
                        tmp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = tmp;
                    }
                } catch (Exception ex) {
                    break;
                }
            }
        }

        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i]);
        }
    }

}
