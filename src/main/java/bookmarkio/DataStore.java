package bookmarkio;

import bookmarkio.entities.Bookmark;
import bookmarkio.entities.User;
import bookmarkio.entities.UserBookmark;
import bookmarkio.managers.UserManager;
import bookmarkio.constants.Gender;
import bookmarkio.constants.UserType;

public class DataStore {

    private static final int TOTAL_USER_COUNT = 5;
    private static User[] users = new User[TOTAL_USER_COUNT];
    private static final int BOOKMARK_COUNT_PER_TYPE = 5;
    private static final int BOOKMARK_TYPES_COUNT = 3;
    private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
    private static final int USER_BOOKMARK_LIMIT = 5;
    private static UserBookmark[] userbookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
    
    public static void loadData(){
        LoadUsers();
        LoadWebLink();
        
    }

    private static void LoadUsers() {
       users[0]=UserManager.getInstance().createUser(1000,"user0@yahoo.com","test","Rohan","M",Gender.MALE, UserType.USER);
    
    }

    private static void LoadWebLink() {
        throw new UnsupportedOperationException("Not supported yet.");
        
    
    }
    
    
    
    }
}
