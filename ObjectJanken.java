/**
*オブジェクト指向によるジャンケンプログラム
*/
public class ObjectJanken
{
	public static void main(String[] args)
	{
		//審判のインスタンス生成
		Judge judgeMan = new Judge();
		
		//プレイヤー1の生成
		Player a = new Player("Mr.A");
		
		//プレイヤー2の生成
		Player b = new Player("Mr.B");
		
		//AさんとBさんがジャンケンを開始する
		judgeMan.startJanken(a, b);
	}
}