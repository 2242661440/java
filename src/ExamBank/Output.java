package ExamBank;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 出力インターフェース
 *
 * @author linsi
 * @version 2.0
 */
public interface Output {
    void outputExec(ArrayList<ResultTools> resultArray, int intPrincipal, int intRate, int intYear) throws IOException;
}