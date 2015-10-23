package cn.wd.jiekou;

public interface TopicDao {
	
	public Topic findTopic(int topicId);
	public int addTopic(Topic topic);
	public int insertTopic(int topicId);
	public int deleteTopic(Topic topic);
	

}
