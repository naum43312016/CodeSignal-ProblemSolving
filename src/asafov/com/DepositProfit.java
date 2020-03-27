package asafov.com;
/*You have deposited a specific
amount of money into your bank account.
Each year your balance increases at the same growth rate.
With the assumption that you don't make any additional deposits,
find out how long it would take for your balance to pass a specific threshold.
 */
public class DepositProfit {

    int depositProfit(int deposit, int rate, int threshold) {
        int ans = 0;
        if (deposit>threshold) return 0;
        double sum = deposit;
        while (sum<threshold){
            double incr = sum/100*rate;
            sum+=incr;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
