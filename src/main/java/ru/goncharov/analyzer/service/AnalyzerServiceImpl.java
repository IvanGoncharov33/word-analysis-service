package ru.goncharov.analyzer.service;

import org.springframework.stereotype.Service;
import ru.goncharov.analyzer.dto.AnalyzerRequestDto;
import ru.goncharov.analyzer.handling.EmptyInputWordException;

@Service
public class AnalyzerServiceImpl implements AnalyzerService {

    @Override
    public AnalyzerRequestDto getAnalyzeWord(String analyzedWord) {
        if (analyzedWord.isEmpty()){
            throw new EmptyInputWordException("You haven't typed a word!");
        }
        char letter = 0;
        int count = 0;
        int countChar;
        char[] chars = analyzedWord.toLowerCase().toCharArray();

       for(int i = 0; i < chars.length; i++){
           countChar = 0;
           for (int j = i; j < chars.length; j++) {
               if (chars[i] == chars[j]){
                   countChar++;
               }
           }
           if (countChar >= count){
               letter = chars[i];
               count = countChar;
           }
       }
        return new AnalyzerRequestDto(letter, count);
    }
}
