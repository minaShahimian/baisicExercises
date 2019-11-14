package co_creation2.exercise05;


import co_creation2.exercise01.Article;

public class Editor {
    public Magazine writeMagazine() {
        Magazine nature = new Magazine("Nature");
        nature.add(new Article("Caspian see", "please take care of Caspian see."));
        nature.add(new Article("Parishoon see", "please take care of Parishoon see."));
        return nature;
    }

}
