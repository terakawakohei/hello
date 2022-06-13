public class NumbersGame {
    public static final int UPPER_LIMIT = 100;
    public static final int LOWER_LIMIT = 0;
    public static final int TARGET = 24;
    public static final int LIMIT_NUM = 5;

    public int inputPositiveNumber() {
        int inputNumber = KeyBoard.inputNumber();

        while (inputNumber < LOWER_LIMIT || inputNumber > UPPER_LIMIT) {
            System.out.println("値が相応しくありません。もう一度、2桁の整数を入力してください");
            inputNumber = KeyBoard.inputNumber();
        }
        return inputNumber;
    }

    public void askNumber() {
        int target = TARGET;
        System.out.println("数当てゲームを始めます");
        System.out.println("2桁の整数を入力してください :");

        // 解答できる数
        int limit = LIMIT_NUM;

        // 挑戦回数がなくなるまで繰り返し
        while (limit > 0) {
            System.out.println("2桁の整数を入力してください (残り: " + limit + "回)");
            int inputNumber = inputPositiveNumber();

            if (target == inputNumber) {
                System.out.println("当たり");
                // 終了
                break;
            } else {
                System.out.println("不正解...");

                limit--;
                // 挑戦権がなくなったら、終了
                if (limit == 0) {
                    System.out.println("-----------------------------------");
                    System.out.println("-----------------------------------");
                    System.out.println("-----------------------------------");

                    System.out.println("正解の値は..." + target + "でした");
                    System.out.println("挑戦可能回数が0になったため、終了します");
                    break;
                }

                // diff:目標値と入力値のずれ
                int diff = target - inputNumber;
                System.out.println("----------------ヒント-------------");

                if (diff > 0) {
                    System.out.println("→ 正解値より小さいです");
                } else {
                    System.out.println("→ 正解値より大きいです");

                }
                if (Math.abs(diff) > 20) {
                    System.out.println("→ 20以上差があります");
                }

            }

            System.out.println("-----------------------------------");

        }
    }

    public static void main(String[] args) {

        NumbersGame n = new NumbersGame();
        n.askNumber();
    }
}
