package leg.api.GoElite.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Wod {
	@Id
	private ObjectId _id;
	
	private String date;
	private String warm_up;
	private String skill;
	private String strenght;
	private String wod;
	private List<RankedUser> ranking;
	
	public Wod() {}
	
	public String getDate() {return this.date;}
	public void setDate(String date) {this.date = date;}
	
	public String getWarmUp() {return this.warm_up;}
	public void setWarmUp(String warm_up) {this.warm_up = warm_up;}
	
	public String getSkill() {return this.skill;}
	public void setSkill(String skill) {this.skill = skill;}
	
	public String getStrenght() {return this.strenght;}
	public void setStrenght(String strenght) {this.strenght = strenght;}
	
	public String getWod() {return this.wod;}
	public void setWod(String wod) {this.wod = wod;}		
	
	public List<RankedUser> getRanking() {return this.ranking;}
	public void setRanking(List<RankedUser> ranking) {this.ranking = ranking;}
}
