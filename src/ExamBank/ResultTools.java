package ExamBank;

import java.io.Serializable;

public class ResultTools implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 経過月
     */
    private int everyMonth;
    /**
     * 複利合計(元金+利息)
     */
    private int total;

    public int getEveryMonth() {
        return everyMonth;
    }

    public void setEveryMonth(int intEveryMonth) {
        this.everyMonth = intEveryMonth;
    }
    /**
     * 複利合計(元金+利息)の獲得
     */
    public int getTotal() {
        return total;
    }
    /**
     * 複利合計(元金+利息)の設定
     */
    public void setTotal(int intTotal) {
        this.total = intTotal;
    }

}
