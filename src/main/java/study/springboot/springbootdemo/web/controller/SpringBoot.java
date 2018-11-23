/*********************************************************
 ** Description: 控制层
 ** <br><br>
 ** Date: Created in 2018/11/22  17:43
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springboot.springbootdemo.domain.User;

@RestController
@RequestMapping("/test")
public class SpringBoot
{
	/**
	 * Description : 用来测试@Profile
	 * @para
	 * @return
	 * @exception
	 * */
	@Autowired
	private User user;
	@RequestMapping("/profile")
	public User profileTest()
	{
		return user;
	}
}
