package five.year.design.模板方法;

/**
 * @Date 2022/10/3 14:23
 * @Created by ltc
 */

public abstract class AbstractAlgorithm {
    public abstract void openFridgeDoor();

    public abstract void putAnimalInFridge();

    public abstract void closeFridgeDoor();

    public void execute() {
        this.openFridgeDoor();
        this.putAnimalInFridge();
        this.closeFridgeDoor();
    }
}
