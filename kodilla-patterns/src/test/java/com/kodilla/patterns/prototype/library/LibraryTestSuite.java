package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library1 = new Library("Library 1");
        Book book = new Book("Book nr 1", "Author nr1", LocalDate.of(1987, 3, 22));
        Book book1 = new Book("Book nr 2", "Author nr 2", LocalDate.of(2020, 1, 2));
        Book book2 = new Book("Book nr 3", "Author nr 3", LocalDate.of(1999, 5, 20));

        library1.getBooks().add(book);
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);

        //making a shallow copy of object library
        Library clonedLibrary1 = null;
        try {
            clonedLibrary1 = library1.shallowCopy();
            clonedLibrary1.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary1 = null;
        try {
            deepClonedLibrary1 = library1.deepCopy();
            deepClonedLibrary1.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library1.getBooks().remove(book);

        //Then
        System.out.println(library1);
        System.out.println(clonedLibrary1);
        System.out.println(deepClonedLibrary1);
        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, clonedLibrary1.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary1.getBooks().size());
        Assert.assertEquals(clonedLibrary1.getBooks(), library1.getBooks());
        Assert.assertNotEquals(deepClonedLibrary1.getBooks(), library1.getBooks());
    }

}
