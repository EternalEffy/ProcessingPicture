import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class EFFY_ProcessingPicture {
    private int height;
    private int width;
    private String fileName;
    private BufferedImage picture;
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
        this.resolutionOfMatrix = height*width;
        this.fileName = fileName;
        this.picture = picture;
        }

        public int сolorDepth() {
        return picture.getColorModel().getPixelSize();
        }

        public long resolutionOfMatrix(){
        return resolutionOfMatrix;
        }

        public long sizeOfMatrix(){
        return height*width*(resolutionOfMatrix());
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

    public void setPixel(int yourColor,int x, int y){
        picture.setRGB(x,y,yourColor);

    }

    public int colorOfPixel(int x, int y){
        return picture.getRGB(x,y);
    }

}

