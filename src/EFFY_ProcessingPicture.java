import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class EFFY_ProcessingPicture {
    private int height;
    private int width;
    private String fileName;
    private BufferedImage picture;
    private int pixelBits;


    public void loadPicture(String fileName){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.height = picture.getHeight();
        this.width  = picture.getWidth();
        this.fileName = fileName;
        this.picture = picture;
        }


        public int сolorDepth() {
        int pixelBits = picture.getColorModel().getPixelSize();
        this.pixelBits=pixelBits;
        return pixelBits;
        }

        public long resolutionOfMatrix(){
        long resolution = height*width;
        return resolution;
        }

        public long sizeOfMatrix(){
        long size = height*width*pixelBits;
        return size;
        }

        int returnHeight(){
        return height;
        }
        int returnWidth(){
        return width;
        }
    public void writePicture(){
        try {
            ImageIO.write(picture,"jpg",new File("resultPicture.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changePixel(Color yourColor, int x, int y){
        int color = yourColor.getRGB();
        picture.setRGB(x,y,color);
    }

    public Color colorOfPixel(int x,int y){
        Color color = new Color(picture.getRGB(x,y));
       return color;
    }

}

