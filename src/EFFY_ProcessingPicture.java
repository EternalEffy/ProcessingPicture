import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class EFFY_ProcessingPicture {
    private int height;
    private int width;
    private int[] pixels;
    private String fileName;
    private BufferedImage picture;

    public BufferedImage loadPicture(String fileName){
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
        this.pixels = copyFromBufferedImage(picture);
        return picture;
        }

        private int[] copyFromBufferedImage(BufferedImage picture)  {
        pixels = new int[height*width];
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                pixels[i*width + j] = picture.getRGB(j, i) & 0xFFFFFF;
        return pixels;
        }


        public int returnColorDepth() {
            return 0;
        }


        int returnHeight(){
            return height;
        }
        int returnWidth(){
        return width;
        }
    public void returnPicture(){
        try {
            ImageIO.write(loadPicture(fileName),"jpg",new File("resultPicture.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

