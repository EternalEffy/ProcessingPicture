import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String [] args){
    EFFY_ProcessingPicture picture = new EFFY_ProcessingPicture();

    System.out.println("Введите название файла изображения:");
        Scanner console = new Scanner(System.in);
        picture.loadPicture(console.nextLine());

        /*for(int x=0;x< picture.returnWidth();x++){
            for (int y=0;y< picture.returnHeight();y++){
                picture.changePixel(Color.YELLOW,x,y);
            }
        }*/

       for(int y=0;y<picture.returnHeight();y++){
            for (int x=0;x< picture.returnWidth();x++)
                if (picture.colorOfPixel(x, y) == -131072) {
                    picture.setPixel(0x00FFFF00, x, y);
                }
            }

       ;
        picture.writePicture();
        System.out.println(picture.returnHeight());
        System.out.println(picture.returnWidth());
        System.out.println(picture.сolorDepth());
        System.out.println(picture.resolutionOfMatrix());
        System.out.println(picture.sizeOfMatrix());


    }
}
