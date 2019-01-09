package pathVariable;

public class DataEntity {

	int id;
	String name;
	String property;

	public DataEntity(int id, String name, String property) {
		super();
		this.id = id;
		this.name = name;
		this.property = property;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
