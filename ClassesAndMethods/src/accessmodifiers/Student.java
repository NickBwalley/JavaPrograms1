package accessmodifiers;
/*
 * ACCESS LEVELS
 * MODIFIER		CLASS 		PACKAGE		SUBCLASS		WORLD
 * Public		Y			Y			Y				Y
 * Protected	Y			Y			Y				N
 * Private 		Y			N			N				N
 * No Modifier	Y			Y			N				N
 * */
public class Student {
	private String name; 
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}  
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
