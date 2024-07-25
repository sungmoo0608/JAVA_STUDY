class SavedMoney {

    private int totalMoney;
    private int[] moneyCount = { 0, 0, 0, 0, 0, 0 };
    private String[] moneyStr = { "5만원", "1만원", "5천원", "1천원", "500원", "100원" };

    public void printCalaulateMoney() {
        System.out.println("총 금액 : " + totalMoney);
        for (int i = 0; i < moneyCount.length; i++) {
            System.out.println(moneyStr[i] + moneyCount[i]);
        }
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    private void savedCalculatedMoney(int... moneyCount) {
        for (int i = 0; i < moneyCount.length; i++) {
            this.moneyCount[i] = moneyCount[i];
        }
    }

    public void calculateMoney() {
        int totalMoney = this.totalMoney;
        int[] savedMoney = new int[6];
        int[] calcMoney = { 50000, 10000, 5000, 1000, 500, 100 };

        for (int i = 0; i < 6;) {
            if (totalMoney >= calcMoney[i]) {
                totalMoney -= calcMoney[i];
                savedMoney[i] += 1;
                System.out.println("debug loop test index result :: " + i + " :: " + savedMoney[i] + " : " + calcMoney[i] + " : " + totalMoney);
            }
            if (!(totalMoney >= calcMoney[i])) {
                i = i + 1;
            } else if (i > 6) {
                break;
            }
        }

        savedCalculatedMoney(savedMoney[0], savedMoney[1], savedMoney[2], savedMoney[3], savedMoney[4],
                savedMoney[5]);
    }
}

public class Won {
    public static void main(String[] args) {
        SavedMoney savedMoney = new SavedMoney();
        savedMoney.setTotalMoney(126800);
        savedMoney.calculateMoney();
        savedMoney.printCalaulateMoney();
    }
}