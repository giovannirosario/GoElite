package leg.api.GoElite.models;

public class RankedUser {
	private String _id;
	private String name;
	private String photo_url;
	private String score;
	private String class_time;
	private String sex;
	
	public RankedUser(String _id, String name, String photo_url, String score, String class_time, String sex) {
		this._id = _id;
		this.name = name;
		this.photo_url = photo_url;
		this.score = score;
		this.class_time = class_time;
		this.sex = sex;	
	}
	
	public String getId() {return this._id;}
	public String getName() {return this.name;}
	public String getPhotoUrl() {return this.photo_url;}
	public String getScore() {return this.score; }
	public String getClassTime() {return this.class_time;}
	public String getSex() {return this.sex;}
}
