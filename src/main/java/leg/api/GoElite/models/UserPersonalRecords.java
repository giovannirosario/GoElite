package leg.api.GoElite.models;

import java.util.HashMap;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class UserPersonalRecords {
	@Id
	private ObjectId _id;

	private String user_id;
	private HashMap<Integer, List<PersonalRecord>> personal_records;
}
