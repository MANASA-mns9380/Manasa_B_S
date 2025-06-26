package classs;

public class series2 {
	public static void main(String[] args) {
        int a = 1;
        if (a <= 2) {
            System.out.println("1");
        } else {
            for (int i = 0; i < (a + 1) / 2; i++) {
                System.out.print(2 * i + 1);
                if (i < ((a + 1) / 2) - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}

