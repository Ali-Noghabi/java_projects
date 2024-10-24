public class Pixel {
    // Ali Abdollahian Noghabi
    // 9913062
    private static final int default_r = 0, default_g = 0, default_b = 0;
    private int r, g, b;
    private String hexa;

    public Pixel() {
        this.r = default_r;
        this.b = default_b;
        this.g = default_g;
    }

    public Pixel(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Pixel(String hexadecimal) {
        this.hexa = hexadecimal;

        String rString = hexadecimal.substring(1, 3);
        this.r = Integer.parseInt(rString, 16);

        String gString = hexadecimal.substring(3, 5);
        this.g = Integer.parseInt(gString, 16);

        String bString = hexadecimal.substring(5, 7);
        this.b = Integer.parseInt(bString, 16);
    }

    int getR() {
        return r;
    }

    int getG() {
        return g;
    }

    int getB() {
        return b;
    }

    boolean setR(int r) {
        if (r <= 255 && r >= 0) {
            this.r = r;
            return true;
        }
        return false;
    }

    boolean setG(int g) {
        if (g <= 255 && g >= 0) {
            this.g = g;
            return true;
        }
        return false;
    }

    boolean setB(int b) {
        if (b <= 255 && b >= 0) {
            this.b = b;
            return true;
        }
        return false;
    }

    void grayscale() {
        double grayscale = this.r * 0.2126 + this.g * 0.7152 + this.b * 0.0722;
        this.r = (int) grayscale;
        this.g = (int) grayscale;
        this.b = (int) grayscale;
    }
}
