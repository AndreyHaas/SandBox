import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class AppTest {

    @InjectMocks
    private App underTest;

    @Test
    void compareAndGetNoIdenticalIdsFromFirstLinksTest() {
        Link link1 = new Link();
        link1.setValue(BigDecimal.ONE);
        Contract contract1 = new Contract();
        contract1.setId(1L);
        link1.setContract(contract1);

        Link link2 = new Link();
        link2.setValue(BigDecimal.valueOf(2));
        Contract contract2 = new Contract();
        contract2.setId(2L);
        link2.setContract(contract2);

        Link link3 = new Link();
        link3.setValue(BigDecimal.valueOf(3));
        Contract contract3 = new Contract();
        contract3.setId(3L);
        link3.setContract(contract3);

        List<Link> aCollection = new ArrayList<>();
        aCollection.add(link1);
        aCollection.add(link2);
        aCollection.add(link3);

        Link link4 = new Link();
        link4.setValue(BigDecimal.valueOf(4));
        Contract contract4 = new Contract();
        contract4.setId(4L);
        link4.setContract(contract4);

        Link link5 = new Link();
        link5.setValue(BigDecimal.ONE);
        Contract contract5 = new Contract();
        contract5.setId(1L);
        link5.setContract(contract5);

        Link link6 = new Link();
        link6.setValue(BigDecimal.valueOf(6));
        Contract contract6 = new Contract();
        contract6.setId(6L);
        link6.setContract(contract6);

        List<Link> bCollection = new ArrayList<>();
        bCollection.add(link4);
        bCollection.add(link5);
        bCollection.add(link6);

        Set<Long> idsFromFirstLinks = underTest.compareAndGetNoIdenticalIdsFromFirstCollection(bCollection, aCollection);

        Assertions.assertEquals(2, idsFromFirstLinks.size());
    }
}