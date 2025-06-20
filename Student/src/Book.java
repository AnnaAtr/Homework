public class Book {
        String title;
        int pages;
        int year;

        public Book(String title, int pages, int year) {
            this.title = title;
            this.pages = pages;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " (" + year + ", " + pages + " стр)";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Book)) return false;
            Book other = (Book) obj;
            return title.equals(other.title) && pages == other.pages && year == other.year;
        }

        @Override
        public int hashCode() {
            return title.hashCode() + pages + year;
        }
}
