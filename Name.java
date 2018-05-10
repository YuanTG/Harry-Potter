
public class Name {
	String name = "";
	int count = 0;
	public Name(String name){
		super();
		this.name = name;
		this.count = 1;
	}
	public void increase(){
		this.count++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}




