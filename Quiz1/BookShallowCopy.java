package Quiz1;

import java.util.List;

public class BookShallowCopy extends Book {
    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookShallowCopy clone() {
        try {
            return (BookShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
