package genealogy.filehandling;

import java.util.List;

public interface GenealogyFileHandler<T> {
    List<T> readFromFile(String fileName);

    void writeToFile(String fileName, List<T> entities);
}