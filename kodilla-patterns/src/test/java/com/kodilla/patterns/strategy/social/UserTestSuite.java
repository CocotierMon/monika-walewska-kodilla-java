package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenPublishes = steven.sharePost();
        System.out.println("Steven publishes on: " + stevenPublishes);
        String johnPublishes = john.sharePost();
        System.out.println("John publishes on: " + johnPublishes);
        String kodillaPublishes = kodilla.sharePost();
        System.out.println("Kodilla publishes on: " + kodillaPublishes);

        //Then
        Assert.assertEquals("Facebook", stevenPublishes);
        Assert.assertEquals("Twitter", johnPublishes);
        Assert.assertEquals("Snapchat", kodillaPublishes);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User steven = new YGeneration("Steven");

        //When
        String stevenPublishes = steven.sharePost();
        System.out.println("Steven publishes on: " + stevenPublishes);
        steven.setPulishingStrategy(new SnapchatPublisher());
        stevenPublishes = steven.sharePost();
        System.out.println("Steven now publishes on: " + stevenPublishes);

        //Then
        Assert.assertEquals("Snapchat", stevenPublishes);
    }
}
