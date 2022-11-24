package resignpattern.ChainOfResponsibility.jdk.filter;

import resignpattern.ChainOfResponsibility.jdk.FilterChain;
import resignpattern.ChainOfResponsibility.jdk.Request;
import resignpattern.ChainOfResponsibility.jdk.Response;

public interface Filter {
    public void doFilter(Request req, Response res, FilterChain c);
}
