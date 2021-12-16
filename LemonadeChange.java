public class LemonadeChange {
    
    //solution 1
    static boolean lemonadeChange1(int[] bills) {

        int count5 = 0;
        int count10 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                count5++;
            } else if (bills[i] == 10) {
                if (count5 < 1) {
                    return false;
                }
                count10++;
                count5--;
            } else {
                if (count5 > 0) {
                    if (count10 > 0) {
                        count10--;
                        count5--;
                    } else if (count5 >= 3) {
                        count5 -= 3;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    //solution 2
    static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                tens++;
                fives--;
            } else if (tens > 10) {
                tens--;
                fives--;
            } else {
                tens -= 3;
            }

            if (fives < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5, 5, 10};
        System.out.println(lemonadeChange(bills));
    }
}
