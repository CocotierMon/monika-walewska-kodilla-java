package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.company.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        Set<Book> books = new HashSet<>();
        Book book1 = new Book("idjhsc", "vckmzc", 2000, "7852155");
        Book book2 = new Book("c,,cs ", "vzsnnv", 2010, "63232361");
        Book book3 = new Book("sdfuis", "vzvmkmv", 2020, "565448");
        Book book4 = new Book("sdcjscj", "zvmkv", 1990, "98511113");
        Book book5 = new Book("dcvsj", "vzsmv", 1950, "154432647");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        System.out.println(medianAdapter.publicationYearMedian(books));
        assertEquals(2000, medianAdapter.publicationYearMedian(books));
    }
}
