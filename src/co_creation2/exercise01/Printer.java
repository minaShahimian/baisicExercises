package co_creation2.exercise01;

import co_creation2.exercise05.Magazine;

import java.util.List;

public class Printer {
    public void printerArticle(Article article) {
        String Text = article.getText();
        String Title = article.getTitle();
        System.out.println("The Title is:" + Title);
        System.out.println("The Text is:" + Text);
    }

    public void printMagazine(Magazine magazine) {
        String magazineTitle = magazine.getTitle();
        System.out.println(magazineTitle);
        List<Article> magazineArticles = magazine.getArticles();
        for (Article article : magazineArticles) {
            printerArticle(article);
        }

    }

}
