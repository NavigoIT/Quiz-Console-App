package com.rayapati.quizapp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "what", "A", "B", "C", "D", "B");
        questions[1] = new Question(2, "why", "A", "B", "C", "D", "C");
        questions[2] = new Question(3, "what", "A", "B", "C", "D", "A");
        questions[3] = new Question(4, "what", "A", "B", "C", "D", "A");
        questions[4] = new Question(5, "what", "A", "B", "C", "D", "D");
    }

    public void displayQuestions(){
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
        }
    }

    public void playQuiz(){
        for (Question q : questions) {
            System.out.println("Question " + q.getId() + " :");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[q.getId() - 1] = sc.nextLine();
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if(selection[i].equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("YOUR SCORE :: " + score);
    }
}
