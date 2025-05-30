package bookmarkio.controllers;

import bookmarkio.entities.Bookmark;
import bookmarkio.entities.User;
import bookmarkio.managers.BookmarkManager;

public class BookmarkController {

    private static BookmarkController instance = new BookmarkController();

    private BookmarkController() {
    }

    public static BookmarkController getInstance() {
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);

    }
}
