/*********************************************************
 ** Description: @Scope测试学习
 ** <br><br>
 ** Date: Created in 2018/11/23  13:37
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import study.springboot.springbootdemo.domain.User;

@Configuration
public class ScopeTest
{
	private static int num=0;
	/**
	 * Description : 单例模式
	 * @para       
	 * @return
	 * @exception
	 * */
	@Bean(name = "userSingleton")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public User getSigleton ()
	{
		return new User("scope-Singleton-"+(num++),12,"scope-test");
	}

	/**
	 * Description : 多礼模式
	 * @para       
	 * @return
	 * @exception
	 * */
	@Bean(name = "userPrototype")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public User getPrototype ()
	{
		return new User("scope-Prototype-"+(num++),12,"scope-test");
	}

	/**
	 * Description : 一次请求模式
	 * @para       
	 * @return
	 * @exception
	 * */
	@Bean(name = "userRequest")
	@Scope(WebApplicationContext.SCOPE_SESSION)
	public User getRequest ()
	{
		return new User("scope-Request-"+(num++),12,"scope-test");
	}
}
