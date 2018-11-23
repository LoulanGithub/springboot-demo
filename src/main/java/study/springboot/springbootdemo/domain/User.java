/*********************************************************
 ** Description: 普通的bean对象
 ** <br><br>
 ** Date: Created in 2018/11/23  9:50
 ** @author 楼兰
 ** @version 0.0.0
 *********************************************************/
package study.springboot.springbootdemo.domain;

public class User
{
	private String name;
	private int age;
	private String habit;

	public User(String name, int age, String habit)
	{
		this.name = name;
		this.age = age;
		this.habit = habit;
	}



	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getHabit()
	{
		return habit;
	}

	public void setHabit(String habit)
	{
		this.habit = habit;
	}

	public void init ()
	{
		System.out.println("user 注册进入了spring容器！");
	}

	public void destory ()
	{
		System.out.println("user 已经进行了自我毁灭！");
	}
}
