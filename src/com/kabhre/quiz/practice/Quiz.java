package com.kabhre.quiz.practice;
import java.util.List; 

public class Quiz {
String question;
List<String>answerList;
String CorrectAnswer;

public Quiz(String question,List<String>answerList,String CorrectAnswer){
	this.question=question;
	this.answerList=answerList;
	this.CorrectAnswer=CorrectAnswer;	
}
}
