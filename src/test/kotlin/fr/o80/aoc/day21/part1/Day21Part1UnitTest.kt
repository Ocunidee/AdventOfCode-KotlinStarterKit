package fr.o80.aoc.day21.part1

import fr.o80.aoc.day21.Day21
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day21Part1UnitTest {

    private val day = Day21()

    @ParameterizedTest
    @MethodSource("provide")
    fun computeRequiredFull(input: String, expectedOutput: Int) {
        // when
        val computedFuel = day.part1(day.parse1(input))

        // then
        assertEquals(expectedOutput, computedFuel)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d21_p1_1, result_d21_p1_1),
                Arguments.of(input_d21_p1_2, result_d21_p1_2),
                Arguments.of(input_d21_p1_3, result_d21_p1_3),
                Arguments.of(exercise_d21_p1, -1)
            )
        }

    }

}