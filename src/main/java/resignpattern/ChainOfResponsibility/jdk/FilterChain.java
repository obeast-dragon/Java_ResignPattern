
package resignpattern.ChainOfResponsibility.jdk;
import java.util.ArrayList;
import java.util.List;


public class FilterChain { //过滤器链

    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
