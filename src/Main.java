public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Превая книга
        Author author = new Author("Федор", "Достоевский");
        Book book = new Book("Преступление и наказание", author, 1866);
        System.out.println(book);
        System.out.println();
        //Вторая книга
        Author author2 = new Author("Александр", "Дюма");
        Book book2 = new Book("Граф Монте-Кристо", author2, 1846);
        System.out.println(book2);
        System.out.println();
        //Меняем год публикации
        book2.setYearPublication(1847);
        System.out.println(book2);
        System.out.println();
        //Сравним книги
        System.out.println(book.equals(book2));
        //Сравним авторов
        System.out.println(author.equals(author2));
        //сравним имена авторов
        System.out.println(author.getName().equals(author2.getName()));
    }
}