public class Main {
    public static void printPixel(Pixel p) {
        if (p instanceof TransparentPixel) {
            TransparentPixel tp = (TransparentPixel) p;
            System.out.printf("TransparentPixel<%d,%d,%d,%d>\n", tp.getR(), tp.getG(), tp.getB(), tp.getA());
        } else {
            System.out.printf("Pixel<%d,%d,%d>\n", p.getR(), p.getG(), p.getB());
        }
    }

    public static void main(String[] args) {
        Pixel p;
        p = new Pixel();
        printPixel(p);
        p = new Pixel(100, 50, 254);
        printPixel(p);
        p = new Pixel("#A2F355");
        printPixel(p);
        System.out.println(p.setR(10));
        System.out.println(p.setR(-10));
        TransparentPixel tp;
        tp = new TransparentPixel();
        printPixel(tp);
        tp = new TransparentPixel(10, 255, 50, 33);
        printPixel(tp);
        tp = new TransparentPixel("#FF00FF11");
        printPixel(tp);
        tp = new TransparentPixel("#00FFFF");
        printPixel(tp);
        System.out.println(tp.setA(256));
    }
}
