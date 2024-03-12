import java.util.*;

class Snippetgenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int index = 0;

        for(int i = 0; i < 10; i++){
            sum = sum + 4;
        }

        for(int i = 0; i < 10; i++){
            if (sum>10) {
                index = i;
            }
        }

        System.out.println("Sum: " + sum + "\nIndex: " + index);
        sc.close();
    }
}