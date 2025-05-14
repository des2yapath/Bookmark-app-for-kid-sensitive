package bookmarkio;

import bookmarkio.entities.Bookmark;
import bookmarkio.entities.User;
import bookmarkio.entities.UserBookmark;
import bookmarkio.managers.UserManager;
import bookmarkio.constants.Gender;
import bookmarkio.constants.UserType;
import bookmarkio.managers.BookmarkManager;
import bookmarkio.constants.MovieGenre;
import static bookmarkio.constants.MovieGenre.COMEDY;
import static bookmarkio.constants.MovieGenre.CRIME;
import static bookmarkio.constants.MovieGenre.MYSTERY;
import static bookmarkio.constants.MovieGenre.THRILLER;
import static bookmarkio.constants.MovieGenre.BIOGRAPHY;

public class DataStore {

    private static final int TOTAL_USER_COUNT = 5;
    private static User[] users = new User[TOTAL_USER_COUNT];

    public static User[] getUsers() {
        return users;
    }

    public static Bookmark[][] getBookmarks() {
        return bookmarks;
    }
    private static final int BOOKMARK_COUNT_PER_TYPE = 5;
    private static final int BOOKMARK_TYPES_COUNT = 3;
    private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
    private static final int USER_BOOKMARK_LIMIT = 5;
    private static final UserBookmark[] userbookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];

    public static void loadData() {
        LoadUsers();
        LoadWebLinks();
        LoadMovies();
        LoadBooks();

    }

    private static void LoadUsers() {
        users[0] = UserManager.getInstance().createUser(1000, "user0@yahoo.com", "test", "Rohan", "M", Gender.MALE, UserType.USER);
        users[1] = UserManager.getInstance().createUser(1001, "user1@yahoo.com", "test", "Arnab", "M", Gender.MALE, UserType.USER);
        users[2] = UserManager.getInstance().createUser(1002, "user2@yahoo.com", "test", "Sara", "M", Gender.FEMALE, UserType.EDITOR);
        users[3] = UserManager.getInstance().createUser(1003, "user3@yahoo.com", "test", "Aadya", "J", Gender.FEMALE, UserType.EDITOR);
        users[4] = UserManager.getInstance().createUser(1004, "user4@yahoo.com", "test", "Karan", "D", Gender.MALE, UserType.CHIEF_EDITOR);

    }

    private static void LoadWebLinks() {

        bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", "unknown");
        bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "	http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "www.stackoverflow.com", "unknown");
        bookmarks[0][2] = BookmarkManager.getInstance().createWebLink(2002, "Interface vs Abstract Class", "http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com", "unknown");
        bookmarks[0][3] = BookmarkManager.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis", "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu", "unknown");
        bookmarks[0][4] = BookmarkManager.getInstance().createWebLink(2004, " Virtual Hosting and Tomcat", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "	http://tomcat.apache.org", "unknown");

    }

    private static void LoadMovies() {
        bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "https://www.netflix.com/in/title/81447462", "Amar Singh Chamkila", 2024, new String[]{"Imtiaz Ali"}, new String[]{"Diljit Dosanjh", "Parineeti Chopra"}, MovieGenre.BIOGRAPHY, 7.5);
        bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3001, "https://www.netflix.com/in/title/81447463", "Wild Wild Punjab", 2024, new String[]{"Simarpreet Singh"}, new String[]{"Varun Sharma", "Sunny Singh", "Manjot Singh"}, COMEDY, 6.8);
        bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3002, "https://www.netflix.com/in/title/81447464", "Sector 36", 2024, new String[]{"Aditya Nimbalkar"}, new String[]{"Vikrant Massey", "Deepak Dobriyal"}, CRIME, 7.2);
        bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3003L, "https://www.netflix.com/in/title/81447465", "CTRL", 2024, new String[]{"Vikramaditya Motwane"}, new String[]{"Ananya Panday", "Vihaan Samat"}, THRILLER, 7.0);
        bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3004L, "https://www.netflix.com/in/title/81447466", "Do Patti", 2024, new String[]{"Shashanka Chaturvedi"}, new String[]{"Kajol", "Kriti Sanon"}, MYSTERY, 7.3);
    }

    private static void LoadBooks() {
        bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000L, "Clean Code", "https://example.com/clean-code", 2008, "Prentice Hall", new String[]{"Robert C. Martin"}, "technical", 4.7);
        bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001L, "The Art Spirit", "https://example.com/the-art-spirit", 1923, "J.B. Lippincott & Co.", new String[]{"Robert Henri"}, "art", 4.3);
        bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002L, "Steve Jobs", "https://example.com/steve-jobs", 2011, "Simon & Schuster", new String[]{"Walter Isaacson"}, "biography", 4.5);
        bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003L, "The Republic", "https://example.com/the-republic", -380, "Penguin Classics", new String[]{"Plato"}, "philosophy", 4.4);
        bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004L, "Gone Girl", "https://example.com/gone-girl", 2012, "Crown Publishing Group", new String[]{"Gillian Flynn"}, "mystery", 4.1);

    }

}
