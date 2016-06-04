
public class StudentList implements Aggregate {
	//�t�B�[���h
	private Student[] students;
	private int last = 0;
	
	//�R���X�g���N�^
	public StudentList (int maxsize) {
		this.students = new Student[maxsize];
	}
	
	//���\�b�h
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

	@Override
	public Iterator iterator() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new StudentListIterator(this);
	}

}
