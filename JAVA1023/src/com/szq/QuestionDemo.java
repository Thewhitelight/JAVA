package com.szq;

import java.util.Scanner;

public class QuestionDemo {
public static void main(String[] args) {
	Question question=new Question();
	System.out.println(question.title);
	for (int i = 0; i < question.options.length; i++) {
		System.out.print(question.options[i]+" ");
	}
	System.out.println();
	System.out.println("请输入正确答案：");
	Scanner input=new Scanner(System.in);
	SingleQuestion singlequestion=new SingleQuestion();
    singlequestion.answer=input.next();
	singlequestion.check(singlequestion.answer);
	System.out.println(singlequestion.ok);
	input.close();
}
}
