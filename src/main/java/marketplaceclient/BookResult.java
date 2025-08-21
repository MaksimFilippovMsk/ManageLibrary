package marketplaceclient;

import java.util.Objects;

public class BookResult {
    private String title;
    private int price;
    private String link;

    public BookResult(String title, int price, String link) {
        this.title = title;
        this.price = price;
        this.link = link;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BookResult that)) return false;
        return price == that.price && Objects.equals(title, that.title) && Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, link);
    }

    @Override
    public String toString() {
        return title + "   " + link + "    " + price;
    }
}
