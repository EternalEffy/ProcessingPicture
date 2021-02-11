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
    private long sizeMatrix;
    private long resolutionOfMatrix;


    public void loadPicture(String fileName){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.height = picture.getHeight();
        this.width  = picture.getWidth();
        this.sizeMatrix = height*width*pixelBits;
        this.resolutionOfMatrix = height*width;
        this.fileName = fileName;
        }


        public int сolorDepth() {
        this.pixelBits=picture.getColorModel().getPixelSize();;
        return pixelBits;
        }

        public long resolutionOfMatrix(){
        return resolutionOfMatrix;
        }

        public long sizeOfMatrix(){
        return sizeMatrix;
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
        picture.setRGB(x,y,yourColor.getRGB());
    }

    public void colorOfPixel(int x, int y){
       picture.getRGB(x,y);
    }

}

