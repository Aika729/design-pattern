
public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StudentList studentlist = new StudentList(4);
		studentlist.appendStudent(new Student("aika","�X�m�[�{�[�h"));
		studentlist.appendStudent(new Student("bbb","music"));
		studentlist.appendStudent(new Student("ccc","game"));
		studentlist.appendStudent(new Student("ddd","shopping"));
		
		Iterator it = studentlist.iterator();
		
		while (it.hasNext()) {
			Student student = (Student)it.next();
			System.out.println("�͂��߂܂��āA" + student.getName() + "�ł��B���" + student.getHobby() + "�ł��B");
		}

	}

}
