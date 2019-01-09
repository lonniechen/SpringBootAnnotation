package pathVariable;

import java.util.HashMap;

//this is the mock database
public class Database {
	static public HashMap<Integer, DataEntity> dataEntities = new HashMap<>();

	static {
		DataEntity dataEntity1 = new DataEntity(1, "Data1", "DataEntity");
		DataEntity dataEntity2 = new DataEntity(2, "Data2", "DataEntity");
		DataEntity dataEntity3 = new DataEntity(3, "Data3", "DataEntity");

		dataEntities.put(dataEntity1.getId(), dataEntity1);
		dataEntities.put(dataEntity2.getId(), dataEntity2);
		dataEntities.put(dataEntity3.getId(), dataEntity3);
	}
}
