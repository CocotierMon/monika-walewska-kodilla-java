package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }


    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser1 = new LibraryUser("Adam", "Miauczyński", "79865085");
        LibraryUser libraryUser2 = new LibraryUser("Jan", "Kowalski", "7589876546");
        LibraryUser libraryUser3 = new LibraryUser("Anna", "Kowalska", "6875456879");
        List<Book> borrowed0 = new ArrayList<>();
        List<Book> borrowed1 = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        borrowed1.add(book1);
        List<Book> borrowed5 = new ArrayList<>(5);
        Book book2 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book3 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book4 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book5 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book6 = new Book("Secrets of Alamo", "John Smith", 2008);
        borrowed5.add(book2);
        borrowed5.add(book3);
        borrowed5.add(book4);
        borrowed5.add(book5);
        borrowed5.add(book6);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1))
                .thenReturn(borrowed0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(borrowed1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3))
                .thenReturn(borrowed5);

        //When
        List<Book> borrowedBooks0 = libraryDatabaseMock.listBooksInHandsOf(libraryUser1);
        List<Book> borrowedBooks1 = libraryDatabaseMock.listBooksInHandsOf(libraryUser2);
        List<Book> borrowedBooks5 = libraryDatabaseMock.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(0,borrowedBooks0.size());
        assertEquals(1,borrowedBooks1.size());
        assertEquals(5,borrowedBooks5.size());
    }
}
