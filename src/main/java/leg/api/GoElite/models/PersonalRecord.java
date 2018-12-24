package leg.api.GoElite.models;

public class PersonalRecord {
	private Integer id;
	private String date;
	private String value;
	
	public PersonalRecord(Integer id, String date, String value) {
		this.id = id;
		this.date = date;
		this.value = value;
	}
	
	public Integer getId() {return this.id;}
	public String getDate() {return this.date;}
	public String getValue() {return this.value;}

}
