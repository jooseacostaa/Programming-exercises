package rellenararrayaleatorio;

public class RellenarArrayAleatorio {

    public static int azar(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) {

        int[] v = new int[20];
        int left = 0;
        int right = v.length - 1;

        while (left <= right) {
            int num = azar(0, 99);

            if (num % 2 == 0) {
                v[left] = num;
                left++;
            } else {
                v[right] = num;
                right--;
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
