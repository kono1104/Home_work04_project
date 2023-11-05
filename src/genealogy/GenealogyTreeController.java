package genealogy;

import genealogy.filehandling.FileGenealogyHandler;
import genealogy.filehandling.GenealogyFileHandler;
import genealogy.model.Person;

import java.util.Scanner;

public class GenealogyTreeController {
    private GenealogyTree<Person> genealogyTree;

    public GenealogyTreeController(GenealogyTree<Person> genealogyTree) {
        this.genealogyTree = genealogyTree;
    }

    public void startInteractiveSession() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Введите команду (add, search, print, exit):");
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "add":
                    // Логика добавления новой сущности
                    break;
                case "search":
                    // Логика поиска сущности
                    break;
                case "print":
                    // Логика вывода информации о сущностях
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Неверная команда. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        GenealogyFileHandler<Person> fileHandler = new FileGenealogyHandler<>();
        GenealogyTree<Person> genealogyTree = new GenealogyTree<>();
        GenealogyTreeController controller = new GenealogyTreeController(genealogyTree);
        controller.startInteractiveSession();
    }
}