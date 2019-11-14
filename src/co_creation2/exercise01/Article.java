package co_creation2.exercise01;

public class Article {
    private String Text;
    private String Title;

    public Article(String text, String title) {
        Text = text;
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public String getTitle() {
        return Title;
    }
}
