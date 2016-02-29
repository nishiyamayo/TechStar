package techstar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * 標準入力から読み込んだ内容をMain#solveに渡します。
     * また、答えの配列を受け取り、ソートして標準出力に出力します。
     * サンプル以外の入力を試したい場合はこちらを利用し、diffコマンドなどで出力を確認してください。
     */
    public void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ls = new int[m];
        int[] rs = new int[m];
        String[] xs = new String[m];

        for (int i = 0; i < m; i++) {
            ls[i] = sc.nextInt();
            rs[i] = sc.nextInt();
            xs[i] = sc.next();
        }

        int[] ans = solve(n, m, ls, rs, xs);
        Arrays.sort(ans);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    /**
     * 人狼度集計プログラムを書いてください。入力は問題文の通りです。
     * 詳しくはMainTestのサンプルテストをご覧ください。
     * @param n 参加人数
     * @param m 入力される発言の数
     * @param ls 発言のうち、lの配列: ls = {l_1, l_2, ..., l_m}
     * @param rs 発言のうち、rの配列: rs = {r_1, r_2, ..., r_m}
     * @param xs 発言のうち、xの配列: xs = {x_1, x_2, ..., x_m}
     * @return 人狼度の高いプレイヤーの配列
     */
    public int[] solve(int n, int m, int[] ls, int[] rs, String[] xs) {
        // TODO: ここに集計プログラムを書く
        return null;
    }

    public static void main(String[] ars) {
        new Main().run();
    }
}
