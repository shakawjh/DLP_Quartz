package demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 
 * ��contextInitialized�е���TestShedule.run()������̨������contextDestroyed�е���TestShedule.stop()ֹͣ��̨����
 *
 */
public class ServiceLoader implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		try {
			TestShedule.run();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {
		try {
			TestShedule.stop();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
