package cn.wd.fengzhuang;

public class BoardTest {

	public static void main(String[] args) {
		
		Board board = new Board();
		BoardUser bu = new BoardUser();
		board.boardName = "Jsp";
		bu.uName = "accp";
		bu.uPass = "accp";
		bu.uSex = '��';
		board.getBoardInfo();
		bu.getUserInfo();

	}
}
