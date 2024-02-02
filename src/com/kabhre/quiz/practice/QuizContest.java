package com.kabhre.quiz.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizContest {
	ArrayList<Quiz> questionList=new ArrayList<>();
	public void setQuestion() {
		Quiz qs1=new Quiz("What is the capital city of Nepal?",Arrays.asList("a.Banepa","b.Kathmandu","c.Bhaktapur","d.Patan"),"b.Kathmandu");
		Quiz qs2=new Quiz("What is the capital city of India?",Arrays.asList("a.Goa","b.Mumbai","c.Kolkata","d.New Delhi"),"d.New Delhi");
		Quiz qs3=new Quiz("What is the capital city of China?",Arrays.asList("a.Beijing","b.Wuhan","c.Shanghai","d.Nanjing"),"a.Beijing");
		Quiz qs4=new Quiz("Who was the first master of Goku?",Arrays.asList("a.King Kai","b.Master Roshi","c.Gohan","d.Supreme Kai"),"b.Master Roshi");
		Quiz qs5=new Quiz("What is the Saiyan name of Goku?",Arrays.asList("a.King Kai","b.Majin Buu","c.Nappa","d.Kakarot"),"d.Kakarot");
		
		questionList.add(qs1);
		questionList.add(qs2);
		questionList.add(qs3);
		questionList.add(qs4);
		questionList.add(qs5);
		
//		System.out.println(questionList.get(4).question);
//		System.out.println(questionList.get(4).answerList);
//		System.out.println(questionList.get(4).CorrectAnswer);
	}
		
		public static void main(String[]args) {
			QuizContest obj=new QuizContest();
			obj.setQuestion();
		}
		
	}
