package OOP;

public abstract class abs {

	String Title;
	abstract void setTitle(String title);
	String getTitle() {
		return Title;
	}
	void print() {
		System.out.println(getTitle());
	}
}
