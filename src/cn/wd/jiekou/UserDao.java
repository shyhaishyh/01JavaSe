package cn.wd.jiekou;

//�ӿ���
public interface UserDao{
	
	User user = new User();
	
	public User findUser(String uName);
	public int addUser(User user);
	public int insertUser(User user);
	
}
