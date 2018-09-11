import java.util.ArrayList;
import java.util.List;

public class FlatteningList {

    private List<Object> list;
    private List<Object> output;

    public FlatteningList(List<Object> list) {
        this.list = list;
        this.output = new ArrayList<Object>();
    }

    public List<Object> getFlatList() {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof List) {
                for (int x = 0; x < ((List) list.get(i)).size(); x++) {
                    output.add(((List) list.get(i)).get(x));
                }
            }
            else output.add(list.get(i));
        }
        return this.output;
    }
}
