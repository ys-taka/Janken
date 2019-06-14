/**
*ジャンケンの審判を表すクラス
*/

public class Judge
{
	/**
	*ジャンケンを開始する
	*
	*@param player1 判定対象プレイヤー1
	*@param player2 判定対象プレイヤー2
	*/
	public void startJanken(Player player1, Player player2)
	{
		//ジャンケンの開始を宣言する
		System.out.println("【ジャンケン開始】¥n");
		
		//ジャンケンを3回行う
		for (int cnt = 0; cnt < 3 ; cnt ++)
		{
			//何戦目かを表示する
			System.out.println("【" + (cnt + 1) + "回戦目】");
			
			//プレイヤーの手を見て、どちらが勝ちかを判定する
			Player winner = judgeJanken(player1, player2);
			if (winner ! = null)
			{
				//勝者を表示する
				System.out.println("¥n" + winner.getName() + "が勝ちました!¥n");
				
				//勝ったプレイヤーへ結果を伝える
			}
			else
			{
				//引き分けの時
				System.out.println("¥n引き分けです!¥n");
			}
		}
		
		//ジャンケンの終了を宣言する
		System.out.println("【ジャンケン終了】¥n");
				
		//最終的な勝者を判定する
		Player finalWinner = jadgeFinalWinner(player1, player2);
		
		//結果の表示
		System.out.println(
			Player1.getWinCount() + "対" + Player2.getWinCount() + "で");
			
		if(finalWinner != null)
		{
			System.out.println(finalWinner.getName() + "の勝ちです！¥n");
		}
		else
		{
			System.out.println("引き分けです！¥n");
		}
	}
	
	/**
	*「ジャンケン、ぽん！」と声をかけ、
	*プレイヤーの手を見て、どちらが勝ちかを判定する
	*
	*@param player1 判定対象プレイヤー1
	*@param player1 判定対象プレイヤー2
	*@return 勝ったプレイヤー	引き分けの場合はnullを返す。
	*/
	private Player judgeJnaken(Player player1, Player player2)
	{
		
	}
	
	/**
	*最終的な勝者を判定する
	*
	*@param player1 判定対象プレイヤー1
	*@param player1 判定対象プレイヤー2
	*@return 勝ったプレイヤー	引き分けの場合はnullを返す。
	*/
	private Player judgeFinalWinner(Player player1, Player player2)
	{
		player winner = null;
		//Player1から勝ち数を聞く
		
		//Player2から勝ち数を聞く
		
	}
	
	/**
	*ジャンケンの手を表示する
	*
	*@param hand ジャンケンの手
	*/
	private void printHand(int hand)
	{
		
	}
	
}