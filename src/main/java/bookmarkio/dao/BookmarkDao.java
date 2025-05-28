package bookmarkio.dao;

import bookmarkio.DataStore;
import bookmarkio.entities.Bookmark;
import bookmarkio.entities.UserBookmark;

public class BookmarkDao {

    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);

    }

}
