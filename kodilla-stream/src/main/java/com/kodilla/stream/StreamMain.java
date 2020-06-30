package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theListOfForumUsers = new Forum();
        Map<Integer, ForumUser> theResultOfFiltration = theListOfForumUsers.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getNumOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

                        theResultOfFiltration.entrySet().stream()
                                .map(entry -> entry.getKey() + ": " + entry.getValue())
                                .forEach(System.out::println);
    }
}


