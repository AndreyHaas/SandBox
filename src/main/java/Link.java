import java.math.BigDecimal;

public class Link {
    private Contract contract;

    private BigDecimal value;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Link{" +
                "contract=" + contract +
                ", value=" + value +
                '}';
    }
}
