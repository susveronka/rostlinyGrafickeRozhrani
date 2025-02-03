import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        RostlinyFrame frame = new RostlinyFrame();
        frame.setVisible(true);

        List <Rostlina> rostliny = new ArrayList<>();

      Rostlina rostlina = new Rostlina("květinka", "lorem");
      Rostlina rostlina2 = new Rostlina("kytka", "lorem");

      rostliny.add(rostlina);
      rostliny.add(rostlina2);



    }


}