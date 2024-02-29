public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Превая книга
        Author author = new Author("Федор", "Достоевский");
        Book book = new Book("Преступление и наказание", author, 1866);
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println("Произведение: " + book.getName() + " " + ", публикация " + book.getYearPublication() + " года");
        //Вторая книга
        Author author2 = new Author("Александр", "Дюма");
        Book book2 = new Book("Граф Монте-Кристо", author2, 1846);
        System.out.println("Автор: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println("Произведение: " + book2.getName() + " " + ", публикация " + book2.getYearPublication() + " года");
        //Меняем год публикации
        book2.setYearPublication(1847);
        System.out.println("Произведение: " + book2.getName() + " " + ", публикация " + book2.getYearPublication() + " года");
    }
}