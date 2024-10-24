public class TransparentPixel extends Pixel{
    //Ali Abdollahian Noghabi 
    //9913062
    private int a;
    private final int default_a=255;
    String hexadecimal;
    public TransparentPixel(int r, int g, int b, int a){
        super(r,g,b);
        this.a=a;
    }
    public TransparentPixel(int r, int g, int b){
        super(r,g,b);
        this.a=default_a;
    }
    public TransparentPixel(String hexadecimal){
        super(hexadecimal);

        if(hexadecimal.length()==9){
            String aString = hexadecimal.substring(7, 9);
            this.a=Integer.parseInt(aString,16);
        }
        if(hexadecimal.length()==7){
            this.a=default_a;
        }
    }
    public TransparentPixel(){
        this.a=default_a;
    }

    int getA(){
        return this.a;
    } 

    boolean setA(int a){
        if(a<=255 && a>=0)
        {
            this.a=a;
            return true;
        }
        return false;
    }
}
