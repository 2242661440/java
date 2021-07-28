package ExamBank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TextOutput implements Output {

    @Override
    public void outputExec(ArrayList<ResultTools> resultArray, int intPrincipal, int intRate, int intYear) throws IOException {
        //ファイルを開く
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("毎月の元利合計額と最終的な元利合計額.txt")));

        //最後の複利計算結果データ取得
        ResultTools lastResult = resultArray.get(resultArray.size() - 1);
        int lastTotalInterest = lastResult.getTotal();
        pw.printf("元本 ¥%,3d、年利%d%%、%d年を指定した場合%n出力結果%n===============================%n", intPrincipal, intRate, intYear);
        //行単位でデータを出力する
        for (ResultTools result : resultArray) {
            String strTotalInterest = String.format("%,3d", result.getTotal());
            if (lastTotalInterest == result.getTotal()) {
                pw.println("===============================");
                pw.println("元利合計 = ¥" + strTotalInterest);
                pw.println("===============================");
            } else {
                pw.println(result.getEveryMonth() + "ヶ月目:" + strTotalInterest);
            }
        }
        //ファイルを閉じる
        pw.close();
    }
}