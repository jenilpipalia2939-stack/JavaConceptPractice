package NestedClasses.InnerClassOuterClass;

public class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    class Book {
        public String getLibraryName() {
            return libraryName;
        }
    }

    public static void main(String[] args) {
        Library lib1 = new Library("library1");
        Library lib2 = new Library("library2");
        Library.Book book1 = lib1.new Book();
        Library.Book book2 = lib1.new Book();
        System.out.println(book1.getLibraryName());
        System.out.println(book2.getLibraryName());
    }


}
