/*********************************************************
 ** Description: TODO 
 ** <br><br>
 ** Date: Created in 2018/11/23  15:18
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import study.springboot.springbootdemo.domain.Dog;

@Component
@ImportResource(value = "classpath:spring.xml")
public class ImportResourceTest
{
	@Autowired
	private Dog dog;

	public Dog getDog ()
	{
		return dog;
	}
}
