package ExamBank;

import java.util.ArrayList;

/**
 * コンソール出力クラス
 *
 * @author limo.linsi
 * @version 2.0
 */
public class DisplayOutput implements Output {

    @Override
    public void outputExec(ArrayList<ResultTools> resultArray, int intPrincipal, int intRate, int intYear) {
        ResultTools lastResultBean = resultArray.get(resultArray.size() - 1);
        int lastTotalInterest = lastResultBean.getTotal();
        System.out.printf("%n元本 ¥%,3d、年利%d%%、%d年を指定した場合%n出力結果%n===============================%n", intPrincipal, intRate, intYear);
        for (ResultTools result : resultArray) {
            String strTotalInterest = String.format("%,3d", result.getTotal());
            if (lastTotalInterest == result.getTotal()) {
                System.out.println("===============================");
                System.out.println("元利合計 = ¥" + strTotalInterest);
                System.out.println("===============================");
            } else {
                System.out.println(result.getEveryMonth() + "ヶ月目:" + strTotalInterest);
            }

        }
    }
}
