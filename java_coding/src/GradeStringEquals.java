import java.util.Scanner;

class Grade {
	private String course[];
	private int score[];

	public void setCourse(String[] course) {
		this.course = course;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public void printScore(String course) {
		for(int i = 0; i < this.course.length; i++) {
			if(course.equalsIgnoreCase(this.course[i])) {
				System.out.println(score[i]);
				return;
			}
		}
		System.out.println("없는 과목입니다.");
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			if(course == null || score == null) {
				System.out.println("과목과 성적 데이터가 없습니다.");
				return;
			}
			
			System.out.print("과목 이름 >> ");
			String temp = scanner.next();
			if(temp.equals("그만")) {
				scanner.close();
				return;
			}
			printScore(temp);
		}

	}
}

public class GradeStringEquals {

	public static void main(String[] args) {
		Grade grade = new Grade();

		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};

		grade.setCourse(course);
		grade.setScore(score);

		grade.run();

	}

}
