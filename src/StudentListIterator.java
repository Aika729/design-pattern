
public class StudentListIterator implements Iterator {
	//�t�B�[���h
	private StudentList studentlist;
	private int index;
	
	//�R���X�g���N�^
	public StudentListIterator (StudentList studentlist) {
		this.studentlist = studentlist;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if (index < studentlist.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Student student = studentlist.getStudentAt(index);
		index++;
		return student;
	}

}
