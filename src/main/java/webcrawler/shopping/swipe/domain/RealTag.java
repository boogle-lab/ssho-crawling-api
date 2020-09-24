package webcrawler.shopping.swipe.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealTag {
    private String id;
    private String name;
    private String expTagId;
    private Float[] embedding;
}
