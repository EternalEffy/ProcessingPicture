import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.YELLOW;


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
        this.picture = picture;
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

    public void changePixel(Color YELLOW,int x, int y){
        int yellow = YELLOW.getRGB();
        picture.setRGB(x,y,yellow);
    }

    public Color colorOfPixel(int x, int y){
        return new Color(picture.getRGB(x,y));
    }

}

