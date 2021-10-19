package enlisted;

import java.util.Scanner;

class Student {
	String subject;
	String stu_id;
	int score;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) {
		subject = initName;
		stu_id = initId;
		score = initScore;
	}
}

public class subjectID {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of subjects:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Subject, ID, Score:");
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.subject = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextInt();
			if (max.score < stu.score) {
				max.subject = stu.subject;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.subject = stu.subject;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		System.out.println("name, ID of the highest score and the lowest score:");
		System.out.println(max.subject + " " + max.stu_id);
		System.out.println(min.subject + " " + min.stu_id);
		in.close();
	}
}