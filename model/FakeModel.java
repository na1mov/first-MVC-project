package model;

import bean.*;

import java.util.List;
import java.util.ArrayList;

public class FakeModel implements Model {
    private final ModelData modelData = new ModelData();

    public ModelData getModelData() {
        return modelData;
    }

    public void loadUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("A", 1, 1));
        list.add(new User("B", 2, 1));
        modelData.setUsers(list);
    }

    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
