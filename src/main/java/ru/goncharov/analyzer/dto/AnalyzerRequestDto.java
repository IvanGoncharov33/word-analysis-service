package ru.goncharov.analyzer.dto;

public class AnalyzerRequestDto {
    private Character letter;
    private int count;

    public AnalyzerRequestDto(Character letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public Character getLetter() {
        return letter;
    }

    public int getCount() {
        return count;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
