import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String [] args){
    EFFY_ProcessingPicture picture = new EFFY_ProcessingPicture();

    System.out.println("Введите название файла изображения:");
        Scanner console = new Scanner(System.in);
        picture.loadPicture(console.nextLine());
        picture.returnPicture();
        System.out.println(picture.returnHeight());
        System.out.println(picture.returnWidth());

    }
}
