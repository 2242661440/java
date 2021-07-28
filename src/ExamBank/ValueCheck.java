package ExamBank;

/**
 * チェック機能
 */
public class ValueCheck {
    /**
     * 元金チェック
     *
     * @param strPrincipal 元金(String型)
     * @return intPrincipal 元金(int型)
     * @throws Exception エラーメッセージ
     */
    public static int checkPrincipal(String strPrincipal) throws Exception {
        int intPrincipal = 0;
        try {
            intPrincipal = Integer.parseInt(strPrincipal);
        } catch (NumberFormatException e) {
            throw new Exception("[ERROR]: 元金の入力に誤りがあります。元金は1〜10億までの範囲で整数を指定ください。");
        }
        if (!(intPrincipal > 0 && intPrincipal <= 1_000_000_000)) {
            throw new Exception("[ERROR]: 元金は1〜10億までの範囲で指定ください。");
        }
        return intPrincipal;
    }

    /**
     * 金利チェック
     *
     * @param strRate 金利(String型)
     * @return intRate 金利(int型)
     * @throws Exception エラーメッセージ
     */
    public static int checkRate(String strRate) throws Exception {
        int intRate = 0;
        try {
            intRate = Integer.parseInt(strRate);
        } catch (NumberFormatException e) {
            throw new Exception("[ERROR]: 金利(年利)の入力に誤りがあります。金利(年利)は1〜20までの範囲で整数を指定ください。");
        }
        if (!(intRate > 0 && intRate <= 20)) {
            throw new Exception("[ERROR]: 金利(年利)は1〜20までの範囲で指定ください。");
        }
        return intRate;
    }

    /**
     * 年数チェック
     *
     * @param strYear 年数
     * @return intYear 年数(int型)
     * @throws Exception エラーメッセージ
     */
    public static int checkYear(String strYear) throws Exception {
        int intYear = 0;
        try {
            intYear = Integer.parseInt(strYear);
        } catch (NumberFormatException e) {
            throw new Exception("[ERROR]: 年数の入力に誤りがあります。年数は1〜20までの範囲で整数を指定ください。");
        }
        if (!(intYear > 0 && intYear <= 20)) {
            throw new Exception("[ERROR]: 年数は1〜20までの範囲で指定ください。");
        }
        return intYear;
    }
}
