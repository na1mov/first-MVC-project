package model;

import bean.*;

import java.util.List;

public class ModelData {
    private User activeUser;
    private List<User> users;
    private boolean displayDeletedUserList;

    public boolean isDisplayDeletedUserList() {
        return this.displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
