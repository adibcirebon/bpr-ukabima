package test.pageable;

import id.co.ukabima.plugins.PageCounter;
import junit.framework.TestCase;

public class PaginateTest extends TestCase {

    public void testPage1() {
        Integer element = 22;
        Integer limit = 10;
        Integer offset = 23;
        System.out.println((element / limit) - ((element - offset) / limit));
        PageCounter pageCounter = new PageCounter(element, limit, offset);
        System.out.println(pageCounter.currentPage());
    }
}
