package africa.semicolon.blog.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document("Views")
public class View {
    @Id
    private String id;
    private LocalDateTime dateCreated = LocalDateTime.now();
    @DBRef
    private User viewers;
}
