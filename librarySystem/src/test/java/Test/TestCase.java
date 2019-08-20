package Test;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aowin.library.Util.DataFormat;
import com.aowin.library.dao.LibraryDao;
import com.aowin.library.model.BookRecord;
import com.aowin.library.model.User;
import com.aowin.library.service.LibraryService;
public class TestCase {
	/*private BeanFactory factory;*/
	private ClassPathXmlApplicationContext cla;
	@Before
	public void init() {
	     cla=new ClassPathXmlApplicationContext(new String[] {"spring-mvc.xml"});
	}
	@Test
	public void testDataSource() throws SQLException {
		DataSource source=cla.getBean("dataSource",DataSource.class);
		Connection conn=source.getConnection();
		System.out.println(conn);
	}
	@Test
	public void test1() {
		LibraryService service=cla.getBean("libraryService",LibraryService.class);
	    User user=service.checkUser("ÕÅÈý","111111");
	    System.out.println(user);
	}
	@Test
	public void test2() {
		LibraryDao dao=cla.getBean("libraryDao",LibraryDao.class);
		List<BookRecord>list=dao.getOwnBooks(2);
		System.out.println(list);
	}
	@Test
	public void test3() throws FileNotFoundException {
		LibraryDao dao=cla.getBean("libraryDao",LibraryDao.class);
		int n=dao.bookToBack(new String[]{"1","3"},DataFormat.getDataFormat().format(new Date()));
		Assert.assertEquals(2,n);
	}
	@After
	public void after(){
		cla.close();
	}
}
