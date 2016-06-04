
public class StudentListIterator implements Iterator {
	//フィールド
	private StudentList studentlist;
	private int index;
	
	//コンストラクタ
	public StudentListIterator (StudentList studentlist) {
		this.studentlist = studentlist;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO 自動生成されたメソッド・スタブ
		if (index < studentlist.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		// TODO 自動生成されたメソッド・スタブ
		Student student = studentlist.getStudentAt(index);
		index++;
		return student;
	}

}
