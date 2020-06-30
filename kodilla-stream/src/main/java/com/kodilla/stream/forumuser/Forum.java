package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(1, "aaaaaa", 'M', 1998,12, 10, 3));
        theUsersList.add(new ForumUser(2, "bbbbbb", 'M', 2000,10, 10, 3));
        theUsersList.add(new ForumUser(3, "cccccc", 'F', 1985,3, 20, 10));
        theUsersList.add(new ForumUser(4, "dddddd", 'F', 2000,9, 15, 0));
        theUsersList.add(new ForumUser(5, "eeeeee", 'M', 2010,11, 1, 6));
        theUsersList.add(new ForumUser(6, "ffffff", 'M', 2000,5, 15, 1));
        theUsersList.add(new ForumUser(4, "gggggg", 'M', 1999,4, 3, 50));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}
