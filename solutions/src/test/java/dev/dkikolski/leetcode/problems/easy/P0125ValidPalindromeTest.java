package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0125ValidPalindrome.isPalindrome;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0125ValidPalindromeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("A man, a plan, a canal: Panama", true),
                arguments("A man,_a plan,_a canal: Panama", true),
                arguments("race a car", false),
                arguments(" ", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String s, final boolean expected) {
        assertThat(isPalindrome(s)).isEqualTo(expected);
    }
}