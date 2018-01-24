package patters.structure.adapter;

/**
 * Created by Alex on 22.01.2018.
 */
public class AdapterFromDataBAseToApp extends JavaApllication implements DataBase {
	@Override
	public void insert() {
		saveObject();
	}

	@Override
	public void delete() {
		deleteObject();
	}

	@Override
	public void update() {
		updateObject();
	}

	@Override
	public void select() {
		selectObject();
	}
}
