package FactoryMethod;

class WebDialog extends Dialog{
    public Button createButton(){
        return new HTMLButton();
    }
}
