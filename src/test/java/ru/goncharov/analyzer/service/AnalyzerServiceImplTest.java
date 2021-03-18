package ru.goncharov.analyzer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.goncharov.analyzer.handling.EmptyInputWordException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnalyzerServiceImplTest {
    AnalyzerService analyzerService;

    @BeforeEach
    public void setUp() {
        analyzerService = new AnalyzerServiceImpl();
    }

    @ParameterizedTest
    @CsvSource({"test, t, 2", "tester, e, 2", "t, t, 1", "tee, e, 2" })
    public void checkCorrectAnalysisWord(String strings, Character chars, int count) {
        assertEquals(chars, analyzerService.getAnalyzeWord(strings).getLetter());
        assertEquals(count, analyzerService.getAnalyzeWord(strings).getCount());
    }

    @Test
    public void shouldThrowException() throws EmptyInputWordException{
        EmptyInputWordException exception = assertThrows(EmptyInputWordException.class, () ->
                analyzerService.getAnalyzeWord(""));
        assertEquals("You haven't typed a word!", exception.getMessage());
    }
}