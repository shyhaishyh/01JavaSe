package cn.wd.jiekou;

//ʵ����
public class UserDaoImpl implements UserDao {

	@Override
	public User findUser(String uName) {
		if(user.name.equals(uName)){
			System.out.println("�ҵ��ˣ������û���Ϊ��" + user.name
					+ "������Ϊ��" + user.pwd);
		}else{
			System.out.println("δ�ҵ���");
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
