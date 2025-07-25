package bookmarkio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import bookmarkio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligible() {
		//test 1 - porn in url --false
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com", "unknown");
		boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse("for the url, isKidFriendlyEligible() must return false" , isKidFriendlyEligible);
		
		//test 2-  adult in host --false
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.adultworld.com", "unknown");
	    isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	    assertFalse("for the adult in host , isKidFriendlyEligible() must return false" , isKidFriendlyEligible);
	    
		//test 3 - adult in url but not in host part --true
	    webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/adult-java/taming-tiger--part-2.html", "http://www.javaworld.com", "unknown");
	    isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	    assertTrue("for the adult in url but not host , isKidFriendlyEligible() must return true" , isKidFriendlyEligible);
	    
		//test 4 - porn in title -- false
	    webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Porn 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", "unknown");
	    isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	    assertFalse("for the porn in title , isKidFriendlyEligible() must return false" , isKidFriendlyEligible);
	    
		//test 5-  adult in title only --true
	    webLink = BookmarkManager.getInstance().createWebLink(2000, "Adult Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", "unknown");
	    isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	    assertTrue("for the adult in title , isKidFriendlyEligible() must return true" , isKidFriendlyEligible);
	    
	}
  
}
