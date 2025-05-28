package bookmarkio;

import bookmarkio.entities.Bookmark;
import bookmarkio.entities.User;
import bookmarkio.managers.BookmarkManager;
import bookmarkio.managers.UserManager;

public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    private static void LoadData() {
        System.out.println("1. Data is loading..");

        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

        System.out.println("Printing data");
        printUserData();
        printBookmarkData();

    }

    private static void printUserData() {
        for (User user : users) {
            System.out.println(user);

        }

    }

    private static void printBookmarkData() {
        for (Bookmark[] bookmarklist : bookmarks) {

            for (Bookmark bookmark : bookmarklist) {
                System.out.println(bookmark);

            }

        }

    }

    private static void startBookmarking() {
        System.out.println("\n 2. Bookmarking...");
        for (User user : users) {
            View.Bookmark(user, bookmarks);
        }
    }

    public static void main(String[] args) {
        LoadData();
        startBookmarking();

    }

}
