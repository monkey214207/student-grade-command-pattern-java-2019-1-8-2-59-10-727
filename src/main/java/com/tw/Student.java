package com.tw;

import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    public HashMap<String,Integer> scores;

    public Student(String name, int id, HashMap<String, Integer> scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOneScore(String subject){
        return scores.get(subject);
    }

    public int getSumScore(){
        int sumScore = 0;
        for (Integer v:scores.values()){
            sumScore += v;
        }
        return sumScore;
    }

    public String scoresString(){
        int sumScore = 0;
        int scoreNum = 0;
        double meanScore;
        String printScores = name;
        for (Integer v:scores.values()){
            printScores += "|";
            printScores += v;
            sumScore += v;
            scoreNum ++;
        }
        meanScore = sumScore/scoreNum;
        printScores = printScores+"|"+meanScore+"|"+sumScore;
        return printScores;
    }
}
