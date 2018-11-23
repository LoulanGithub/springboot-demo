/*********************************************************
 ** Description: @Profile试炼场
 ** <br><br>
 ** Date: Created in 2018/11/23  9:51
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import study.springboot.springbootdemo.domain.User;

@Configuration
public class ProfileTest
{
	@Bean(name = "user", initMethod = "init", destroyMethod = "destory")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Profile("dev")
	public User devUser()
	{
		User user = new User("dev", 12, "profile-dev");

		return user;
	}


	@Bean(name = "user", initMethod = "init", destroyMethod = "destory")
	@Profile("test")
	public User testUser ()
	{
		User user = new User("test", 12, "profile-test");

		return user;
	}
}
