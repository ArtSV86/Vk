package Manager;

import domain.*;

public class PostManager {
    private Post[] posts;
    private SearchManager searchManager;
    private DeleteManager deleteManager;


    public String getPosts() {
        Post[] posts = searchManager.search();
        return null;
    }

    public void delete() {
        Post[] posts = deleteManager.delete();
    }

}

