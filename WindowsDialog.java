package FactoryMethod;

class WindowsDialog extends Dialog{
    public Button createButton(){
        return new WindowsButton();
    }
}
