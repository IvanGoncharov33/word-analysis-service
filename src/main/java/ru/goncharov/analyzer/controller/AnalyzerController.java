package ru.goncharov.analyzer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.goncharov.analyzer.dto.AnalyzerRequestDto;
import ru.goncharov.analyzer.service.AnalyzerService;

@RestController
@RequestMapping("/wordanalyzer")
public class AnalyzerController {

    private final AnalyzerService analyzerService;

    @Autowired
    public AnalyzerController(AnalyzerService analyzerService){
        this.analyzerService = analyzerService;
    }

    @GetMapping("/analyze")
    public ResponseEntity<AnalyzerRequestDto>  getStringAnalyze(@RequestParam(name = "word") String analyzedWord){
        return new ResponseEntity<>(analyzerService.getAnalyzeWord(analyzedWord), HttpStatus.OK);
    }
}
