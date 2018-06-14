package demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 
 * 在contextInitialized中调用TestShedule.run()启动后台任务；在contextDestroyed中调用TestShedule.stop()停止后台任务。
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
