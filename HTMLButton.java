package FactoryMethod;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("<button> Click Me</button>");
    }

    @Override
    public void onClick(String event) {
        System.out.println("You clicked the HTML button:");
    }
}
