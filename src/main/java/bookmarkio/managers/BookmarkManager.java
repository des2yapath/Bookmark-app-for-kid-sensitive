package bookmarkio.managers;

import bookmarkio.entities.User;
import bookmarkio.entities.Bookmark;
import bookmarkio.entities.Book;
import bookmarkio.entities.Movie;
import bookmarkio.entities.WebLink;

public class BookmarkManager {

    private static BookmarkManager instance = new BookmarkManager();

    private BookmarkManager() {
    }

    public static BookmarkManager getInstance() {
        return instance;

    }

    public Movie createMovie(long id, String profileUrl, String title, int releaseYear, String[] directors, String[] cast, String genre, double imdbRating) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setTitle(title);

        return movie;
    }

    public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher, String[] authors, String genre, double amazonRating) {
        Book book = new Book();
        book.setId(id);
        book.setAmazonRating(amazonRating);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setTitle(title);

        return book;
    }

    public WebLink createWebLink(long id, String title, String profileUrl, String url, String host) {
        WebLink weblink = new WebLink();
        weblink.setHost(host);
        weblink.setId(id);
        weblink.setProfileUrl(profileUrl);
        weblink.setTitle(title);
        weblink.setUrl(url);
        return weblink;
    }
