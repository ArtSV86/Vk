package domain;

public class Post {

    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count = 20;
    private int offset;
    private int postId;
    private PostSource PostSource;

    private LikesInfo[] LikesInfo;

    public LikesInfo[] LikesInfo() {
        // TODO: add logic
        return null;
    }

    private CommentsInfo[] commentsInfo;

    public CommentsInfo[] commentsInfo() {
        // TODO: add logic
        return null;
    }


    private Articles[] articles;

    public Articles[] articles() {
        // TODO: add logic
        return null;
    }

    private Header[] headers;

    public Header[] headers() {
        // TODO: add logic
        return null;
    }


    private Subscribers[] subscribers;

    public Subscribers[] subscribers() {
        // TODO: add logic
        return null;
    }


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}