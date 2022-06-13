public class NumbersGame {

public  void askNumber(){
        int target=24;

        //解答できる数
        int limit=5;
        while(limit>0){
        System.out.println("予想した数を入力してください : ");
		int inputNumber = KeyBoard.inputNumber();
        if(target==inputNumber){
        System.out.println("正解！");
        break;
        }else{
        System.out.println("違います");
        int diff=target-inputNumber;
        if(diff>0){
        System.out.println("設定値より小さいです");
        }else {
        System.out.println("設定値より大きいです");

        }
        if(Math.abs(diff)>20){
        System.out.println("20以上差があります");
        }
        }

        limit--;
        }
}
public static void main(String[] args) {

    NumbersGame n = new NumbersGame();
    n.askNumber(); // 単語の入力

}
}

