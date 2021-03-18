package ru.goncharov.analyzer.service;

import ru.goncharov.analyzer.dto.AnalyzerRequestDto;

public interface AnalyzerService {
   AnalyzerRequestDto getAnalyzeWord(String analyzedWord);
}
