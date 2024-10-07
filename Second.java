class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        // 因為是私有變數所以無法直接修改，需要透過類別中公開的方法來取得變數值或修改變數值
        // myObj.result = 20; // error: result has private access in Main
        // System.out.println(myObj.result); // error: result has private access in Main
        myObj.setNum(20);
        System.out.println(myObj.getNum()); // 20
    }
}