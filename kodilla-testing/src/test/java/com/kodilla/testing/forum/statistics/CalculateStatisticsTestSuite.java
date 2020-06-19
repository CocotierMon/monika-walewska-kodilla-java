package com.kodilla.testing.forum.statistics;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatisticsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();
        //When
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        //Then
        assertEquals(10, statisticsMock.usersNames().size());
        assertEquals(10, statisticsMock.postsCount());
        assertEquals(20, statisticsMock.commentsCount());
        assertEquals(1, aPPU, 0.01);
        assertEquals(2, aCPU, 0.01);
        assertEquals(2, aCPP, 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(10, statisticsMock.usersNames().size());
        assertEquals(0, statisticsMock.postsCount());
        assertEquals(20, statisticsMock.commentsCount());
        assertEquals(0, aPPU, 0.01);
        assertEquals(2, aCPU, 0.01);
        assertEquals(0, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
   @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(10, statisticsMock.usersNames().size());
        assertEquals(10, statisticsMock.postsCount());
        assertEquals(0, statisticsMock.commentsCount());
        assertEquals(1, aPPU, 0.01);
        assertEquals(0, aCPU, 0.01);
        assertEquals(0, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWithCommentsLesThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(10, statisticsMock.usersNames().size());
        assertEquals(20, statisticsMock.postsCount());
        assertEquals(10, statisticsMock.commentsCount());
        assertEquals(2, aPPU, 0.01);
        assertEquals(1, aCPU, 0.01);
        assertEquals(0.5, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWithCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(10, statisticsMock.usersNames().size());
        assertEquals(10, statisticsMock.postsCount());
        assertEquals(20, statisticsMock.commentsCount());
        assertEquals(1, aPPU, 0.01);
        assertEquals(2, aCPU, 0.01);
        assertEquals(2, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(0, statisticsMock.usersNames().size());
        assertEquals(20, statisticsMock.postsCount());
        assertEquals(10, statisticsMock.commentsCount());
        assertEquals(0, aPPU, 0.01);
        assertEquals(0, aCPU, 0.01);
        assertEquals(0.5, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWithHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double aPPU = calculateStatistics.getAveragePostsPerUsers();
        double aCPU = calculateStatistics.getAverageCommentsPerUsers();
        double aCPP = calculateStatistics.getAverageCommentsPerPost();
        //Then
        assertEquals(100, statisticsMock.usersNames().size());
        assertEquals(20, statisticsMock.postsCount());
        assertEquals(10, statisticsMock.commentsCount());
        assertEquals(0.2, aPPU, 0.01);
        assertEquals(0.1, aCPU, 0.01);
        assertEquals(0.5, aCPP, 0.01);
        calculateStatistics.showStatistics();
    }
}
