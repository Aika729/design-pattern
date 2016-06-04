
public class Student {
	//フィールド
	private String name;
	private String hobby;
	
	//コンストラクタ
	public Student (String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
	}
	
	//getメソッド
	public String getName () {
		return this.name;
	}
	public String getHobby () {
		return this.hobby;
	}
	
}
