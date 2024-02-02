package com.kabhre.quiz.practice;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class QuizFrame extends JFrame {

	private JPanel contentPane;
	private JTextField stextfield;
	JButton next;
	JLabel question;
	JButton opt1;
	JButton opt2;
	JButton opt3;
	JButton opt4;
	int score=0;
	ArrayList<Quiz> questionList=new ArrayList<>();
	int index=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizFrame frame = new QuizFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizFrame() {
		setQuestion();
		setTitle("Ko Bancha Crorepati");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		question = new JLabel(questionList.get(index).question);
		question.setFont(new Font("Tahoma", Font.PLAIN, 20));
		question.setBounds(68, 36, 687, 105);
		contentPane.add(question);
		
		opt1 = new JButton(questionList.get(index).answerList.get(0));
		opt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCorrectAnswer(opt1, 0);
			}});
		opt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opt1.setBounds(88, 189, 215, 76);
		contentPane.add(opt1);
		
		opt2 = new JButton(questionList.get(index).answerList.get(1));
		opt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkCorrectAnswer(opt2, 1);
			}
		});
		opt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opt2.setBounds(468, 189, 215, 76);
		contentPane.add(opt2);
		
		opt3 = new JButton(questionList.get(index).answerList.get(2));
		opt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCorrectAnswer(opt3, 2);

			}
		});
		opt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opt3.setBounds(88, 311, 215, 76);
		contentPane.add(opt3);
		
		opt4 = new JButton(questionList.get(index).answerList.get(3));
		opt4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		checkCorrectAnswer(opt4, 3);
			}
		});
		opt4.setBounds(468, 311, 215, 76);
		contentPane.add(opt4);
		
		next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index<questionList.size()-1) {
					index++;
					question.setText(questionList.get(index).question);
					opt1.setText(questionList.get(index).answerList.get(0));
					opt2.setText(questionList.get(index).answerList.get(1));
					opt3.setText(questionList.get(index).answerList.get(2));
					opt4.setText(questionList.get(index).answerList.get(3));
					opt1.setBackground(null);
					opt2.setBackground(null);
					opt3.setBackground(null);
					opt4.setBackground(null);
					
				}	
			}
		});
		next.setFont(new Font("Tahoma", Font.PLAIN, 20));
		next.setBounds(713, 432, 126, 45);
		contentPane.add(next);
		
		JLabel score = new JLabel("Score");
		score.setFont(new Font("Tahoma", Font.PLAIN, 20));
		score.setBounds(44, 438, 74, 36);
		contentPane.add(score);
		
		stextfield = new JTextField();
		stextfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stextfield.setEditable(false);
		stextfield.setBounds(116, 441, 115, 36);
		contentPane.add(stextfield);
		stextfield.setColumns(10);
	}
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
		
	}
	public void checkCorrectAnswer(JButton button,int currentIndex) {
		if(questionList.get(index).answerList.get(currentIndex).equals(questionList.get(index).CorrectAnswer)) {
			button.setBackground(Color.green);
			score=score+5;
			stextfield.setText(String.valueOf(score));
		}
		else {
			int a= questionList.get(index).answerList.indexOf(questionList.get(index).CorrectAnswer);
			button.setBackground(Color.red); 
			if (a==0) {
				opt1.setBackground(Color.green);
			}
			else if(a==1) {
				opt2.setBackground(Color.green);
			}
			else if(a==2) {
				opt3.setBackground(Color.green);
			}
			else if(a==3) {
				opt4.setBackground(Color.green);
			}	
		}
	}
}
