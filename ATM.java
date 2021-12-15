import java.util.*;
public class ATM {
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int i = 0;
        while (sum != 0) {
            if (sum - banknotes[i] >= 0) {
                sum -= banknotes[i];
                result++;
            } else {
                i++;
            }
        }
        return result;
    }
}