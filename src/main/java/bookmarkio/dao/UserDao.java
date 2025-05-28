
package bookmarkio.dao;

import bookmarkio.DataStore;
import bookmarkio.entities.User;


public class UserDao {
    public User[] getUsers(){
        return DataStore.getUsers();
    }
       
}
