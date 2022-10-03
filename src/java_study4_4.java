class Rectangle1 {
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle1(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    public int square() {
        return (width*height);
    }
    boolean contains(Rectangle1 r) {
        if(x < r.x && y < r.y)
            if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
                return true;
        return false;
    }
}

public class java_study4_4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rectangle1 r = new Rectangle1(2, 2, 8, 7);
        Rectangle1 s = new Rectangle1(5, 5, 6, 6);
        Rectangle1 t = new Rectangle1(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }

}