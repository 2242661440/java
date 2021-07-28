package ExamBank;

import java.io.Serializable;
import java.util.ArrayList;

//计算工具类

public class CalculationTools implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 元金
     */
    private final int principal;
    /**
     * 金利
     */
    private final int rate;
    /**
     * 年数
     */
    private final int year;

    /**
     * @param principal 元金データ
     * @param rate      金利データ
     * @param year      年数データ
     */
    public CalculationTools(int principal, int rate, int year) {
        this.principal = principal;
        this.rate = rate;
        this.year = year;
    }

    /**
     * 複利計算
     *
     * @return resultArray 複利計算結果データ
     */
    public ArrayList<ResultTools> compoundInterestCal() {
        ArrayList<ResultTools> resultArray = new ArrayList<>();
        int totalMonth = this.year * 12;
        int totalInterest = this.principal;
        for (int tmpMonth = 0; tmpMonth <= totalMonth; tmpMonth++) {
            ResultTools result = new ResultTools();
            result.setEveryMonth(tmpMonth);
            result.setTotal(totalInterest);
            resultArray.add(result);
            totalInterest += (int) (totalInterest * rate * 0.01 * 1 / 12);
        }
        return resultArray;
    }
}
