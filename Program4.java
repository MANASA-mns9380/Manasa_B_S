package classs;
public class count {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] count = new int[9];

        for (int num : numbers) {
            for (int i = 0; i < 9; i++) {
                if (num % (i + 1) == 0) {
                    count[i]++;
                }
            }
        }
          for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + ": " + count[i]);
            if (i < 8) {
                System.out.print(", ");
            }
        }
    }
}
