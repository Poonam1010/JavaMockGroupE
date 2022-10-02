package com.test.javaquiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Question_Answers2 {
	public static void getQuestions() {
		HashSet <String> ans1=new HashSet<String>();
		ans1.add("a) Guido van Rossum \n");
		ans1.add("b) James Gosling \n");
		ans1.add("c) Dennis Ritchie \n");
		ans1.add("d) Bjarne Stroustrup \n");
		ans1.remove(",");
		
		HashSet <String> ans2 = new HashSet<String>();
		ans2.add("a) JRE");
		ans2.add("b) JIT");
		ans2.add("c) JDK");
		ans2.add("d) JVM");
		
		HashSet<String> ans3 = new HashSet<String>();
		ans3.add("a) Object-oriented");
		ans3.add("b)Use of pointers");
		ans3.add("c)Portable");
		ans3.add("d)Dynamic and Extensible");
		
		HashSet<String> ans4 = new HashSet<String>();
		ans4.add("a) Object-oriented");
		ans4.add("b) Use of pointers");
		ans4.add("c) Portable");
		ans4.add("d) Dynamic and Extensible");
		
		HashSet <String> ans5=new HashSet<String>();
		ans5.add("a) .js ");
		ans5.add("b) .txt");
		ans5.add("c) .class");
		ans5.add("d) .java");
		
		HashSet <String> ans6=new HashSet<String>();
		ans6.add("a) MAVAN_Path");
		ans6.add("b) JavaPATH");
		ans6.add("c) jAVA");
		ans6.add("d) JAVA_HOME");

		HashSet <String> ans7=new HashSet<String>();
		ans7.add("a) Polymorphism");
		ans7.add("b) Inheritance");
		ans7.add("c) Compilation");
		ans7.add("d) Encapsulation");
		
		HashSet <String> ans8=new HashSet<String>();
		ans8.add("a).txt");
		ans8.add("b).js");
		ans8.add("c).class");
		ans8.add("d) .java");
		
		HashSet <String> ans9=new HashSet<String>();
		ans9.add("a )break");
		ans9.add("b)continue");
		ans9.add("c)) for()");
		ans9.add("d)) if()");
		
		HashSet <String> ans10=new HashSet<String>();
		ans10.add("a) ArrayListt");
		ans10.add("b) Abstract class");
		ans10.add("c) Object class");
		ans10.add("d) String");
		
		
		HashMap <String,HashSet <String>> que=new HashMap <String,HashSet <String>>();
		que.put("Who invented Java Programming?", ans1);
		
		que.put("Which component is used to compile, debug and execute the java programs?", ans2);
		
		que.put("Which one of the following is not a Java feature?", ans3);
		
		que.put("Which of these cannot be used for a variable name in Java?", ans4);
		
		que.put("What is the extension of java code files?", ans5);
		
		que.put("Which environment variable is used to set the java path?", ans6);
		
		que.put("Which of the following is not an OOPS concept in Java?", ans7);
		
		que.put("What is the extension of compiled java classes?", ans8);
		
		que.put("Which of these are selection statements in Java?", ans9);
		
		que.put("Which of the following is a superclass of every class in Java?", ans10);
		
		
        Set <String> queSet = que.keySet();
		for(String s:queSet) {
			System.out.println("");
			System.out.println("Question : "+s);
			System.out.println("");
			System.out.println("Options : \n"+que.get(s));
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



