/*********************************************************
 ** Description: 控制层
 ** <br><br>
 ** Date: Created in 2018/11/22  17:43
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springboot.springbootdemo.demo.ImportResourceTest;
import study.springboot.springbootdemo.demo.ValueTest;
import study.springboot.springbootdemo.domain.Dog;
import study.springboot.springbootdemo.domain.User;

import java.util.HashMap;
import java.util.Map;

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
	@Value("${sss.s}")
	private String ss;
	@RequestMapping("/profile")
	public User profileTest()
	{
		System.out.println(ss);
		return user;
	}

	/**
	 * Description : 用来测试scope的单例/多例等模式
	 * @para       
	 * @return
	 * @exception
	 * */
	@Autowired
	private User userSingleton;
	@Autowired
	private User userPrototype;
	//@Autowired
	//private User userRequest;
	@RequestMapping("/scope")
	public Map scopeTest1 ()
	{

		/*看哈希值就知道是不是用一个对象了，所以这里放回去的是哈希值*/
		Map<String, Integer> map = new HashMap<>();
		map.put("单例哈希值", userSingleton.hashCode());
		map.put("多例哈希值", userPrototype.hashCode());
		//map.put("请求哈希值", userRequest.hashCode());
		return map;
	}

	/**
	 * Description : 导入资源xml文件测试
	 * @para       
	 * @return
	 * @exception
	 * */
	@Autowired
	private ImportResourceTest importResourceTest;
	@RequestMapping("/importResource")
	public Dog importResourceTest ()
	{
		return importResourceTest.getDog() ;
	}


	/**
	 * Description : 这个是SpringEL表达式的测试
	 * @para       
	 * @return
	 * @exception
	 * */
	@Autowired
	private ValueTest valueTest;
	@RequestMapping("/value")
	public void ValueTest ()
	{
		valueTest.print();
	}
}


/**
 * Description : 这个是为测试多例模式和单例模式的区别使用的
 * @para       
 * @return
 * @exception
 * */
@RestController
@RequestMapping("/test2")
class TestScopePrototype {
	@Autowired
	private User userSingleton;
	@Autowired
	private User userPrototype;
	//@Autowired
	//private User userRequest;
	@RequestMapping("/scope2")
	public Map scopeTest1 ()
	{

		Map<String, Integer> map = new HashMap<>();
		map.put("单例", userSingleton.hashCode());
		map.put("多例", userPrototype.hashCode());
		//map.put("请求", userRequest);
		return map;
	}
}