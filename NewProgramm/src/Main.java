public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        String filename = "output.txt";
        String text = "Пример текста";

        try {
            processor.writeToFile(filename, text);
            System.out.println("Запись прошла успешно!");

            String content = processor.readFromFile(filename);
            System.out.println("Прочитанное из файла:");
            System.out.println(content);
        } catch (FileProcessingException e) {
            System.out.println("Произошла ошибка:");
            e.printStackTrace();
        }
    }
}