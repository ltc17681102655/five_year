package five.year.design.模板方法;

/**
 * @Date 2022/10/3 14:24
 * @Created by ltc
 */

public class PutElephantInFridge extends AbstractAlgorithm {

    @Override
    public void openFridgeDoor() {
        System.out.println("open the fridge door lightly");
    }

    @Override
    public void putAnimalInFridge() {
        System.out
                .println("try my best to put elephant in fridge,after 2 hours, I got it.");
    }

    @Override
    public void closeFridgeDoor() {
        System.out.println("close the fridge door...");
    }

}
