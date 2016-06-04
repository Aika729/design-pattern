
public class StudentList implements Aggregate {
	//フィールド
	private Student[] students;
	private int last = 0;
	
	//コンストラクタ
	public StudentList (int maxsize) {
		this.students = new Student[maxsize];
	}
	
	//メソッド
	public Student getStudentAt (int index) {
		return this.students[index];
	}

	public void appendStudent (Student student) {
		this.students[last] = student;
		last++;
	}

	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return new StudentListIterator(this);
	}

}
