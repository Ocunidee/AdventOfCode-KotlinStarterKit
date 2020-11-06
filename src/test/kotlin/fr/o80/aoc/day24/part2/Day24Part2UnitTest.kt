package fr.o80.aoc.day24.part2

import fr.o80.aoc.day24.Day24
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day24Part2UnitTest {

    private val day = Day24()

    @ParameterizedTest
    @MethodSource("provide")
    fun computeRequiredFull(input: String, expectedOutput: Int) {
        // when
        val computedFuel = day.part2(day.parse2(input))

        // then
        assertEquals(expectedOutput, computedFuel)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d24_p2_1, result_d24_p2_1),
                Arguments.of(input_d24_p2_2, result_d24_p2_2),
                Arguments.of(input_d24_p2_3, result_d24_p2_3),
                Arguments.of(exercise_d24_p2, -1)
            )
        }

    }

}