public class NumbersGame {

public int inputPositiveNumber(){
		int inputNumber = KeyBoard.inputNumber();

        while(inputNumber<0||inputNumber>100){
        System.out.println("値が相応しくありません。もう一度、2桁の整数を入力してください");
		inputNumber = KeyBoard.inputNumber();
        }
        return inputNumber;
}

public  void askNumber(){
        int target=24;
        System.out.println("数当てゲームを始めます");
        System.out.println("2桁の整数を入力してください :");

        //解答できる数
        int limit=5;
        while(limit>0){
        int inputNumber=inputPositiveNumber();
        if(target==inputNumber){
        System.out.println("正解！ゲームクリアです");
        break;
        }else{
        System.out.println("不正解...");
        int diff=target-inputNumber;
        if(diff>0){
        System.out.println("→ 正解値より小さいです");
        }else {
        System.out.println("→ 正解値より大きいです");

        }
        if(Math.abs(diff)>20){
        System.out.println("→ 20以上差があります");
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

