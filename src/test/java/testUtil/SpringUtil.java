package testUtil;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ���������ļ������ô���beanId������Ӧ�Ķ���
 * @author Jie
 *
 */
public final class SpringUtil {

	static ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static <T> T getBean(String beanId){
		return (T) ac.getBean(beanId);
	}
}
