package assignments.entity;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private int[] rates;
    private float averageRate;

    public News(String title, String publishDate, String author, String content, int[] rates) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("News{" +
                "title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}');
    }

    @Override
    public float calculate() {
        int sum = 0;
        for (int rate : rates) {
            sum += rate;
        }
        averageRate = (float) sum / rates.length;
        return averageRate;
    }
}
