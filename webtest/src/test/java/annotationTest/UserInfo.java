package annotationTest;

import lombok.Data;

@Data
public class UserInfo {

	private String userUid;
	private String userName;
	private int age;
	private byte sex;

	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	public String getUserUid() {
		return userUid;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSex(byte sex) {

		this.sex = sex;
	}

	public byte getSex() {
		return sex;
	}
}
