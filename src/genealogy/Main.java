package genealogy;

import genealogy.filehandling.FileGenealogyHandler;
import genealogy.filehandling.GenealogyFileHandler;
import genealogy.model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenealogyFileHandler<Person> fileHandler = new FileGenealogyHandler<>();
        GenealogyTree<Person> genealogyTree = new GenealogyTree<>();
        GenealogyTreeController controller = new GenealogyTreeController(genealogyTree);
        controller.startInteractiveSession();
    }
}