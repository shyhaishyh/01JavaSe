package cn.wd.jiekou;

//实现类
public class UserDaoImpl implements UserDao {

	@Override
	public User findUser(String uName) {
		if(user.name.equals(uName)){
			System.out.println("找到了！您的用户名为：" + user.name
					+ "，密码为：" + user.pwd);
		}else{
			System.out.println("未找到！");
		}
		return null;
	}

	@Override
	public int addUser(User user) {
		
		return 0;
	}

	@Override
	public int insertUser(User user) {
		
		return 0;
	}
}
