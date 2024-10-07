// private 
public class Main {
    private int result = 10;

    public int getNum() {
        return result;
    }

    // 這裡的this用來明確表示正在訪問類別的result屬性
    public int setNum(int value) {
        this.result = value;
        return this.result;
    }
}