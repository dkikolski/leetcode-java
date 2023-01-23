package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0121BestTimeToBuyAndSellStock.maxProfit;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0121BestTimeToBuyAndSellStockTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
                arguments(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] prices, final int expectedMaxProfit) {
        assertThat(maxProfit(prices)).isEqualTo(expectedMaxProfit);
    }
}