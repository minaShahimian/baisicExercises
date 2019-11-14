package co_creation2.exercise01;

public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("Heute ist guter tag zu lernen .", "programmiren");
        Printer printer = new Printer();
        printer.printerArticle(article);
    }
}
