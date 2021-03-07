package FactoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows-style button");
    }

    @Override
    public void onClick(String event) {
        System.out.println(event + "has been executed:");
    }
}
