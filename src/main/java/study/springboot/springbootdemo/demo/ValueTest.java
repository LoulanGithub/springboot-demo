/*********************************************************
 ** Description: SpringEL表达式测试
 ** <br><br>
 ** Date: Created in 2018/11/23  15:56
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ValueTest
{
	@Value("#{9.3E3}")
	private double d;

	@Value("#{'随便来一个吧，只是测试而已'}")
	private String str;

	@Value("#{new java.util.Date()}")
	private Date date;

	@Value("#{23<9?'运算测试失败' : '运算测试成功'}")
	private String math;

	@Value("${sss.s}")
	private String profile;

	public void print()
	{
		System.out.println(d);
		System.out.println(str);
		System.out.println(date);
		System.out.println(math);
		System.out.println(profile);
	}
}
