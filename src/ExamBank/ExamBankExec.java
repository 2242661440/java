package ExamBank;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * 複利計算実行
 *
 * @author limo.linsi
 * @version 2.0
 */
public class ExamBankExec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean blIsInputOver = false;
        int intPrincipal=-1;
        int intRate=-1;
        int intYear=-1;
        while (!blIsInputOver) {
            try {
                //入力チェック(元金 / 金利 / 年数)
                if (intPrincipal == -1) {
                    System.out.print("元本を入力してください ( 単位円 )> ");
                    intPrincipal = ValueCheck.checkPrincipal(input.nextLine());
                }
                if (intRate == -1) {
                    System.out.print("金利(年利)を入力してください ( 単位% )> ");
                    intRate = ValueCheck.checkRate(input.nextLine());
                }
                if (intYear == -1) {
                    System.out.print("年数を入力してください ( 単位年 )> ");
                    intYear = ValueCheck.checkYear(input.nextLine());
                    blIsInputOver = true;
                }
                //入力値格納 / 計算
                CalculationTools calTools = new CalculationTools(intPrincipal, intRate, intYear);

                //複利計算実行
                ArrayList<ResultTools> resultArray = calTools.compoundInterestCal();

                //出力(コンソール)
                Output outputToDisplay = new DisplayOutput();
                outputToDisplay.outputExec(resultArray, intPrincipal, intRate, intYear);

                //出力(テキストファイル)
                Output outputToFile = new TextOutput();
                outputToFile.outputExec(resultArray, intPrincipal, intRate, intYear);

            } catch (IOException e) {
                System.out.println("[Error]: テキストファイルが存在しません");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}