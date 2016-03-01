package techstar;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    /**
     * 入力サンプル1:
     * 8 2
     * 2 5 WOLF
     * 8 2 VILLAGER
     *
     * 出力:
     * 3
     * 4
     * 5
     */
    @Test
    public void testSample1() {
        int[] ls = {2, 8};
        int[] rs = {5, 2};
        String[] xs = {"WOLF", "VILLAGER"};

        int[] expecteds = {3, 4, 5};

        int[] actuals = new Main().solve(8, 2, ls, rs, xs);
        Arrays.sort(actuals);

        assertArrayEquals(expecteds, actuals);
    }

    /**
     * 入力サンプル2:
     * 5 5
     * 1 2 WOLF
     * 4 4 WOLF
     * 5 1 VILLAGER
     * 1 5 VILLAGER
     * 2 2 WOLF
     *
     * 出力:
     * 2
     */
    @Test
    public void testSample2() {
        int[] ls = {1, 4, 5, 1, 2};
        int[] rs = {2, 4, 1, 5, 2};
        String[] xs = {"WOLF", "WOLF", "VILLAGER", "VILLAGER", "WOLF"};

        int[] expecteds = {2};

        int[] actuals = new Main().solve(5, 5, ls, rs, xs);
        Arrays.sort(actuals);

        assertArrayEquals(expecteds, actuals);
    }
}
