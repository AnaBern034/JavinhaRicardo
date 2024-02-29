import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class DocumentCollege {
    private String name;
    private String parents;
    private LocalDate dayBith;
    private List<Grade> grade;

    public DocumentCollege(String name, LocalDate dayBith) {
        this.name = name;
        this.dayBith = dayBith;
    }

    public DocumentCollege(String name, String parents, LocalDate dayBith) {
        this.name = name;
        this.parents = parents;
        this.dayBith = dayBith;
    }
}