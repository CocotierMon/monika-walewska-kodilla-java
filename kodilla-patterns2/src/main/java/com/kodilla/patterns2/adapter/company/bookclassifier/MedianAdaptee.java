package com.kodilla.patterns2.adapter.company.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee extends Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics average = new Statistics();
        return average.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics median = new Statistics();
        return median.medianPublicationYear(books);
    }
}
