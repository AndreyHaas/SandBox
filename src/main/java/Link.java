import lombok.Data;

import java.math.BigDecimal;

@Data
public class Link {
    private Contract contract;

    private BigDecimal value;
}
