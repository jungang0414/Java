class Outside {
    int x = 10;

    class Inner {
        int y = 20;
    }
}


class NestClass {

    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inner inner = outside.new Inner();
        System.out.println(outside.x * inner.y);
    }
}