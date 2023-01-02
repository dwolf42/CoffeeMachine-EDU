class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        String[] getAuthors = new String[this.authors.length];
        System.arraycopy(this.authors, 0, getAuthors, 0, this.authors.length);
        return getAuthors;
    }

    public void setAuthors(String[] authors) {
        String[] setAuthors = new String[authors.length];
        System.arraycopy(authors, 0, setAuthors, 0, authors.length);
        this.authors = setAuthors;
    }
}