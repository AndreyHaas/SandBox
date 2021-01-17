import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    private App(){}

    public Set<Long> compareAndGetNoIdenticalIdsFromFirstCollection(List<Link> firstLinks, List<Link> secondLinks) {
        List<Long> firstLinkContractIds = new ArrayList<>();
        List<Long> secondContractIds = new ArrayList<>();

        for (Link firstLink : firstLinks) {
            firstLinkContractIds.add(firstLink.getContract().getId());
        }

        for (Link secondLink : secondLinks) {
            secondContractIds.add(secondLink.getContract().getId());
        }

        Set<Long> noIdenticalId = new HashSet<>();

        for (Long firstLinkContractId : firstLinkContractIds) {
            for (Long secondContractId : secondContractIds) {
                if (!firstLinkContractId.equals(secondContractId)) {
                    noIdenticalId.add(firstLinkContractId);
                } else {
                    noIdenticalId.remove(firstLinkContractId);
                    break;
                }
            }
        }

        return noIdenticalId;
    }
}
