package leg.api.GoElite.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {
	@Id
	private ObjectId _id;
	
	private String name;
	private String email;
	private String sex;
	private int weight;
	private String phone;
	private String cpf;
	private String adress;
	private String dob;
	private String box;
	private String photo_url;
	
	public User() {}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public String getEmail() {return this.email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getSex() {return this.sex;}
	public void setSex(String sex) {this.sex = sex;}
	
	public int getWeight() {return this.weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	public String getPhone() {return this.phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	public String getCPF() {return this.cpf;}
	public void setCPF(String cpf) {this.cpf = cpf;}
	
	public String getAdress() {return this.adress;}
	public void setAdress(String adress) {this.adress = adress;}
	
	public String getDOB() {return this.dob;}
	public void setDOB(String dob) {this.dob = dob;}
	
	public String getBox() {return this.box;}
	public void setBox(String box) {this.box = box;}
	
	public String getPhotoUrl() {return this.photo_url;}
	public void setPhotoUrl(String photo_url) {this.photo_url = photo_url;}
}
