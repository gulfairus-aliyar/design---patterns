package FactoryMethod;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.render();
    }
    abstract Button createButton();
}
