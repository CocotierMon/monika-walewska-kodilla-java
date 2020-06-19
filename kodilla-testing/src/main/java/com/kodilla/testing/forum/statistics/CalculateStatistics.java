package com.kodilla.testing.forum.statistics;

public class CalculateStatistics{
   private double numOfUsers;
   private double numOfPosts;
   private double numOfComments;
   private double averagePostsPerUsers;
   private double averageCommentsPerUsers;
   private double averageCommentsPerPost;

    public CalculateStatistics(){
        this.numOfUsers = getNumOfUsers();
        this.numOfPosts = getNumOfPosts();
        this.numOfComments = getNumOfComments();
        this.averagePostsPerUsers = getAveragePostsPerUsers();
        this.averageCommentsPerUsers = getAverageCommentsPerUsers();
        this.averageCommentsPerPost = getAverageCommentsPerPost();
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numOfUsers=statistics.usersNames().size();
        numOfPosts=statistics.postsCount();
        numOfComments=statistics.commentsCount();

        if(numOfUsers == 0){
            averagePostsPerUsers = 0;
            averageCommentsPerUsers = 0;
        } else {
            averagePostsPerUsers = numOfPosts / numOfUsers;
            averageCommentsPerUsers=numOfComments/numOfUsers;
        }

        if(numOfPosts == 0){
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = numOfComments / numOfPosts;
        }
    }

    public double getNumOfUsers() {
        return numOfUsers;
    }

    public double getNumOfPosts() {
        return numOfPosts;
    }

    public double getNumOfComments() {
        return numOfComments;
    }

    public double getAveragePostsPerUsers() {
        return averagePostsPerUsers;
    }

    public double getAverageCommentsPerUsers() {
        return averageCommentsPerUsers;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void showStatistics(){
        System.out.println("Statystyki forum: " + "numOfUsers=" + numOfUsers + ", numOfPosts=" + numOfPosts +
                ", numOfComments=" + numOfComments + ", averagePostsPerUsers=" + averagePostsPerUsers +
                ", averageCommentsPerUsers=" + averageCommentsPerUsers +
                ", averageCommentsPerPost=" + averageCommentsPerPost);
    }
}